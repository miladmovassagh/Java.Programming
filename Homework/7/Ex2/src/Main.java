import controller.SaipaCont;
import controller.UsersCont;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // for first run for insert cars
//        SaipaCont saipaCont = new SaipaCont();
//        try {
//            saipaCont.insert(1, "Pride 141", "white", 170, 1389, "120000000 toman");
//            saipaCont.insert(2, "Tiba 2", "black", 205, 1393, "200000000 toman");
//            saipaCont.insert(3, "Serato", "red", 197, 1395, "400000000 toman");
//        } catch(Exception e) {
//            e.printStackTrace();
//        }
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
                UsersCont usersCont = new UsersCont();
                try {
                    usersCont.insert(name, username1, password1, email);
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
                UsersCont usersCont1 = new UsersCont();
                try {
                    usersCont1.select(username2, password2);
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
