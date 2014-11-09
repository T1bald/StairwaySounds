package com.stairways.model.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by matvey on 11.10.14.
 */
public class Connector {
    private String url;
    private String pass;
    private String user;
    private String driver;

    public static final String DEFAULT_URL =
            "jdbc:mysql://localhost:3306/stairway_sounds";
    public static final String DEFAULT_PASS = "root";
    public static final String DEFAULT_USER = "root";
    public static final String DEFAULT_DRIVER = "com.mysql.jdbc.Driver";

    public Connector() {
        try {
            Class.forName(DEFAULT_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Error: UNABLE TO SETUP DB CONNECTION." +
                    "\n DRIVER CLASS WASN`T FOUND.");
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error: UNABLE TO SETUP DB CONNECTION");
        }

        this.user = DEFAULT_USER;
        this.pass = DEFAULT_PASS;
        this.url = DEFAULT_URL;
        this.driver = DEFAULT_DRIVER;
    }

    public Connector(String driver, String user, String password, String url) {
        this.user = user;
        this.pass = password;
        this.url = url;
        this.driver = driver;
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Error: UNABLE TO SETUP DB CONNECTION." +
                    "\n DRIVER CLASS WASN`T FOUND.");
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error: UNABLE TO SETUP DB CONNECTION");
        }
    }

    public Statement createStatement(Connection connection, String query) {
        Statement statement = null;
        try {
            statement = connection.createStatement();
            return  statement;
           } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
            return null;
        }
    }

    public Connection getConnection() {
        Connection conn = null;
            try {
                conn = DriverManager.getConnection(url, user, pass);
                return conn;
            } catch (SQLException sqlExp) {
                sqlExp.printStackTrace();
                return null;
            }
    }

    public void executeStatement(String query) {
        Statement statement = null;
        Connection connection = new Connector().getConnection();

        try {
            statement = connection.createStatement();
            ResultSet rs = null;
            try {
                rs = statement.executeQuery(query);
                while (rs.next()) {
                    System.out.println("user_id : " + rs.getString("id") +
                            " email : " + rs.getString("email"));
//                        System.out.println(rs.getString("email"));
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        }
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }



}
