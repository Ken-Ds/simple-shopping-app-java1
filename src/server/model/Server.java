package server.model;
import common.Account;
import common.ParseXMLFile;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server{

    public void startServer(){
        int port = 2000;
        System.out.println("Server is running");
        try(ServerSocket ServerSocket = new ServerSocket(port)){
            while (true){
                Socket clientSocket = ServerSocket.accept();

                if(clientSocket.isConnected()){
                    System.out.println("Client is connected!");
                }


                // TODO Move logic to a different class
                ObjectInputStream reader = new ObjectInputStream(clientSocket.getInputStream());
                ObjectOutputStream writer = new ObjectOutputStream(clientSocket.getOutputStream());

                Account account = (Account) reader.readObject();
                String username = account.getUsername();
                String password = account.getPassword();
                ParseXMLFile parseXMLFile = new ParseXMLFile();
                if(parseXMLFile.checkAccount(username, password)){
                    System.out.println("Authenticated");
                }else {
                    System.out.println("No Account Found!");
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}