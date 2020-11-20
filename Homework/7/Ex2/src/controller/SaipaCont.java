package controller;

import model.entity.SaipaEnti;
import model.service.SaipaServ;

import java.util.*;

public class SaipaCont {

    public SaipaCont() {

    }

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
