package server.model.buttons.adminview;

import server.view.AdminView;
import server.view.DeleteProduct;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteProductHandler implements ActionListener {
    private AdminView adminView;
    public DeleteProductHandler(AdminView adminView) {
        this.adminView = adminView;
    }

    public void actionPerformed(ActionEvent e) {
        adminView.dispose();
        new DeleteProduct().setVisible(true);
    }
}
