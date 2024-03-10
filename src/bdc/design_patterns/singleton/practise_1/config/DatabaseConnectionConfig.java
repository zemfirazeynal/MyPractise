package bdc.design_patterns.singleton.practise_1.config;

public class DatabaseConnectionConfig {
    private String url;
    private String username;
    private String password;

    private DatabaseConnectionConfig() {

    }

    private static DatabaseConnectionConfig databaseConnectionConfig;

    public static DatabaseConnectionConfig getDatabaseConnectionConfig() {
        if (databaseConnectionConfig == null) {
            databaseConnectionConfig = new DatabaseConnectionConfig();
        }
        databaseConnectionConfig.username = "new - database - username";
        databaseConnectionConfig.password = "12345";
        databaseConnectionConfig.url = "https:/localhost:8080/postgresql";
        return databaseConnectionConfig;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


}
