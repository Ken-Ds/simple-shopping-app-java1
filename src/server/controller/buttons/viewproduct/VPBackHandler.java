package server.controller.buttons.viewproduct;

import server.controller.buttons.adminview.*;
import server.view.AdminView;
import server.view.ViewProduct;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VPBackHandler implements ActionListener {

    private ViewProduct viewProduct;

    public VPBackHandler(ViewProduct viewProduct) {
        this.viewProduct = viewProduct;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        viewProduct.dispose();
        AdminView adminView = new AdminView();
        adminView.setExitButton(new ExitButtonHandler(adminView));
        adminView.setViewProductButton(new ViewProductHandler(adminView));
        adminView.setViewUserButton(new ViewUsersHandler(adminView));
        adminView.setAddProductButton(new AddProductHandler(adminView));
        adminView.setEditProductButton(new EditProductHandler(adminView));
        adminView.setDeleteProductButton(new DeleteProductHandler(adminView));
        adminView.setVisible(true);
    }
}