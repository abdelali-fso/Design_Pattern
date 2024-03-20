package org.example.templateMethod;

public class Main {
    public static void main(String[] args) {
        BeverageMaker teaMaker = new TeaMaker();
        System.out.println("Making tea...");
        teaMaker.prepareBeverage();

        System.out.println();

        BeverageMaker coffeeMaker = new CoffeeMaker();
        System.out.println("Making coffee...");
        coffeeMaker.prepareBeverage();
    }
}
