package models;
import com.fasterxml.jackson.annotation.JsonProperty;

//extend user
public class Car {
    String brand;
    String model;
    int year;

    public Car(){
        //creating an empty constructor to prevent error when deserializing and reading from json file.
    }

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}