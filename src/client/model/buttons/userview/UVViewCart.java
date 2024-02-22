package client.model.buttons.userview;
import client.model.Connect;
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
        try {
            userView.dispose();
            SetJTable setJTable = new SetJTable();
            Connect connect = new Connect();
            connect.createConnection();
            connect.sendMessage("GetCart");
            connect.sendMessage(UserView.userID);
            new ViewCart(userView.returnID(), userView.returnUserName(), setJTable.cartView(String.valueOf(userView.returnID()))).setVisible(true);
        } catch (Exception e1){
            e1.printStackTrace();
        }
    }
}