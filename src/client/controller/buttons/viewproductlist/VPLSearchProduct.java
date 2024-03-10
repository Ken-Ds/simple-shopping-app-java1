package client.controller.buttons.viewproductlist;
import client.model.Connect;
import client.view.UserView;
import client.view.ViewProductList;
import common.Product;
import common.SetJTable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VPLSearchProduct implements ActionListener {

    private ViewProductList viewProductList;

    public VPLSearchProduct(ViewProductList viewProduct) {
        this.viewProductList = viewProduct;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Connect connect = new Connect();
            connect.createConnection(UserView.ipAddress);
            connect.sendMessage("VPLSearch");
            ArrayList<Product> productArrayList = (ArrayList<Product>) connect.receiveMessage();
            viewProductList.dispose();
            ViewProductList viewProductList = new ViewProductList(new SetJTable().searchByNameProductTable(productArrayList,this.viewProductList.returnNameSearch()));
            viewProductList.setBackButtonActionListener(new VPLBack(viewProductList));
            viewProductList.setBtnAddToCartActionListener(new VPLAddProduct(viewProductList));
            viewProductList.setBtnSearch1ActionListener(new VPLSearchProduct(viewProductList));
            viewProductList.setVisible(true);
        }catch (Exception e1){
            e1.printStackTrace();
        }
    }
}