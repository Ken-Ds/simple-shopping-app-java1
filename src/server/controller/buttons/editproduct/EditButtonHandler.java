package server.controller.buttons.editproduct;

import common.ParseXMLFile;
import common.SetJTable;
import server.view.EditProduct;
import server.view.ViewProduct;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditButtonHandler implements ActionListener {
    private EditProduct editProduct;

    public EditButtonHandler(EditProduct editProduct) {
        this.editProduct = editProduct;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        new ParseXMLFile().editXMLProduct(editProduct.returnID(),editProduct.returnName(),editProduct.returnPrice(),editProduct.returnStatus());
        editProduct.dispose();
        new EditProduct().setVisible(true);
    }
}
