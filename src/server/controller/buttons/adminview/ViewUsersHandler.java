package server.controller.buttons.adminview;

import common.SetJTable;
import server.controller.buttons.viewusers.VUBackHandler;
import server.controller.buttons.viewusers.VUSearchHandler;
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
        ViewUsers viewUsers = new ViewUsers(new SetJTable().setViewUserTable());
        viewUsers.setBackButtonActionListener(new VUBackHandler(viewUsers));
        viewUsers.setSearchButtonActionListener(new VUSearchHandler(viewUsers));
        viewUsers.setVisible(true);
    }
}
