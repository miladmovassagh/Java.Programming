package controller;

import model.entity.UserAccountEnti;
import model.service.UserAccountServ;

import java.util.*;

public class UserAccountCont {

    private static UserAccountCont userAccountCont = new UserAccountCont();

    public static UserAccountCont getInstance() {
        return userAccountCont;
    }

    private UserAccountCont() {

    }

    public void insert(String name, String username, String password, String email) throws Exception {
        UserAccountServ.getInstance().save(new UserAccountEnti().setName(name).setUsername(username).setPassword(password).setEmail(email));
        System.out.println ("sign up successfully");
    }

    public void select(String username, String password) throws Exception {
        boolean check = false;
        List<UserAccountEnti> userAccountList = UserAccountServ.getInstance().report();
        for (UserAccountEnti userAccountEnti : userAccountList) {
            if(username != null && username.equals(userAccountEnti.getUsername()) && password != null && password.equals(userAccountEnti.getPassword())) {
                check = true;
                break;
            }
        }
        if(check)
            System.out.println("login successfully.");
        else
            System.out.println("invalid username or password.");
    }
}
