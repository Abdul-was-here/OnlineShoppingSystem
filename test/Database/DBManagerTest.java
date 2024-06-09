/*
 * Name and Student ID: Abdulmalik Alnasra(15897596) , Akshay Silswal(22163010) 
 * Course Code/Stream: COMP603/W101A
 * Program Design and Construction
 * Project Group 150
 * Project 2
 */
package Database;

import java.sql.Connection;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

public class DBManagerTest {
    
    public DBManagerTest() {
    }

    @Test
    public void testGetConnection() throws Exception {
        Connection connection = null;
        try {
            connection = DBManager.getConnection();
            assertNotNull("Connection should not be null", connection);
            assertFalse("Connection should not be closed", connection.isClosed());
        } catch (SQLException e) {
            fail("Failed to establish connection: " + e.getMessage());
        } finally {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }
}
