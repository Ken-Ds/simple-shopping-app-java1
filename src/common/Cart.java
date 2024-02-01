package reference;

import dataType.Product;
import dataType.User;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products;
    private User user;

    public Cart(User user) {
        this.user = user;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(int productId) {
        products.removeIf(product -> product.getId() == productId);
    }

    public List<Product> getProducts() {
        return products;
    }

    public User getUser() {
        return user;
    }
}
