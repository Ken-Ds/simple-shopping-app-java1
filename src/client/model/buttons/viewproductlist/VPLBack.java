package client.model.buttons.viewproductlist;
import client.view.UserView;
import client.view.ViewProductList;
import common.SetJTable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VPLBack implements ActionListener {

    private ViewProductList viewProductList;

    public VPLBack(ViewProductList viewProduct) {
        this.viewProductList = viewProduct;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        viewProductList.dispose();
        new UserView(viewProductList.returnId(), viewProductList.returnName()).setVisible(true);
    }
}