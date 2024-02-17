package server.view;

public class MainView {
    public AdminView adminView;
    public AddProduct addProduct = new AddProduct();
    public MainView(){
        adminView = new AdminView();
    }
}
