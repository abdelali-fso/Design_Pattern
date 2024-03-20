package org.example.Decorator;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println("Cost: " + coffee.getCost() + ", Description: " + coffee.getDescription());

        // Ajout du lait au café
        coffee = new MilkDecorator(coffee);
        System.out.println("Cost: " + coffee.getCost() + ", Description: " + coffee.getDescription());

        // Ajout du sucre au café avec lait
        coffee = new SugarDecorator(coffee);
        System.out.println("Cost: " + coffee.getCost() + ", Description: " + coffee.getDescription());
    }
}
