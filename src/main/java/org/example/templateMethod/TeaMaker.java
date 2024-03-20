package org.example.templateMethod;

public class TeaMaker extends BeverageMaker{
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }

    // Redéfinir le hook pour permettre au client de ne pas ajouter de condiments
    @Override
    boolean customerWantsCondiments() {
        // Demander au client s'il veut des condiments
        return false;
    }
}
