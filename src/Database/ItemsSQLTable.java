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

public class ItemsSQLTable {
    
    public void createItemsTableIfNotExists(Connection con1) throws SQLException {

        DatabaseMetaData dbm = con1.getMetaData();
        ResultSet tables = dbm.getTables(null, null, "ITEMS", null);

        // Create the ITEMS table if it doesn't exist
        if (!tables.next()) {
            PreparedStatement insert = con1.prepareStatement("CREATE TABLE ITEMS ("
                    + "ItemID VARCHAR(255) PRIMARY KEY NOT NULL,"
                    + "ItemName VARCHAR(255),"
                    + "BrandID VARCHAR(255),"
                    + "BrandName VARCHAR(255),"
                    + "ModelID VARCHAR(255),"
                    + "ModelName VARCHAR(255),"
                    + "DateOfManufacture VARCHAR(255),"
                    + "Price VARCHAR(255))"
            );
            insert.executeUpdate();
            insert.close();
        }
        

    }
    
    public boolean itemIdExists(Connection con, String itemId) throws SQLException {
        String query = "SELECT COUNT(*) FROM ITEMS WHERE ItemID = ?";
        try (PreparedStatement pst = con.prepareStatement(query)) {
            pst.setString(1, itemId);
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
            }
        }
        return false;
    }

    public void ShopData(Connection con1) throws SQLException {
         String[] shopItems = {
            "('1', 'iPhone 13', '101', 'Apple', '501', 'A2633', '2023-01-15', '999.99')",
            "('2', 'Galaxy S21', '102', 'Samsung', '502', 'SM-G991B', '2023-02-10', '799.99')",
            "('3', 'XPS 13', '103', 'Dell', '503', '9310', '2023-03-20', '1299.99')",
            "('4', 'MacBook Pro', '101', 'Apple', '504', 'A2338', '2023-04-05', '2399.99')",
            "('5', 'Sony WH-1000XM4', '104', 'Sony', '505', 'WH1000XM4', '2023-05-30', '349.99')",
            "('6', 'OLED TV', '105', 'LG', '506', 'OLED55CXPUA', '2023-06-25', '1499.99')",
            "('7', 'AirPods Pro', '101', 'Apple', '507', 'A2083', '2023-07-12', '249.99')",
            "('8', 'Surface Pro 7', '106', 'Microsoft', '508', 'VNX-00001', '2023-08-19', '899.99')",
            "('9', 'Refrigerator', '107', 'Whirlpool', '509', 'WRX735SDHZ', '2023-09-15', '1999.99')",
            "('10', 'Washing Machine', '108', 'Bosch', '510', 'WAN28201GB', '2023-10-10', '699.99')"
        };
        for (String item : shopItems) {
            String[] itemData = item.replace("(", "").replace(")", "").replace("'", "").split(", ");
            String itemId = itemData[0];

            if (!itemIdExists(con1, itemId)) {
                PreparedStatement insert = con1.prepareStatement("INSERT INTO ITEMS (ItemID, ItemName, BrandID, BrandName, ModelID, ModelName, DateOfManufacture, Price) VALUES " + item);
                insert.executeUpdate();
                insert.close();
            } 
        }
    }
}
    

