package server;

import java.util.Scanner;
public class ServerController {
    private ServerModel adminModel;
    public  ServerView adminView;
    private Scanner kbd = new Scanner(System.in);
    public ServerController(ServerModel model, ServerView view){
        model = adminModel;
        view = adminView;
        view.showAdminMenu();
        int choice = Integer.parseInt(kbd.nextLine());
        switch(choice){
            case 1:
                break;
            case 2:
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
