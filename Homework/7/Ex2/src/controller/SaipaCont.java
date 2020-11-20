package controller;

import model.entity.SaipaEnti;
import model.service.SaipaServ;

import java.util.*;

public class SaipaCont {

    public SaipaCont() {

    }

//    public void insert(int carId, String model, String color, int maxSpeed, int constructionYear, String price) throws Exception {
//        SaipaServ.getInstance().save(new SaipaEnti().setCarId(carId).setModel(model).setColor(color).setMaxSpeed(maxSpeed).setConstructionYear(constructionYear).setPrice(price));
//        System.out.println ("sign up successfully.");
//    }

    public void select() throws Exception {
        int i = 1;
        List<SaipaEnti> saipaList = SaipaServ.getInstance().report();
        for (SaipaEnti saipaEnti : saipaList) {
            System.out.println(i + "th car information:");
            System.out.print("car id is: " + saipaEnti.getCarId() + ", ");
            System.out.print("model is: " + saipaEnti.getModel() + ", ");
            System.out.print("color is: " + saipaEnti.getColor() + ", ");
            System.out.print("max speed is: " + saipaEnti.getMaxSpeed() + ", ");
            System.out.print("construction year is: " + saipaEnti.getConstructionYear() + ", ");
            System.out.println("price is: " + saipaEnti.getPrice());
            i++;
        }
    }

    public boolean select(int carId) throws Exception {
        boolean check = false;
        List<SaipaEnti> saipaList = SaipaServ.getInstance().report();
        for (SaipaEnti saipaEnti : saipaList) {
            if(carId == saipaEnti.getCarId()) {
                check = true;
                break;
            }
        }
        return check;
    }
}
