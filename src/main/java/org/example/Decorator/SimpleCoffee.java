package org.example.Decorator;

public class SimpleCoffee implements Coffee{
    @Override
    public Double getCost() {
        return 0.1;
    }

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
}
