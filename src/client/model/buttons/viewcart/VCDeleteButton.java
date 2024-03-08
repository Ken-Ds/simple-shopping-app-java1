package client.model.buttons.viewcart;
import client.model.Connect;
import client.view.UserView;
import client.view.ViewCart;
import common.ParseXMLFile;
import common.Product;
import common.SetJTable;
import org.w3c.dom.NodeList;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VCDeleteButton implements ActionListener {

    private ViewCart viewCart;

    public VCDeleteButton(ViewCart viewCart) {
        this.viewCart = viewCart;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Connect connect = new Connect();
            connect.createConnection(UserView.ipAddress);
            connect.sendMessage("DCart");
            connect.sendMessage(UserView.userID);
            connect.sendMessage(viewCart.deleteNameSearch());
            ArrayList<Product> arrayList = (ArrayList<Product>) connect.receiveMessage();
            viewCart.dispose();
            new ViewCart(UserView.userID, UserView.userName, new SetJTable().cartView(arrayList)).setVisible(true);
        }catch (Exception e1){
            e1.printStackTrace();
        }
    }
}