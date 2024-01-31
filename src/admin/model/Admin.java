package admin.model;

import java.util.ArrayList;
import java.util.List;

public class Admin extends User {
    public Admin(int id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public String getRole() {
        return "admin";
    }
    public void addUser(List<List<User>> users){
        List<User> user = new ArrayList<>();
        users.add(user);
    }
}

