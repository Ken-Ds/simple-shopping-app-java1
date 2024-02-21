package server.model.buttons.editproduct;

import common.ParseXMLFile;

import server.view.EditProduct;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchHandler implements ActionListener {
    private EditProduct editProduct;

    public SearchHandler(EditProduct editProduct) {
        this.editProduct = editProduct;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new ParseXMLFile().editXMLProduct(editProduct.returnID(),editProduct.returnName(),editProduct.returnPrice(),editProduct.returnStatus());
        editProduct.dispose();
        new EditProduct().setVisible(true);
    }
}
