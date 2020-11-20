package controller;

import model.entity.UsersEnti;
import model.service.UsersServ;

import java.util.*;

public class UsersCont {

    Scanner input = new Scanner(System.in);

    public UsersCont() {

    }

    public void insert(String name, String username, String password, String email) throws Exception {
        UsersServ.getInstance().save(new UsersEnti().setName(name).setUsername(username).setPassword(password).setEmail(email));
        System.out.println ("sign up successfully.");
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
            SaipaCont saipaCont = new SaipaCont();
            System.out.println("1: show specifications of cars");
            System.out.println("2: buy a car");
            System.out.println("3: car buying guid");
            System.out.println("4: exit");
            System.out.print("enter your choice: ");
            int choice = Integer.parseInt(input.nextLine());
            for (; choice != 4; ) {
                switch (choice) {
                    case 1:
                        saipaCont.select();
                        break;
                    case 2:
                        System.out.print("enter the id of car you want: ");
                        int carId = Integer.parseInt(input.nextLine());
                        if (saipaCont.select(carId)) {
                            CarSellCont carSellCont = new CarSellCont();
                            carSellCont.insert(carId, username);
                        }
                        else
                            System.out.println("invalid car id.");
                        break;
                    case 3:
                        System.out.println("1- select the desired car code through option 2");
                        System.out.println("2- make the purchase through option 3 with car id");
                        break;
                    default:
                        System.out.println("invalid choice number.");
                }
                System.out.print("enter your choice: ");
                choice = Integer.parseInt(input.nextLine());
            }
        }
        else
            System.out.println("invalid username or password.");
    }
}
