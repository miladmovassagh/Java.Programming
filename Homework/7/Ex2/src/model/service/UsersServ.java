package model.service;

import model.entity.UsersEnti;
import model.repository.UsersRepo;

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

    public List<UsersEnti> report() throws Exception {
        List<UsersEnti> usersEntis;
        try(UsersRepo usersRepo = new UsersRepo()) {
            usersEntis = usersRepo.select ();
        }
        return usersEntis;
    }
}
