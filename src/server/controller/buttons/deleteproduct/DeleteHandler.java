package server.controller.buttons.deleteproduct;
import common.ParseXMLFile;
import server.view.AddProduct;
import server.view.DeleteProduct;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteHandler implements ActionListener {

    private DeleteProduct deleteProduct;

    public DeleteHandler(DeleteProduct deleteProduct) {
        this.deleteProduct = deleteProduct;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        deleteProduct.dispose();
        new ParseXMLFile().deleteXMLProduct(deleteProduct.returnId());
        new DeleteProduct().setVisible(true);
    }
}