package server.model.buttons.adminview;

import common.SetJTable;
import server.view.AdminView;
import server.view.ViewProduct;
import server.view.ViewUsers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewUsersHandler implements ActionListener {
    private AdminView adminView;

    public ViewUsersHandler(AdminView adminView) {
        this.adminView = adminView;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        adminView.dispose();
        new ViewUsers(new SetJTable().setViewUserTable()).setVisible(true);
    }
}
