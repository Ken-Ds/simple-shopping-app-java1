package client.model.buttons.login;

import client.model.Connect;
import client.view.LogIn;
import client.view.SignUp;
import client.view.UserView;
import common.Account;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpHandler implements ActionListener {

    private LogIn logIn;

    public SignUpHandler(LogIn logIn) {
        this.logIn = logIn;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        logIn.dispose();
        new SignUp().setVisible(true);
    }
}