package server.model.buttons.adminview;

import server.view.AddProduct;
import server.view.AdminView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddProductHandler implements ActionListener {

    private AdminView adminView;

    public AddProductHandler(AdminView adminView) {
        this.adminView = adminView;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        adminView.dispose();
        new AddProduct().setVisible(true);
    }
}