package org.example.Decorator;

public class CoffeDecorator implements Coffee{
    protected Coffee decoratorCoffe;

    public CoffeDecorator(Coffee decoratorCoffe) {
        this.decoratorCoffe = decoratorCoffe;
    }

    @Override
    public Double getCost() {
        return decoratorCoffe.getCost();
    }

    @Override
    public String getDescription() {
        return decoratorCoffe.getDescription();
    }
}
