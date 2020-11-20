package controller;

import model.entity.UsersEnti;
import model.service.UsersServ;

import java.util.*;

public class UsersCont {

    Scanner input = new Scanner(System.in);

    public void insert(String name, String username, String password, String email, long bill, int internetPackage) throws Exception {
        UsersServ.getInstance().save(new UsersEnti().setName(name).setUsername(username).setPassword(password).setEmail(email).setBill(bill).setInternetPackage(internetPackage));
        System.out.println ("sign up successfully.");
    }

    public void update(String username, long bill, int internetPackage) throws Exception {
        UsersServ.getInstance().edit(new UsersEnti().setUsername(username).setBill(bill).setInternetPackage(internetPackage));
        System.out.println ("edited successfully.");
    }

    public void select(String username, String password) throws Exception {
        boolean check = false;
        List<UsersEnti> usersList = UsersServ.getInstance().report();
        for (UsersEnti usersEnti : usersList) {
            if(username != null && username.equals(usersEnti.getUsername()) && password != null && password.equals(usersEnti.getPassword())) {
                check = true;
                break;
            }
        }
        if(check) {
            System.out.println("login successfully.");
            System.out.println("1: 2GB - 1000 Toman");
            System.out.println("2: 4GB - 2000 Toman");
            System.out.println("3: 10GB - 5000 Toman");
            System.out.println("4: 25GB - 10000 Toman");
            System.out.print("enter the number of internet package you want: ");
            int choice1 = Integer.parseInt(input.nextLine());
            switch(choice1) {
                case 1:
                    update(username, 1000, 2);
                    break;
                case 2:
                    update(username, 2000, 4);
                    break;
                case 3:
                    update(username, 5000, 10);
                    break;
                case 4:
                    update(username, 10000, 25);
                    break;
                default:
                    System.out.println("invalid choice number.");
            }
        }
        else
            System.out.println("invalid username or password.");
    }
}
