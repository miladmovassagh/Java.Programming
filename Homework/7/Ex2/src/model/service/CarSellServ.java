package model.service;

import model.entity.CarSellEnti;
import model.repository.CarSellRepo;

import java.util.*;

public class CarSellServ {

    private static CarSellServ carSellServ = new CarSellServ();

    public static CarSellServ getInstance() {
        return carSellServ;
    }

    private CarSellServ() {

    }

    public void save (CarSellEnti carSellEnti) throws Exception {
        try (CarSellRepo carSellRepo = new CarSellRepo()) {
            carSellRepo.insert(carSellEnti);
            carSellRepo.commit ();
        }
    }

    public List<CarSellEnti> report() throws Exception {
        List<CarSellEnti> carSellEntis;
        try(CarSellRepo carSellRepo = new CarSellRepo()) {
            carSellEntis = carSellRepo.select ();
        }
        return carSellEntis;
    }
}
