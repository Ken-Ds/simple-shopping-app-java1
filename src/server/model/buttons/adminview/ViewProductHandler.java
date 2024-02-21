package server.model.buttons.adminview;

import common.SetJTable;
import server.view.AdminView;

import server.view.ViewProduct;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewProductHandler implements ActionListener {
    private AdminView adminView;
    public ViewProductHandler(AdminView adminView) {
        this.adminView = adminView;
    }

    public void actionPerformed(ActionEvent e) {
        adminView.dispose();
        new ViewProduct(new SetJTable().setTable()).setVisible(true);
    }
}
