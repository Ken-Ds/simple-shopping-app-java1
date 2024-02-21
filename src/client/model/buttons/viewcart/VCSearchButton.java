package client.model.buttons.viewcart;
import client.view.UserView;
import client.view.ViewCart;
import common.SetJTable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VCSearchButton implements ActionListener {

    private ViewCart viewCart;

    public VCSearchButton(ViewCart viewCart) {
        this.viewCart = viewCart;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        viewCart.dispose();
        new ViewCart(UserView.userID,UserView.userName,new SetJTable().cartViewSearch(String.valueOf(UserView.userID),viewCart.returnNameSearch())).setVisible(true);
    }
}