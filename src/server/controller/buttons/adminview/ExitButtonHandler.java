package server.controller.buttons.adminview;

import server.view.AdminView;
import server.view.EditProduct;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExitButtonHandler implements ActionListener {
    private AdminView adminView;

    public ExitButtonHandler(AdminView adminView) {
        this.adminView = adminView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        adminView.dispose();
    }
}
