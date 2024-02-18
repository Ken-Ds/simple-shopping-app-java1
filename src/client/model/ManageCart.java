package client.model;

import java.io.IOException;
import java.util.ArrayList;

public class ManageCart {

    public void addToCart(ArrayList<String> cart, String product) {
        cart.add(product);
        Connect connect = new Connect();
        try {
            connect.sendMessage(cart);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

