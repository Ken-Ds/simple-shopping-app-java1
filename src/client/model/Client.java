package client.model;

import admin.model.Product;
import admin.model.User;

public class Client extends User {
    public Client(int id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public String getRole() {
        return "client";
    }
    public void addProduct(Product product) {
        // Implementation for adding a product
    }

    public void removeProduct(int productId) {
        // Implementation for removing a product
    }

    public void updateProduct(Product product) {
        // Implementation for updating a product
    }
}
