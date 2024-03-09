package client.model.buttons.signup;
import client.model.Connect;
import client.view.LogIn;
import client.view.SignUp;
import common.Account;
import common.Cart;
import common.ParseXMLFile;
import server.view.AddProduct;

import javax.swing.*;
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