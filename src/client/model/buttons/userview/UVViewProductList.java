package client.model.buttons.userview;
import client.model.Connect;
import client.view.UserView;
import client.view.ViewProductList;
import common.ParseXMLFile;
import common.Product;
import common.SetJTable;
import org.w3c.dom.NodeList;
import server.view.AddProduct;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class UVViewProductList implements ActionListener {

    private UserView userView;

    public UVViewProductList(UserView userView) {
        this.userView = userView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Connect connect = new Connect();
            connect.createConnection(userView.returnIpAddress());
            connect.sendMessage("ViewP");
            ArrayList<Product> productArrayList = (ArrayList<Product>) connect.receiveMessage();
            userView.dispose();
            new ViewProductList(new SetJTable().setClientTableArray(productArrayList)).setVisible(true);
        } catch (Exception e1){
            e1.printStackTrace();
        }
    }
}