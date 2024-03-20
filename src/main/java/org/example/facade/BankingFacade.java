package org.example.facade;

public class BankingFacade {
    private AccountSubsystem accountSubsystem;
    private TransactionSubsystem transactionSubsystem;
    private FundsVerificationSubsystem fundsVerificationSubsystem;

    public BankingFacade() {
        this.accountSubsystem = new AccountSubsystem();
        this.transactionSubsystem = new TransactionSubsystem();
        this.fundsVerificationSubsystem = new FundsVerificationSubsystem();
    }

    // Méthode pour ouvrir un compte
    public void openAccount() {
        accountSubsystem.createAccount();
    }

    // Méthode pour effectuer un dépôt
    public void deposit() {
        transactionSubsystem.deposit();
    }

    // Méthode pour effectuer un retrait
    public void withdraw() {
        transactionSubsystem.withdraw();
    }

    // Méthode pour fermer un compte
    public void closeAccount() {
        accountSubsystem.closeAccount();
    }

    // Méthode pour vérifier le solde
    public void checkBalance() {
        fundsVerificationSubsystem.checkBalance();
    }
}
