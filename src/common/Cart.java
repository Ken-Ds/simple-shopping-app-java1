package common;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final Account user;
    private List<Product> products;

    public Cart(Account user, ArrayList<Product> products) {
        this.products = products;
        this.user = user;

    }

    public Account getUser() {
        return user;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(int productId) {
        products.removeIf(product -> product.getId().equals(productId));
    }

    public List<Product> getProducts() {
        return products;
    }

}
