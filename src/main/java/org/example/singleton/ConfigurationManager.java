package org.example.singleton;

public class ConfigurationManager {

    private static ConfigurationManager instance;

    private String databaseURL;
    private String username;
    private String password;

    private ConfigurationManager(){
        this.loadConfiguration();
    }
    public static ConfigurationManager getInstance(){
        if(instance == null)
            instance = new ConfigurationManager();
        return instance;
    }

    public String getDatabaseURL() {
        return databaseURL;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    private void loadConfiguration(){
        databaseURL = "jdbc:mysql://localhost:3306/mydatabase";
        username = "aberrabhia";
        password = "***********";
        System.out.println("Configuration loaded successfully.");
    }
}
