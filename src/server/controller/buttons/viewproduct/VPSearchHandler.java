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
        ViewProduct viewProduct1 = new ViewProduct(new SetJTable().searchByIDProductTable(viewProduct.returnIDSearch()));
        viewProduct1.setEditButtonListener(new VPEditHandler(viewProduct1));
        viewProduct1.setSearchProductButtonActionListener(new VPSearchHandler(viewProduct1));
        viewProduct1.setBackActionListener(new VPBackHandler(viewProduct1));
        viewProduct1.setVisible(true);
    }
}