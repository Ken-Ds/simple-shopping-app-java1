package server;

import server.controller.Controller;
import server.model.MainModel;
import server.model.Server;
import server.view.MainView;

public class ServerApplication{
    public static void main(String[] args){
        MainModel model = new MainModel();
        MainView view = new MainView();
        Controller controller = new Controller(model,view);
    }
}