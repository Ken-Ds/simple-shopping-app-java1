package client.controller.buttons.userview;
import client.controller.buttons.viewproductlist.VPLAddProduct;
import client.controller.buttons.viewproductlist.VPLBack;
import client.controller.buttons.viewproductlist.VPLSearchProduct;
import client.model.Connect;
import client.view.UserView;
import client.view.ViewProductList;
import common.Product;
import common.SetJTable;

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
            ViewProductList viewProductList = new ViewProductList(new SetJTable().setClientTableArray(productArrayList));
            viewProductList.setBackButtonActionListener(new VPLBack(viewProductList));
            viewProductList.setBtnAddToCartActionListener(new VPLAddProduct(viewProductList));
            viewProductList.setBtnSearch1ActionListener(new VPLSearchProduct(viewProductList));
            viewProductList.setVisible(true);
        } catch (Exception e1){
            e1.printStackTrace();
        }
    }
}