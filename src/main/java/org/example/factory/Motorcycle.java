package org.example.factory;

public class Motorcycle implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Driving a motorcycle...");
    }
}
