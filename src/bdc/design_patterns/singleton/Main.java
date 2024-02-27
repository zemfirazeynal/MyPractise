package bdc.design_patterns.singleton;

import bdc.design_patterns.singleton.config.DatabaseConnectionConfig;

public class Main {
    public static void main(String[] args) {
        DatabaseConnectionConfig config_1 = DatabaseConnectionConfig.getDatabaseConnectionConfig();
        DatabaseConnectionConfig config_2 = DatabaseConnectionConfig.getDatabaseConnectionConfig();

        System.out.println(config_1);
        System.out.println(config_2);

        System.out.println();

        System.out.println(config_1.getUsername());
        System.out.println(config_1.getPassword());
        System.out.println(config_1.getUrl());
    }

}
