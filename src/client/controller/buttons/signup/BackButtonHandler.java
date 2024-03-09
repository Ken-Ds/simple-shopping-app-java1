package client.controller.buttons.signup;
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
        new LogIn().setVisible(true);
    }

}