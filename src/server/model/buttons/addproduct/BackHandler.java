package server.model.buttons.addproduct;
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
        new AdminView().setVisible(true);
    }
}