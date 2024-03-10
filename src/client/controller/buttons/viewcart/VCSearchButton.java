package client.controller.buttons.viewcart;
import client.model.Connect;
import client.view.UserView;
import client.view.ViewCart;
import common.Product;
import common.SetJTable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VCSearchButton implements ActionListener {

    private ViewCart viewCart;

    public VCSearchButton(ViewCart viewCart) {
        this.viewCart = viewCart;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Connect connect = new Connect();
            connect.createConnection(UserView.ipAddress);
            connect.sendMessage("VCSearchBack");
            connect.sendMessage(UserView.userID);
            ArrayList<Product> arrayList = (ArrayList<Product>) connect.receiveMessage();
            viewCart.dispose();
            ViewCart viewCart = new ViewCart(UserView.userID, UserView.userName, new SetJTable().cartViewSearch(arrayList, this.viewCart.returnNameSearch()));
            viewCart.setButtonBackActionListener(new VCBackButton(viewCart));
            viewCart.setButtonDeleteActionListener(new VCDeleteButton(viewCart));
            viewCart.setButtonSearchActionListener(new VCSearchButton(viewCart));
            viewCart.setVisible(true);
        }catch (Exception e1){
            e1.printStackTrace();
        }
    }
}