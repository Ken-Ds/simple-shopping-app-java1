package client.controller.buttons.login;

import client.controller.buttons.signup.BackButtonHandler;
import client.controller.buttons.signup.SignHandler;
import client.view.LogIn;
import client.view.SignUp;

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
        SignUp signUp = new SignUp();
        signUp.setBtnSignUpActionListener(new SignHandler(signUp));
        signUp.setButtonBackActionListener(new BackButtonHandler(signUp));
        signUp.setVisible(true);
    }
}