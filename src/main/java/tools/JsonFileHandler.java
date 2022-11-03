package tools;

import models.Car;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.CarList;

import java.io.File;


public class JsonFileHandler{

    public static void main(String[] args) {
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            File userRegister = new File("src/main/java/json/bil.json");

            CarList currentCar = objectMapper.readValue(userRegister, CarList.class);
            System.out.println(currentCar);

        } catch (final Exception e){
            e.printStackTrace();
        }

    }


}



