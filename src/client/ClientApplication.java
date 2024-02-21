package client;

import client.controller.Controller;
import client.model.MainModel;
import client.view.MainView;

public class ClientApplication {
    public static void main(String[] args) {
        MainModel model = new MainModel();
        MainView view = new MainView();
        Controller controller = new Controller(model,view);
    }
}
