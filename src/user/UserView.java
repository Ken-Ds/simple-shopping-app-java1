package user;

import common.Product;

import java.util.Scanner;

public class UserView {

    private Scanner kbd = new Scanner(System.in);


    public void showMenu() {
        System.out.println("-------USER------");
        System.out.println("[1] Add product to sell");
        System.out.println("[2] Delete product");
        System.out.println("[3] Order product/s");
        System.out.println("[4] Check products in cart");
        System.out.println("[5] Exit");
        System.out.println("---------------------------");
        System.out.print("Enter Number of your choice: ");
    }

    public Product showAddProduct() {
        System.out.println("----------ADD PRODUCT----------");
        System.out.print("Enter the name of the product: ");
        String name = kbd.nextLine();
        System.out.print("Enter the id: ");
        int id = Integer.parseInt(kbd.nextLine());
        System.out.println("Enter price: ");
        float price = Float.parseFloat(kbd.nextLine());
        System.out.println("Enter description: ");
        String description = kbd.nextLine();
        return new Product(id, name, price, description);
    }

    public void showDeleteProduct() {
        System.out.println("----------DELETE PRODUCT----------");
        System.out.print("Enter the id of the product: ");
    }

    public void oderProduct() {
        System.out.println("----------ORDER PRODUCT----------");
        System.out.print("Enter the id of the product: ");
    }

    public void checkProductsInCart() {
        System.out.println("----------CHECK PRODUCT IN CART----------");
        System.out.print("Enter the id of the product: ");
    }
}
