package admin.model;

public class Admin extends User {
    public Admin(int id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public String getRole() {
        return "admin";
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
