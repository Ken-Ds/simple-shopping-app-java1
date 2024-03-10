package server.controller.buttons.adminview;

import server.controller.buttons.deleteproduct.BackHandler;
import server.controller.buttons.deleteproduct.DeleteHandler;
import server.view.AddProduct;
import server.view.AdminView;
import server.view.DeleteProduct;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteProductHandler implements ActionListener {
    private AdminView adminView;

    public DeleteProductHandler(AdminView adminView) {
        this.adminView = adminView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        adminView.dispose();
        DeleteProduct deleteProduct = new DeleteProduct();
        deleteProduct.setBackButton(new BackHandler(deleteProduct));;
        deleteProduct.setDeleteButton(new DeleteHandler(deleteProduct));
        deleteProduct.setVisible(true);
    }
}
