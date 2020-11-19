package com.usc;

import java.util.*;

public class UsersServ {

    private static UsersServ usersServ = new UsersServ();

    public static UsersServ getInstance() {
        return usersServ;
    }

    private UsersServ() {

    }

    public void save (UsersEnti usersEnti) throws Exception {
        try (UsersRepo usersRepo = new UsersRepo()) {
            usersRepo.insert(usersEnti);
            usersRepo.commit ();
        }
    }

    public void edit (UsersEnti usersEnti) throws Exception {
        try (UsersRepo usersRepo = new UsersRepo()) {
            List<UsersEnti> usersList = UsersServ.getInstance().report ();
            for (UsersEnti usersEnti1 : usersList) {
                if(usersEnti.getUsername().equals(usersEnti1.getUsername())) {
                    usersEnti.setBill(usersEnti1.getBill() + usersEnti.getBill());
                    usersEnti.setInternetPackage(usersEnti1.getInternetPackage() + usersEnti.getInternetPackage());
                    usersRepo.update(usersEnti);
                    usersRepo.commit();
                }
            }
        }
    }

    public List<UsersEnti> report() throws Exception {
        List<UsersEnti> usersEntis;
        try(UsersRepo usersRepo = new UsersRepo()) {
            usersEntis = usersRepo.select ();
        }
        return usersEntis;
    }
}
