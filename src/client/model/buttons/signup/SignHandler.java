package client.model.buttons.signup;
import client.model.Connect;
import client.view.SignUp;
import client.view.UserView;
import common.Account;
import common.Cart;
import common.ParseXMLFile;
import server.view.AddProduct;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignHandler implements ActionListener {

    private SignUp signUp;

    public SignHandler(SignUp signUp) {
        this.signUp = signUp;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Connect connect = new Connect();
            connect.createConnection(UserView.ipAddress);
            String username = signUp.returnUsername();
            String password = signUp.returnPassword();
            connect.sendMessage("Signup");
            Account account = new Account(0, username, password, new Cart());
            connect.sendMessage(account);
            Boolean added = (Boolean) connect.receiveMessage();
            if(added){
                JOptionPane.showMessageDialog(signUp,"Account Created");
            } else {
                JOptionPane.showMessageDialog(signUp,"Username has already been taken");
            }
        }
        catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }

}