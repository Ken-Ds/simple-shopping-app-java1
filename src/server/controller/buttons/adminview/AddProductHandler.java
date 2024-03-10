package server.controller.buttons.adminview;

import common.ParseXMLFile;
import server.controller.buttons.addproduct.AddHandler;
import server.controller.buttons.addproduct.BackHandler;
import server.view.AddProduct;
import server.view.AdminView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddProductHandler implements ActionListener {
    private AdminView adminView;

    public AddProductHandler(AdminView adminView) {
        this.adminView = adminView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        adminView.dispose();
        AddProduct addProduct = new AddProduct();
        addProduct.setBtnAddList(new AddHandler(addProduct));
        addProduct.setBackActionListener(new BackHandler(addProduct));
        addProduct.setVisible(true);
    }
}
