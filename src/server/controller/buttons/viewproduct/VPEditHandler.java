package server.controller.buttons.viewproduct;
import server.view.EditProduct;
import server.view.ViewProduct;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VPEditHandler implements ActionListener {

    private ViewProduct viewProduct;

    public VPEditHandler(ViewProduct viewProduct) {
        this.viewProduct = viewProduct;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        viewProduct.dispose();
        new EditProduct().setVisible(true);
    }
}