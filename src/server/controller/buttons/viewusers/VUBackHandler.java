package server.controller.buttons.viewusers;

import server.controller.buttons.adminview.*;
import server.view.AdminView;
import server.view.ViewUsers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VUBackHandler implements ActionListener {

    private ViewUsers viewUsers;

    public VUBackHandler(ViewUsers viewUsers) {
        this.viewUsers = viewUsers;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        viewUsers.dispose();
        AdminView adminView = new AdminView();
        adminView.setExitButton(new ExitButtonHandler(adminView));
        adminView.setViewProductButton(new ViewProductHandler(adminView));
        adminView.setViewUserButton(new ViewUsersHandler(adminView));
        adminView.setAddProductButton(new AddProductHandler(adminView));
        adminView.setEditProductButton(new EditProductHandler(adminView));
        adminView.setDeleteProductButton(new DeleteProductHandler(adminView));
        adminView.setVisible(true);
    }
}