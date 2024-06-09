/*
 * Name and Student ID: Abdulmalik Alnasra(15897596) , Akshay Silswal(22163010) 
 * Course Code/Stream: COMP603/W101A
 * Program Design and Construction
 * Project Group 150
 * Project 2
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Timer;
import java.util.TimerTask;

public class DBManager {
    private static Connection con = null;
    private static final String DB_URL = "jdbc:derby:OnlineShopping_db;create=true";

    // Connection check interval in milliseconds
    private static final long CONNECTION_CHECK_INTERVAL = 60000; // 1 minute

    public static Connection getConnection() throws SQLException {
        if (con != null && !con.isClosed()) {
            return con;
        } else {
            try {
                Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
                // Attempt to establish connection
                try {
                    con = DriverManager.getConnection(DB_URL);
                    System.out.println("Connected to database.");
                } catch (SQLException ex) {
                    System.out.println("Unable to connect to database: " + ex.getMessage());
                    throw ex;
                }

                // Start connection check timer
                startConnectionCheckTimer();
            } catch (ClassNotFoundException e) {
                System.out.println("Database driver not found: " + e.getMessage());
                throw new SQLException("Database driver not found", e);
            }
            return con;
        }
    }

    // Method to start a timer that checks the connection status periodically
    private static void startConnectionCheckTimer() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                try {
                    if (con != null && con.isClosed()) {
                        System.out.println("Database connection is closed. Attempting to reconnect...");
                        con = DriverManager.getConnection(DB_URL);
                        System.out.println("Reconnected to database.");
                    }
                } catch (SQLException e) {
                    System.out.println("Error reconnecting to database: " + e.getMessage());
                }
            }
        }, CONNECTION_CHECK_INTERVAL, CONNECTION_CHECK_INTERVAL);
    }
}
