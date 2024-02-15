package client.model;

import java.net.Socket;

public class Connect {

    public Socket  createConnection(){
        Socket client = null;
        int port = 2000;
        try{
            client = new Socket("localhost",port);
        } catch (Exception e){
            e.printStackTrace();
        }

        return client;
    }
}
