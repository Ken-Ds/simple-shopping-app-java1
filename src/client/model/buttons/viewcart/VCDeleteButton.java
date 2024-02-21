package client.model.buttons.viewcart;
import client.view.UserView;
import client.view.ViewCart;
import common.ParseXMLFile;
import common.SetJTable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VCDeleteButton implements ActionListener {

    private ViewCart viewCart;

    public VCDeleteButton(ViewCart viewCart) {
        this.viewCart = viewCart;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        viewCart.dispose();
        new ParseXMLFile().deleteCartProduct(String.valueOf(UserView.userID),viewCart.deleteNameSearch());
        new ViewCart(UserView.userID,UserView.userName,new SetJTable().cartView(String.valueOf(UserView.userID))).setVisible(true);
    }
}