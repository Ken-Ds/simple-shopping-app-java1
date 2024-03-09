package server.controller.buttons.deleteproduct;
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
        new AdminView().setVisible(true);
    }
}