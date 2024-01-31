package reference;

import dataType.Product;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products;
    private Client client;

    public Cart(Client client) {
        this.client = client;
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

    public Client getClient() {
        return client;
    }
}
