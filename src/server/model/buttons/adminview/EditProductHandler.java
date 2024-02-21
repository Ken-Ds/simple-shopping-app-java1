package server.model.buttons.adminview;

import server.view.AdminView;

import server.view.EditProduct;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditProductHandler implements ActionListener {
    private AdminView adminView;
    public EditProductHandler(AdminView adminView) {
        this.adminView = adminView;
    }

    public void actionPerformed(ActionEvent e) {
        adminView.dispose();
        new EditProduct().setVisible(true);
    }
}
