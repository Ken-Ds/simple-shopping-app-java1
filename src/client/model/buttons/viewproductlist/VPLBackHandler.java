package client.model.buttons.viewproductlist;

import client.view.ViewProductList;
import server.view.AdminView;
import server.view.ViewUsers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VPLBackHandler implements ActionListener {

    private ViewProductList back;

    public VPLBackHandler(ViewProductList back) {
        this.back = back;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        back.dispose();
        new AdminView().setVisible(true);
    }
}