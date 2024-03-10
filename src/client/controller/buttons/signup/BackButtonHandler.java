package client.controller.buttons.signup;
import client.controller.buttons.login.LoginHandler;
import client.controller.buttons.login.SignUpHandler;
import client.view.LogIn;
import client.view.SignUp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BackButtonHandler implements ActionListener {

    private SignUp signUp;

    public BackButtonHandler(SignUp signUp) {
        this.signUp = signUp;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        signUp.dispose();
        LogIn logIn = new LogIn();
        logIn.setLogInActionListener(new LoginHandler(logIn));
        logIn.setSignUpActionListener(new SignUpHandler(logIn));
        logIn.setVisible(true);
    }

}