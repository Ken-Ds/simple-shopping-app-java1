package server.controller.buttons.viewusers;

import common.SetJTable;
import server.view.AdminView;
import server.view.ViewUsers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VUSearchHandler implements ActionListener {
    private ViewUsers viewUsers;

    public VUSearchHandler(ViewUsers viewUsers) {
        this.viewUsers = viewUsers;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        viewUsers.setVisible(false);
        new ViewUsers(new SetJTable().searchByIDUserTable(viewUsers.returnSearchID())).setVisible(true);
    }
}
