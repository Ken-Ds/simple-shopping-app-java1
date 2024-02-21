package client.model.buttons.userview;
import client.view.UserView;
import client.view.ViewProductList;
import common.ParseXMLFile;
import common.SetJTable;
import server.view.AddProduct;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UVViewProductList implements ActionListener {

    private UserView userView;

    public UVViewProductList(UserView userView) {
        this.userView = userView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        userView.dispose();
        new ViewProductList(new SetJTable().setClientTable()).setVisible(true);
    }
}