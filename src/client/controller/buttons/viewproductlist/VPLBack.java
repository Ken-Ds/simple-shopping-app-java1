package client.controller.buttons.viewproductlist;
import client.controller.buttons.userview.UVLogout;
import client.controller.buttons.userview.UVViewCart;
import client.controller.buttons.userview.UVViewProductList;
import client.view.LogIn;
import client.view.UserView;
import client.view.ViewProductList;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VPLBack implements ActionListener {

    private ViewProductList viewProductList;

    public VPLBack(ViewProductList viewProduct) {
        this.viewProductList = viewProduct;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        viewProductList.dispose();
        UserView userView = new UserView(viewProductList.returnId(), viewProductList.returnName(),new LogIn().returnIP());
        userView.setBtnLogOutActionListener(new UVLogout(userView));
        userView.setBtnAddToCartActionListener(new UVViewCart(userView));
        userView.setBtnViewProductActionListener(new UVViewProductList(userView));
        userView.setVisible(true);
    }
}