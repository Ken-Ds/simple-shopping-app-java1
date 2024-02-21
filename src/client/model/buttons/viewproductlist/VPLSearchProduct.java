package client.model.buttons.viewproductlist;
import client.view.ViewProductList;
import common.ParseXMLFile;
import common.SetJTable;
import server.view.AddProduct;
import server.view.ViewProduct;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VPLSearchProduct implements ActionListener {

    private ViewProductList viewProductList;

    public VPLSearchProduct(ViewProductList viewProduct) {
        this.viewProductList = viewProduct;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        viewProductList.dispose();
        new ViewProductList(new SetJTable().searchByNameProductTable(viewProductList.returnNameSearch())).setVisible(true);
    }
}