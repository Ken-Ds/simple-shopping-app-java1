package client.model.buttons.userview;
import client.view.UserView;
import client.view.ViewCart;
import common.ParseXMLFile;
import common.SetJTable;
import server.view.AddProduct;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

public class UVViewCart implements ActionListener {

    private UserView userView;

    public UVViewCart(UserView userView) {
        this.userView = userView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        userView.dispose();
        SetJTable setJTable = new SetJTable();
        new ViewCart(userView.returnID(), userView.returnUserName(),setJTable.cartView(String.valueOf(userView.returnID()))).setVisible(true);
    }
}