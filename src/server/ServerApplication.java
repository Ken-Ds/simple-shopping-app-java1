package server;

import server.controller.Controller;
import server.model.MainModel;
import server.view.AdminView;

public class ServerApplication{
    public static void main(String[] args){
        MainModel model = new MainModel();
        AdminView view = new AdminView();
        Controller controller = new Controller(model,view);
    }
}