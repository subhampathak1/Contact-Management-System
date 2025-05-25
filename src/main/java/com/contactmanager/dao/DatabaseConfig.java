package com.contactmanager.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {
    // The URL should match your Workbench connection:
    // - localhost is the hostname
    // - 3306 is the default MySQL port
    // - contact_manager is the database name you created
    private static final String URL = "jdbc:mysql://localhost:3306/contact_manager";
    
    // This should match your Workbench connection username (usually "root")
    private static final String USER = "root";
    
    // This should match the password you use to connect in Workbench
    // Replace this with the password you used when testing the Workbench connection
    private static final String PASSWORD = "Deepanshu@779820";

    public static Connection getConnection() throws SQLException {
        try {
            // Register MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Create database connection
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new SQLException("MySQL JDBC Driver not found.", e);
        }
    }
} 