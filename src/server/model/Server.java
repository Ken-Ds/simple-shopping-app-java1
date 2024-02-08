package server.model;

import java.io.ServerSocket;
import java.io.Socket;

public class Server{

    public void startServer(){
        int port = 2000;

        try(ServerSocket ServerSocket = new ServerSocket(port)){
            
            while (true){
                Socket clientSocket = ServerSocket.accept();

                Thread thread = new
            }
        }
    }

    public class ClientHandler extends Thread{
        private final Socket clientSocket;

        public ClientHandler(Socket socket){
            this.clientSocket = socket;
        }

        @Override
        public void run(){
    
        }
    }

}