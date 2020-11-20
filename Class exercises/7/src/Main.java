import controller.UserAccountCont;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1.sign up");
        System.out.println("2.login");
        System.out.print("enter your choice: ");
        int choice = Integer.parseInt(input.nextLine());
        switch(choice) {
            case 1:
                System.out.print("enter the name: ");
                String name = input.nextLine();
                System.out.print("enter the username: ");
                String username1 = input.nextLine();
                System.out.print("enter the password: ");
                String password1 = input.nextLine();
                System.out.print("enter the email: ");
                String email = input.nextLine();
                try {
                    UserAccountCont.getInstance().insert(name, username1, password1, email);
                } catch (Exception e) {
                    System.out.println ("Fail to sign up!!");
                    e.printStackTrace();
                }
                break;
            case 2:
                System.out.print("enter the username: ");
                String username2 = input.nextLine();
                System.out.print("enter the password: ");
                String password2 = input.nextLine();
                try {
                    UserAccountCont.getInstance().select(username2, password2);
                } catch (Exception e) {
                    System.out.println("Fail to login!!");
                    e.printStackTrace();
                }
                break;
            default:
                System.out.println("invalid choice number.");
        }
    }
}
