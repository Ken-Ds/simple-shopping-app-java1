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
        ViewUsers viewUsers = new ViewUsers(new SetJTable().searchByIDUserTable(this.viewUsers.returnSearchID()));
        viewUsers.setBackButtonActionListener(new VUBackHandler(viewUsers));
        viewUsers.setSearchButtonActionListener(new VUSearchHandler(viewUsers));
        viewUsers.setVisible(true);
    }
}
