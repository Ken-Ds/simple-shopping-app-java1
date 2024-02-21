package server.model.buttons.viewproduct;

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
        new AdminView().setVisible(true);
    }
}