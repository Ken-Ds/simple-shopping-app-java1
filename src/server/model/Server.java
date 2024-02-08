package server.model;
import java.net.ServerSocket;
import java.net.Socket;

public class Server{

    public void startServer(){
        int port = 2000;
        System.out.println("Server is running");
        try(ServerSocket ServerSocket = new ServerSocket(port)){
            while (true){
                Socket clientSocket = ServerSocket.accept();
                System.out.println("New Connection");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}