/*
 * Name and Student ID: Abdulmalik Alnasra(15897596) , Akshay Silswal(22163010) 
 * Course Code/Stream: COMP603/W101A
 * Program Design and Construction
 * Project Group 150
 * Project 2
 */
package Administrator;


import org.junit.Before;
import org.junit.Test;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import static org.junit.Assert.*;

public class AdministratorItemsTest {
    
    private AdministratorItems adminItems;

    @Before
    public void setUp() {
        adminItems = new AdministratorItems();

        // Initialize GUI components
        adminItems.ItemIDBox = new JTextField();
        adminItems.ItemNameBox = new JTextField();
        adminItems.BrandIDBox = new JTextField();
        adminItems.BrandNameTextBox = new JTextField();
        adminItems.ModelIDBox = new JTextField();
        adminItems.ModelNameBox = new JTextField();
        adminItems.DateOfManufactureBox = new JTextField();
        adminItems.PriceBox = new JTextField();
        adminItems.AddButton = new JButton();
        adminItems.EditButton = new JButton();
        adminItems.DeleteButton = new JButton();
        adminItems.PurchaseItemsButton = new JButton();
        adminItems.LogOutButton = new JButton();
        adminItems.AdministratorTable = new JTable(new DefaultTableModel(
                new Object[]{"itemid", "itemname", "brandid", "brandname", "modelid", "modelname", "dateofmanufacture", "price"}, 0
        ));
        
    }

    @Test
    public void testGUIInitialization() {
        // Test GUI initialization
        assertNotNull(adminItems);
        assertNotNull(adminItems.ItemIDBox);
        assertNotNull(adminItems.ItemNameBox);
        assertNotNull(adminItems.BrandIDBox);
        assertNotNull(adminItems.BrandNameTextBox);
        assertNotNull(adminItems.ModelIDBox);
        assertNotNull(adminItems.ModelNameBox);
        assertNotNull(adminItems.DateOfManufactureBox);
        assertNotNull(adminItems.PriceBox);
        assertNotNull(adminItems.AddButton);
        assertNotNull(adminItems.EditButton);
        assertNotNull(adminItems.DeleteButton);
        assertNotNull(adminItems.PurchaseItemsButton);
        assertNotNull(adminItems.LogOutButton);
        assertNotNull(adminItems.AdministratorTable);
    }

    
    @Test
    public void testAddButtonWithEmptyFields() {
        // Simulate empty input fields
        adminItems.ItemIDBox.setText("");
        adminItems.ItemNameBox.setText("");
        adminItems.BrandIDBox.setText("");
        adminItems.BrandNameTextBox.setText("");
        adminItems.ModelIDBox.setText("");
        adminItems.ModelNameBox.setText("");
        adminItems.DateOfManufactureBox.setText("");
        adminItems.PriceBox.setText("");
        
        // Simulate Add button click
        adminItems.AddButton.doClick();

        // Verify that no item was added to the table
        JTable table = adminItems.AdministratorTable;
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        assertEquals(0, model.getRowCount());
    }

    @Test
    public void testInvalidPriceInput() {
        // Simulate invalid price input
        adminItems.ItemIDBox.setText("test1");
        adminItems.ItemNameBox.setText("Test Item 1");
        adminItems.BrandIDBox.setText("brand1");
        adminItems.BrandNameTextBox.setText("Test Brand 1");
        adminItems.ModelIDBox.setText("model1");
        adminItems.ModelNameBox.setText("Test Model 1");
        adminItems.DateOfManufactureBox.setText("2024-05-04");
        adminItems.PriceBox.setText("invalid_price");  // Invalid price input
        
        // Simulate Add button click
        adminItems.AddButton.doClick();

        // Verify that no item was added to the table due to invalid price input
        JTable table = adminItems.AdministratorTable;
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        assertEquals(0, model.getRowCount());
    }
}
