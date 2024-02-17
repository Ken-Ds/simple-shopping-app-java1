package server.model;
import client.controller.Controller;
import client.model.AddUser;
import client.model.CheckIfUser;
import client.model.MainModel;
import client.view.MainView;
import common.Account;
import common.ParseXMLFile;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public int port = 2023;

    public void startServer() {
        System.out.println("Server is running");
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            while (true) {
                Socket clientSocket = serverSocket.accept();
                if (clientSocket.isConnected()) {
                    System.out.println("Client is connected!");
                }

                Thread clientHandler = new ClientHandler(clientSocket);
                clientHandler.start();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public class ClientHandler extends Thread{
        private final Socket clientSocket;

        public ClientHandler(Socket socket){
            this.clientSocket = socket;
        }
        @Override
        public void run(){
            try (
                    ObjectInputStream reader = new ObjectInputStream(clientSocket.getInputStream());
                    ObjectOutputStream writer = new ObjectOutputStream(clientSocket.getOutputStream());
            )
            {
                Account account = (Account) reader.readObject();
                CheckIfUser authenticator = new CheckIfUser();

                if (authenticator.authenticate(account)) {
                    System.out.println("Authenticated");
                    writer.writeObject(true);
                } else {
                    System.out.println("No Account Found!");
                    writer.writeObject(false);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}