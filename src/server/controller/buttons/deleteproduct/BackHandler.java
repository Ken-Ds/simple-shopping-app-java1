package server.controller.buttons.deleteproduct;
import server.controller.buttons.adminview.*;
import server.view.AdminView;
import server.view.DeleteProduct;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BackHandler implements ActionListener {

    private DeleteProduct deleteProduct;

    public BackHandler(DeleteProduct deleteProduct) {
        this.deleteProduct = deleteProduct;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        deleteProduct.dispose();
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