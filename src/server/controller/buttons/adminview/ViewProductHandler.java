package server.controller.buttons.adminview;

import common.SetJTable;
import server.controller.buttons.viewproduct.VPBackHandler;
import server.controller.buttons.viewproduct.VPEditHandler;
import server.controller.buttons.viewproduct.VPSearchHandler;
import server.view.AdminView;
import server.view.EditProduct;
import server.view.ViewProduct;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewProductHandler implements ActionListener {
    private AdminView adminView;

    public ViewProductHandler(AdminView adminView) {
        this.adminView = adminView;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        adminView.dispose();
        ViewProduct viewProduct = new ViewProduct(new SetJTable().setTable());
        viewProduct.setEditButtonListener(new VPEditHandler(viewProduct));
        viewProduct.setSearchProductButtonActionListener(new VPSearchHandler(viewProduct));
        viewProduct.setBackActionListener(new VPBackHandler(viewProduct));
        viewProduct.setVisible(true);
    }
}
