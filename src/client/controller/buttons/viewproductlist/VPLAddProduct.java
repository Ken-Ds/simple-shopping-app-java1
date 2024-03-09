package client.controller.buttons.viewproductlist;
import client.model.Connect;
import client.view.UserView;
import client.view.ViewProductList;
import common.Account;
import common.Cart;
import common.Product;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VPLAddProduct implements ActionListener {

    private ViewProductList viewProductList;

    public VPLAddProduct(ViewProductList viewProduct) {
        this.viewProductList = viewProduct;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int selectedRow = viewProductList.returnJTable1().getSelectedRow();
            ArrayList<Product> productList = new ArrayList<>();
            if (selectedRow != -1) {
                Connect connect = new Connect();
                connect.createConnection(UserView.ipAddress);

                connect.sendMessage("Cart");
                String name = (String) viewProductList.returnJTable1().getValueAt(selectedRow, 0);
                String price = (String) viewProductList.returnJTable1().getValueAt(selectedRow, 1);
                String description = (String) viewProductList.returnJTable1().getValueAt(selectedRow, 2);

                Product product = new Product(name, price, description);
                productList.add(product);
                Cart cart = new Cart(null, productList);
                System.out.println(cart);
                System.out.println("Selected: " + name + ", " + price + ", " + description);



                connect.sendMessage(new Account(viewProductList.returnId(), viewProductList.returnName(), null, null));
                connect.sendMessage(cart);
                Boolean added = (Boolean) connect.receiveMessage();
                if(added){
                    JOptionPane.showMessageDialog(viewProductList, "Product added to cart: " + name);
                }else {
                    // not added
                }
            } else {
                // No row selected, display an error message or handle the case appropriately
                JOptionPane.showMessageDialog(viewProductList, "Please select a product to add to cart.");
            }
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}