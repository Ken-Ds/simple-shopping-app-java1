package client.controller.buttons.viewcart;
import client.controller.buttons.userview.UVLogout;
import client.controller.buttons.userview.UVViewCart;
import client.controller.buttons.userview.UVViewProductList;
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
        UserView userView = new UserView(UserView.userID,UserView.userName,new LogIn().returnIP());
        userView.setBtnLogOutActionListener(new UVLogout(userView));
        userView.setBtnAddToCartActionListener(new UVViewCart(userView));
        userView.setBtnViewProductActionListener(new UVViewProductList(userView));
        userView.setVisible(true);

    }
}