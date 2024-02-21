package server.model.buttons.deleteproduct;
import common.ParseXMLFile;
import server.view.AddProduct;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddHandler implements ActionListener {

    private AddProduct addProduct;

    public AddHandler(AddProduct addProduct) {
        this.addProduct = addProduct;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        addProduct.dispose();
        new ParseXMLFile().addXMLProduct(addProduct.returnName(),addProduct.returnPrice(),addProduct.returnDescription());
        new AddProduct().setVisible(true);
    }
}