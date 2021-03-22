package org.roskildedaycare.admin.Repository.Driver;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Connector {

    public final static String DRIVER_URL = "jdbc:mysql://den1.mysql6.gear.host/rdas";
    public final static String USERNAME = "rdas";
    public final static String PASSWORD = "Um84_G2km49?";

    public static Statement statement;
    public static Connection connection;

    public static Statement connectRDAS() {
        try {
            connection = DriverManager.getConnection(DRIVER_URL, USERNAME, PASSWORD);
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return statement;
    }

}
