package org.example.singleton;

public class Main {
    public static void main(String[] args) {
        ConfigurationManager configManager = ConfigurationManager.getInstance();

        // Accéder aux paramètres de configuration
        String databaseURL = configManager.getDatabaseURL();
        String username = configManager.getUsername();
        String password = configManager.getPassword();

        // Utiliser les paramètres de configuration...
        System.out.println("Database URL: " + databaseURL);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}
