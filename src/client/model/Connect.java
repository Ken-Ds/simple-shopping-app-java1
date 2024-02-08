package client.model;

import java.net.Socket;

public class Connect {
    public void createConnection(){
        int port = 2000;
        try(
                Socket client = new Socket("localhost",port);
                ){

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
