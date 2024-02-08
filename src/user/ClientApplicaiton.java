package user;
public class Client {
    public static void main(String[] args) {
        UserView view = new UserView();
        UserModel model = new UserModel();
        UserController controller = new UserController(model,view);
    }
}