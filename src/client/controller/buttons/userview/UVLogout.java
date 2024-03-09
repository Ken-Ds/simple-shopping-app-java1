package client.controller.buttons.userview;
import client.view.LogIn;
import client.view.UserView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UVLogout implements ActionListener {

    private UserView userView;

    public UVLogout(UserView userView) {
        this.userView = userView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        userView.dispose();
        new LogIn().setVisible(true);
    }
}