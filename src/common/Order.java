package reference;

import dataType.Product;
import dataType.User;

import java.util.List;

public class Order {
    private  List<Product> products;
    private User user;

    public Order(User user, List<Product> products) {
        this.user = user;
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public User getClient() {
        return user;
    }
    public void setProducts(List<Product> products){
        this.products = products;
    }

    public void setClient(User client) {
        this.user = client;
    }
}
