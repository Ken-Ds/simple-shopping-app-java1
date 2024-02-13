package server.view;

public class MainView {
    public AdminView adminView;
    public AddProduct addProduct = new AddProduct();
    public ViewProduct viewProduct = new ViewProduct();
    public MainView(){
        adminView = new AdminView();
    }
}
