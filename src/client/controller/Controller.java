package client.controller;

import client.controller.buttons.login.LoginHandler;
import client.controller.buttons.login.SignUpHandler;
import client.model.MainModel;
import client.view.LogIn;

public class Controller {

    private MainModel clientModel;
    public LogIn clientView;

    public Controller(MainModel model, LogIn view){
        clientModel = model;
        clientView = view;
        clientView.setLogInActionListener(new LoginHandler(clientView));
        clientView.setSignUpActionListener(new SignUpHandler(clientView));
        clientView.setVisible(true);
    }
}
