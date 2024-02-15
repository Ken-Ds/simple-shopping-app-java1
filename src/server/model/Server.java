package server.model;
import client.model.CheckIfUser;
import common.Account;
import common.ParseXMLFile;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public void startServer() {
        int port = 2023;
        System.out.println("Server is running");
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            while (true) {
                Socket clientSocket = serverSocket.accept();

                if (clientSocket.isConnected()) {
                    System.out.println("Client is connected!");
                }

                // TODO Move logic to a different class
                ObjectInputStream reader = new ObjectInputStream(clientSocket.getInputStream());
                ObjectOutputStream writer = new ObjectOutputStream(clientSocket.getOutputStream());

                Account account = (Account) reader.readObject();
                CheckIfUser authenticator = new CheckIfUser();
                if (authenticator.authenticate(account)) {
                    System.out.println("Authenticated");
                } else {
                    System.out.println("No Account Found!");
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}