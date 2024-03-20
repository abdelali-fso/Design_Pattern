package org.example.Decorator;

public class SugarDecorator extends CoffeDecorator{
    public SugarDecorator(Coffee decoratorCoffe) {
        super(decoratorCoffe);
    }

    public Double getCost() {
        return super.getCost()+0.2;
    }

    public String getDescription() {
        return super.getDescription()+" , with sugar";
    }
}
