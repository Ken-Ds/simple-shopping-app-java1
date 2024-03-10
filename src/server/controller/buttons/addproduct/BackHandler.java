package server.controller.buttons.addproduct;
import server.controller.buttons.adminview.*;
import server.view.AddProduct;
import server.view.AdminView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BackHandler implements ActionListener {

    private AddProduct addProduct;

    public BackHandler(AddProduct addProduct) {
        this.addProduct = addProduct;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        addProduct.dispose();
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