package org.example.templateMethod;

public abstract class BeverageMaker {

    // Template method qui définit le processus de préparation de la boisson
    public final void prepareBeverage() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
        serve();
    }

    // Méthodes abstraites à implémenter par les sous-classes
    abstract void brew();
    abstract void addCondiments();

    // Méthodes communes avec une implémentation par défaut
    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    void serve() {
        System.out.println("Serving beverage");
    }

    // Méthode hook (crochet) pour permettre aux sous-classes de redéfinir le comportement par défaut
    boolean customerWantsCondiments() {
        return true;
    }

}
