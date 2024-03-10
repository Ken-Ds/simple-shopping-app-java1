package server.controller.buttons.adminview;

import server.controller.buttons.editproduct.BackButtonHandler;
import server.controller.buttons.editproduct.EditButtonHandler;
import server.view.AdminView;
import server.view.DeleteProduct;
import server.view.EditProduct;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditProductHandler implements ActionListener {
    private AdminView adminView;

    public EditProductHandler(AdminView adminView) {
        this.adminView = adminView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        adminView.dispose();
        EditProduct editProduct = new EditProduct();
        editProduct.setEditButton(new EditButtonHandler(editProduct));
        editProduct.setBackButton(new BackButtonHandler(editProduct));
        editProduct.setVisible(true);
    }
}
