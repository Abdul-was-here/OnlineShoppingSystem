/*
 * Name and Student ID: Abdulmalik Alnasra(15897596) , Akshay Silswal(22163010) 
 * Course Code/Stream: COMP603/W101A
 * Program Design and Construction
 * Project Group 150
 * Project 2
 */
package Database;


import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UsersSQLTable {
    
     public void createUsersTableIfNotExists(Connection con) throws SQLException {
        DatabaseMetaData dbm = con.getMetaData();
        ResultSet tables = dbm.getTables(null, null, "USERS", null);

        // Create the USERS table if it doesn't exist
        if (!tables.next()) {
            PreparedStatement pst = con.prepareStatement("CREATE TABLE users ("
                    + "id INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,"
                    + "name VARCHAR(255),"
                    + "dob VARCHAR(255),"
                    + "gender VARCHAR(10),"
                    + "email VARCHAR(255),"
                    + "contact VARCHAR(20),"
                    + "street VARCHAR(255),"
                    + "city VARCHAR(255),"
                    + "state VARCHAR(255),"
                    + "pincode VARCHAR(10),"
                    + "username VARCHAR(255),"
                    + "usertype VARCHAR(255),"
                    + "password VARCHAR(255))");
            pst.executeUpdate();
            pst.close();
        }
    }
}