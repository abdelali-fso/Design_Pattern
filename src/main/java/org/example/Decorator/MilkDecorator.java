package org.example.Decorator;

public class MilkDecorator extends CoffeDecorator{
    public MilkDecorator(Coffee decoratorCoffe) {
        super(decoratorCoffe);
    }

    public Double getCost() {
        return super.getCost()+0.5;
    }

    public String getDescription() {
        return super.getDescription()+" , with milk";
    }
}
