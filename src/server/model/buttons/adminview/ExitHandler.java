package server.model.buttons.adminview;

import server.view.AdminView;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExitHandler implements ActionListener {
    private AdminView adminView;
    public ExitHandler(AdminView adminView) {
        this.adminView = adminView;
    }

    public void actionPerformed(ActionEvent e) {
        adminView.dispose();
    }
}
