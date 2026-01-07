package com.studentportal.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    // Database credentials
    private static final String URL = "jdbc:postgresql://localhost:5432/student_db"; // Fixed name
    private static final String USER = "postgres";
    private static final String PASS = "Hrutik2000";

    public static Connection getConnection() {
        Connection con = null;

        try {
            // Load the driver (Ensure the JAR is in WEB-INF/lib)
            Class.forName("org.postgresql.Driver");
            
            // Establish connection
            con = DriverManager.getConnection(URL, USER, PASS);
            
            System.out.println("Connection Successful!");

        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL Driver not found. Check your WEB-INF/lib folder.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database connection failed. Check if pgAdmin is running.");
            e.printStackTrace();
        }

        return con;
    }
}