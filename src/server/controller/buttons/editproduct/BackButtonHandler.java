package server.controller.buttons.editproduct;

import common.ParseXMLFile;
import common.SetJTable;
import server.controller.buttons.viewproduct.VPBackHandler;
import server.controller.buttons.viewproduct.VPEditHandler;
import server.controller.buttons.viewproduct.VPSearchHandler;
import server.view.AddProduct;
import server.view.EditProduct;
import server.view.ViewProduct;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BackButtonHandler implements ActionListener {
    private EditProduct editProduct;

    public BackButtonHandler(EditProduct editProduct) {
        this.editProduct = editProduct;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        editProduct.dispose();
        ViewProduct viewProduct = new ViewProduct(new SetJTable().setTable());
        viewProduct.setEditButtonListener(new VPEditHandler(viewProduct));
        viewProduct.setSearchProductButtonActionListener(new VPSearchHandler(viewProduct));
        viewProduct.setBackActionListener(new VPBackHandler(viewProduct));
        viewProduct.setVisible(true);
    }
}
