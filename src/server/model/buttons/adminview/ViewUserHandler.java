package server.model.buttons.adminview;

import common.SetJTable;
import server.view.AdminView;

import server.view.ViewUsers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewUserHandler implements ActionListener {
    private AdminView adminView;
    public ViewUserHandler(AdminView adminView) {
        this.adminView = adminView;
    }
    public void actionPerformed(ActionEvent e) {
        adminView.dispose();
        new ViewUsers(new SetJTable().setViewUserTable()).setVisible(true);
    }
}
