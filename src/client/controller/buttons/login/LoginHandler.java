package client.controller.buttons.login;
import client.controller.buttons.userview.UVLogout;
import client.controller.buttons.userview.UVViewCart;
import client.controller.buttons.userview.UVViewProductList;
import client.model.Connect;
import client.view.LogIn;
import client.view.UserView;
import common.Account;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginHandler implements ActionListener {

    private LogIn logIn;

    public LoginHandler(LogIn logIn) {
        this.logIn = logIn;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Connect connect = new Connect();
            connect.createConnection(new LogIn().returnIP());
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
                UserView userView = new UserView(account.getId(), account.getUsername(),new LogIn().returnIP());
                userView.setBtnLogOutActionListener(new UVLogout(userView));
                userView.setBtnAddToCartActionListener(new UVViewCart(userView));
                userView.setBtnViewProductActionListener(new UVViewProductList(userView));
                userView.setVisible(true);
            } else {
                LogIn logIn = new LogIn();
                logIn.setLogInActionListener(new LoginHandler(logIn));
                logIn.setSignUpActionListener(new SignUpHandler(logIn));
                logIn.setVisible(true);
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
