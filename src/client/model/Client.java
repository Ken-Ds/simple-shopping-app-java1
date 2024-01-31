package client.model;

import admin.model.User;

public class Client extends User {
    public Client(int id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public String getRole() {
        return "client";
    }
}
