package server.controller.buttons.editproduct;

import common.ParseXMLFile;
import server.view.EditProduct;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditButtonHandler implements ActionListener {
    private EditProduct editProduct;

    public EditButtonHandler(EditProduct editProduct) {
        this.editProduct = editProduct;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int selectedRow = editProduct.returnJTable1().getSelectedRow();
        if(selectedRow != -1) {
            String id = (String) editProduct.returnJTable1().getValueAt(selectedRow, 0);
            new ParseXMLFile().editXMLProduct(id, editProduct.returnName(), editProduct.returnPrice(), editProduct.returnStatus());
        }
        editProduct.dispose();
        EditProduct editProduct = new EditProduct();
        editProduct.setEditButton(new EditButtonHandler(editProduct));
        editProduct.setBackButton(new BackButtonHandler(editProduct));
        editProduct.setVisible(true);
    }
}
