package server.model.buttons.addproduct;
import common.ParseXMLFile;
import server.view.AddProduct;
import server.view.AdminView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddHandler implements ActionListener {

    private AddProduct addProduct;

    public AddHandler(AddProduct addProduct) {
        this.addProduct = addProduct;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        addProduct.dispose();
        if(!new ParseXMLFile().checkProductIfExisting(addProduct.returnName())) {
            new ParseXMLFile().addXMLProduct(addProduct.returnName(), addProduct.returnPrice(), addProduct.returnDescription());
        } else {
            JOptionPane.showMessageDialog(addProduct,"Existing product");
        }
        new AddProduct().setVisible(true);
    }
}