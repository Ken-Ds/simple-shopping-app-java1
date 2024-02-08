package server.view;

import java.util.Scanner;

public class UserInput {

    private Scanner input = new Scanner(System.in);

    public int getIntInput(){
        return Integer.parseInt(input.nextLine);
    }

    public int getStringInput(){
        return input.nextLine;
    }

}