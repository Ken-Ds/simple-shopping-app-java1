package server.model;
import common.*;
import org.w3c.dom.NodeList;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

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
            ) {
                Account account = null;
                String string = (String) reader.readObject();
                switch (string) {
                    case "Login":
                        String name = (String) reader.readObject();
                        int id = new ParseXMLFile().returnUserID(name);
                        System.out.println(id);
                        writer.writeObject(id);
                        account = (Account) reader.readObject();

                        CheckIfUser authenticator = new CheckIfUser();

                        if (authenticator.authenticate(account)) {
                            System.out.println("Authenticated");
                            writer.writeObject(true);
                        } else {
                            System.out.println("No Account Found!");
                            writer.writeObject(false);
                        }


                        break;
                    case "Signup":
                        Account signAccount = (Account) reader.readObject();
                        System.out.println(signAccount);
                        AddUser addUser = new AddUser();
                        addUser.addAccount(signAccount.getUsername(), signAccount.getPassword());
                        break;

                    case "Cart":
                        Account accountCart = (Account) reader.readObject();
                        Cart cart = (Cart) reader.readObject();
                        new ParseXMLFile().addProductsToCart(String.valueOf(accountCart.getId()), cart);
                        break;
                    case "DCart":
                        int userID = (int) reader.readObject();
                        String deleteName = (String) reader.readObject();
                        new ParseXMLFile().deleteCartProduct(String.valueOf(userID), deleteName);
                        NodeList dCartNodes = new ParseXMLFile().getUserCart(String.valueOf(userID));
                        ArrayList<Product> dCArtArrayList = new NodeListToArrayList().productArrayList(dCartNodes);
                        writer.writeObject(dCArtArrayList);
                        break;
                    case "ViewP":
                        NodeList nodes = new ParseXMLFile().readXMLProduct();
                        NodeListToArrayList nodeListToArrayList = new NodeListToArrayList();
                        ArrayList<Product> arrayList = nodeListToArrayList.productArrayList(nodes);
                        writer.writeObject(arrayList);
                        break;
                    case "VPLSearch":
                        NodeList nodesVPL = new ParseXMLFile().readXMLProduct();
                        ArrayList<Product> vPLArrayList = new NodeListToArrayList().productArrayList(nodesVPL);
                        writer.writeObject(vPLArrayList);
                        break;
                    case "ViewC":
                        int viewCID = (int) reader.readObject();
                        NodeList viewCNodes = new ParseXMLFile().getUserCart(String.valueOf(viewCID));
                        ArrayList<Product> vCArrayList = new NodeListToArrayList().productArrayList(viewCNodes);
                        writer.writeObject(vCArrayList);
                        break;
                    case "VCSearchBack":
                        int vcSearchBackID = (int) reader.readObject();
                        NodeList vCSearchBack = new ParseXMLFile().getUserCart(String.valueOf(vcSearchBackID));
                        ArrayList<Product> vcSearchBackArrayList = new NodeListToArrayList().productArrayList(vCSearchBack);
                        writer.writeObject(vcSearchBackArrayList);
                        break;
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}