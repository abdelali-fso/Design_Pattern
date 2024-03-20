package org.example.factory;

public class VehicleFactory {
    public static Vehicle createVehicle(String type){
        if(type.equalsIgnoreCase("car")){
            return new Car();
        } else if (type.equalsIgnoreCase("truck")) {
            return new Truck();
        } else if (type.equalsIgnoreCase("motorcycle")) {
            return new Motorcycle();
        }else {
            throw new IllegalArgumentException("Invalid vehicule type : "+type);
        }
    }
}
