package org.example.factory;

public class Main {
    public static void main(String[] args) {
        // Créer une voiture
        Vehicle car = VehicleFactory.createVehicle("car");
        car.drive();

        // Créer un camion
        Vehicle truck = VehicleFactory.createVehicle("truck");
        truck.drive();

        // Créer une moto
        Vehicle motorcycle = VehicleFactory.createVehicle("motorcycle");
        motorcycle.drive();

        // Créer une invalid type
        Vehicle invalidVehicle = VehicleFactory.createVehicle("invalid");
        invalidVehicle.drive();
    }
}
