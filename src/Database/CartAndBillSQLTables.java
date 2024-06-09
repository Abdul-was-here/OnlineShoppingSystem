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


public class CartAndBillSQLTables {
    
        public void createCartAndBillTablesIfNotExists(Connection con) throws SQLException {

        DatabaseMetaData dbm = con.getMetaData();

        ResultSet tables = dbm.getTables(null, null, "CART", null);

        if (!tables.next()) {
            PreparedStatement pat1 = con.prepareStatement("CREATE TABLE cart ("
                    + "id INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,"
                    + "ItemName VARCHAR(255),"
                    + "BrandName VARCHAR(255),"
                    + "ModelName VARCHAR(255),"
                    + "Price DECIMAL(10, 2),"
                    + "Quantity INT,"
                    + "Total DECIMAL(10, 2))"
            );
            pat1.executeUpdate();
            pat1.close();

        }

        tables = dbm.getTables(null, null, "BILL", null);

        if (!tables.next()) {
            PreparedStatement pat = con.prepareStatement("CREATE TABLE bill ("
                    + "id INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,"
                    + "SubTotal DECIMAL(10, 2),"
                    + "Pay DECIMAL(10, 2),"
                    + "Balance DECIMAL(10, 2))"
            );
            pat.executeUpdate();
            pat.close();
        }

    }
}
    
