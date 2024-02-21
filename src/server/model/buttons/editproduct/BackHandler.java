package server.model.buttons.editproduct;
import server.view.AdminView;
import server.view.EditProduct;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BackHandler implements ActionListener {
    private EditProduct editProduct;

    public BackHandler(EditProduct editProduct) {
        this.editProduct = editProduct;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       editProduct.dispose();
       new AdminView().setVisible(true);
    }
}
