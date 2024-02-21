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
        logIn.dispose();
        new SignUp().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Connect connect = new Connect();
            connect.createConnection();
            connect.sendMessage("Login");
            String username = logIn.returnUsername();
            String password = logIn.returnPassword();
            connect.sendMessage(username);
            int id = (int) connect.receiveMessage();
            Account account = new Account(id, username, password, null);
            System.out.println(account.toString());
            connect.sendMessage(account);
            Boolean isAccount = (Boolean) connect.receiveMessage();
            logIn.dispose();
            if (isAccount) {
                new UserView(account.getId(), account.getUsername()).setVisible(true);
            } else {
                new LogIn().setVisible(true);
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
