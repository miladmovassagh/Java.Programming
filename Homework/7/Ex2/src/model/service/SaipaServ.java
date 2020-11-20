package model.service;

import model.entity.SaipaEnti;
import model.repository.SaipaRepo;

import java.util.*;

public class SaipaServ {

    private static SaipaServ saipaServ = new SaipaServ();

    public static SaipaServ getInstance() {
        return saipaServ;
    }

    private SaipaServ() {

    }

    public List<SaipaEnti> report() throws Exception {
        List<SaipaEnti> saipaEntis;
        try(SaipaRepo saipaRepo = new SaipaRepo()) {
            saipaEntis = saipaRepo.select ();
        }
        return saipaEntis;
    }
}
