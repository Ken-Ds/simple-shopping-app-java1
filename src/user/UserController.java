package user;
import java.util.Scanner;

public class UserController {
    private Scanner kbd = new Scanner(System.in);
    private UserModel userModel;
    public UserView userView;
    public UserController(UserModel model, UserView view){
        model = userModel;
        view = userView;

        view.showMenu();
        int choice = Integer.parseInt(kbd.nextLine());
        switch (choice){
            case 1:
                userModel.addProduct(view.showAddProduct());
                break;
            case 2:
                userView.showDeleteProduct();
                int delID = kbd.nextInt();
                model.deleteProduct(delID);
                break;
            case 3:
                userView.showOrderProduct();
                int orderProduct = kbd.nextInt();
                model.showOrderProduct(orderProduct);
                break;
            case 4:
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
