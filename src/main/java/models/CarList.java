package models;
import java.util.ArrayList;
import models.Car;

public class CarList {
    ArrayList<Car> cList=new ArrayList<Car>();

    public CarList(ArrayList<Car> cList) {
        this.cList = cList;
    }

    public ArrayList<Car> getcList() {
        return cList;
    }

    public void setcList(ArrayList<Car> cList) {
        this.cList = cList;
    }
}
