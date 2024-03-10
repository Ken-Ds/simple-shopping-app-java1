package client;

import client.controller.Controller;
import client.model.MainModel;
import client.view.LogIn;

public class ClientApplication {
    public static void main(String[] args) {
        MainModel model = new MainModel();
        LogIn view = new LogIn();
        Controller controller = new Controller(model,view);
    }
}
