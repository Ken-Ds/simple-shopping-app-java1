package client.model.buttons.viewproductlist;

import client.model.Connect;
import client.view.ViewProductList;
import common.*;
import server.view.AddProduct;

import javax.swing.*;
import javax.swing.text.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddBtnHandler  implements ActionListener {

    private ViewProductList addProduct;

    public AddBtnHandler(ViewProductList addProduct) {
        this.addProduct = addProduct;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            Connect connect = new Connect();
            connect.createConnection();

            connect.sendMessage("Cart");
            String name = (String) jTable1.getValueAt(selectedRow, 0);
            String price = (String) jTable1.getValueAt(selectedRow, 1);
            String description = (String) jTable1.getValueAt(selectedRow, 2);

            Product product = new Product(name, price, description);
            productList.add(product);
            Cart cart = new Cart(null, productList);
            System.out.println(cart);
            System.out.println("Selected: " + name + ", " + price + ", " + description);

            JOptionPane.showMessageDialog(this, "Product added to cart: " + name);

            connect.sendMessage(new Account(0,"Freddie","kahitanona",null));
            connect.sendMessage(cart);
        } else {
            // No row selected, display an error message or handle the case appropriately
            JOptionPane.showMessageDialog(this, "Please select a product to add to cart.");
        }
    }
}

