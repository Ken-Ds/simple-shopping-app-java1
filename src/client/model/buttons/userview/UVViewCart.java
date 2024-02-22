package client.model.buttons.userview;
import client.model.Connect;
import client.view.UserView;
import client.view.ViewCart;
import common.ParseXMLFile;
import common.Product;
import common.SetJTable;
import server.view.AddProduct;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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
            connect.sendMessage("ViewC");
            connect.sendMessage(UserView.userID);
            ArrayList<Product> arrayList = (ArrayList<Product>) connect.receiveMessage();
            new ViewCart(userView.returnID(), userView.returnUserName(), setJTable.cartView(arrayList)).setVisible(true);
        } catch (Exception e1){
            e1.printStackTrace();
        }
    }
}