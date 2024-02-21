package client.model;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Connect {

    private int port = 2023;

    private static Socket socket;
    private static ObjectOutputStream out;
    private static ObjectInputStream in;

    public void createConnection() throws IOException{
        try{
            socket = new Socket("localhost",port);
            out = new ObjectOutputStream(socket.getOutputStream());
            in = new ObjectInputStream(socket.getInputStream());
            System.out.println("Connected to Server");
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    public void sendMessage(Object message) throws IOException {
        out.writeObject(message);
    }

    public Object receiveMessage() throws Exception{
        return in.readObject();
    }
}
