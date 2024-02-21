package server.model.buttons.viewusers;

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
        new AdminView().setVisible(true);
    }
}