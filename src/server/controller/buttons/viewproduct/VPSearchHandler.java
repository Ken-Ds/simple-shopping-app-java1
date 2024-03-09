package server.controller.buttons.viewproduct;
import common.SetJTable;
import server.view.ViewProduct;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VPSearchHandler implements ActionListener {

    private ViewProduct viewProduct;

    public VPSearchHandler(ViewProduct viewProduct) {
        this.viewProduct = viewProduct;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        viewProduct.dispose();
        new ViewProduct(new SetJTable().searchByIDProductTable(viewProduct.returnIDSearch())).setVisible(true);
    }
}