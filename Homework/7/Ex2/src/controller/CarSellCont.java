package controller;

import model.entity.CarSellEnti;
import model.service.CarSellServ;

import java.util.List;

public class CarSellCont {
    public void insert(int carId, String username) throws Exception {
        CarSellServ.getInstance().save(new CarSellEnti().setCarId(carId).setUsername(username));
        System.out.println ("buy successfully.");
    }

    public void select() throws Exception {
        int i = 1;
        List<CarSellEnti> carSellList = CarSellServ.getInstance().report();
        for (CarSellEnti carSellEnti : carSellList) {
            System.out.println(i + "th sell information:");
            System.out.println("car id is: " + carSellEnti.getCarId());
            System.out.println("model is: " + carSellEnti.getUsername());
            i++;
        }
    }
}
