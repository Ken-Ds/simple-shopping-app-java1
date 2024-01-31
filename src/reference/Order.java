package reference;

import dataType.Product;

import java.util.List;

public class Order {
    private  List<Product> products;
    private  Client client;

    public Order(Client client, List<Product> products) {
        this.client = client;
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Client getClient() {
        return client;
    }
    public void setProducts(List<Product> products){
        this.products = products;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
