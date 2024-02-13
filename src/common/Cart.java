package common;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products;

    public Cart(Account user) {
        this.products = new ArrayList<>();
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
