package org.example.facade;

public class Main {
    public static void main(String[] args) {
        BankingFacade bankingFacade = new BankingFacade();

        // Ouvrir un compte
        bankingFacade.openAccount();

        // Effectuer un dépôt
        bankingFacade.deposit();

        // Effectuer un retrait
        bankingFacade.withdraw();

        // Vérifier le solde
        bankingFacade.checkBalance();

        // Fermer le compte
        bankingFacade.closeAccount();
    }
}
