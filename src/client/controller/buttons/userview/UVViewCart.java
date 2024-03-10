package client.controller.buttons.userview;
import client.controller.buttons.viewcart.VCBackButton;
import client.controller.buttons.viewcart.VCDeleteButton;
import client.controller.buttons.viewcart.VCSearchButton;
import client.model.Connect;
import client.view.UserView;
import client.view.ViewCart;
import common.Product;
import common.SetJTable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class UVViewCart implements ActionListener {

    private UserView userView;

    public UVViewCart(UserView userView) {
        this.userView = userView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            userView.dispose();
            SetJTable setJTable = new SetJTable();
            Connect connect = new Connect();
            connect.createConnection(userView.returnIpAddress());
            connect.sendMessage("ViewC");
            connect.sendMessage(UserView.userID);
            ArrayList<Product> arrayList = (ArrayList<Product>) connect.receiveMessage();
            ViewCart viewCart = new ViewCart(userView.returnID(), userView.returnUserName(), setJTable.cartView(arrayList));
            viewCart.setButtonBackActionListener(new VCBackButton(viewCart));
            viewCart.setButtonDeleteActionListener(new VCDeleteButton(viewCart));
            viewCart.setButtonSearchActionListener(new VCSearchButton(viewCart));
            viewCart.setVisible(true);
        } catch (Exception e1){
            e1.printStackTrace();
        }
    }
}