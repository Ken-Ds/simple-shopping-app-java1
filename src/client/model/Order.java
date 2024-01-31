package client.model;

import admin.model.Product;

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
}
