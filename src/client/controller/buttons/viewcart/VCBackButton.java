package client.controller.buttons.viewcart;
import client.view.LogIn;
import client.view.UserView;
import client.view.ViewCart;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VCBackButton implements ActionListener {

    private ViewCart viewCart;

    public VCBackButton(ViewCart viewCart) {
        this.viewCart = viewCart;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        viewCart.dispose();
        new UserView(UserView.userID,UserView.userName,new LogIn().returnIP()).setVisible(true);

    }
}