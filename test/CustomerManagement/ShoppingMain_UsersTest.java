/*
 * Name and Student ID: Abdulmalik Alnasra(15897596) , Akshay Silswal(22163010) 
 * Course Code/Stream: COMP603/W101A
 * Program Design and Construction
 * Project Group 150
 * Project 2
 */
package CustomerManagement;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ShoppingMain_UsersTest {

    private JTextField IDBox;
    private JTextField PriceBox;
    private JTextField NameBox;
    private JTextField BrandNameBox;
    private JTextField ModelNameBox;
    private JSpinner QuantityChangeButton;
    private JTable jTable1;
    private JTextField TotalCostBox;
    private DefaultTableModel df;

    @Before
    public void setUp() {
        IDBox = new JTextField();
        PriceBox = new JTextField();
        NameBox = new JTextField();
        BrandNameBox = new JTextField();
        ModelNameBox = new JTextField();
        QuantityChangeButton = new JSpinner(new SpinnerNumberModel(0, 0, Integer.MAX_VALUE, 1));
        TotalCostBox = new JTextField();
        jTable1 = new JTable(new DefaultTableModel(new Object[]{"ID", "Name", "Brand", "Model", "Price", "Quantity", "Total"}, 0));
        df = (DefaultTableModel) jTable1.getModel();
    }

    @Test
    public void testEmptyItemId() {
        IDBox.setText("");
        PriceBox.setText("100");
        NameBox.setText("Name");
        BrandNameBox.setText("Brand");
        ModelNameBox.setText("Model");

        // Simulate button click or method call
        addToCart();

        // Verify that the error message was shown
        // Here you would normally mock the JOptionPane, but we will skip it for this example
        assertEquals(0, df.getRowCount());
    }

    @Test
    public void testEmptyAddToCart() {
        IDBox.setText("1");
        PriceBox.setText("");
        NameBox.setText("Name");
        BrandNameBox.setText("Brand");
        ModelNameBox.setText("Model");

        // Simulate button click or method call
        addToCart();

        // Verify that the error message was shown
        assertEquals(0, df.getRowCount());
    }

    @Test
    public void testValidInputs() {
        IDBox.setText("1");
        PriceBox.setText("100");
        NameBox.setText("Name");
        BrandNameBox.setText("Brand");
        ModelNameBox.setText("Model");
        QuantityChangeButton.setValue(2);

        // Simulate button click or method call
        addToCart();

        // Verify that the row was added to the table
        assertEquals(1, df.getRowCount());
        assertEquals("1", df.getValueAt(0, 0));
        assertEquals("Name", df.getValueAt(0, 1));
        assertEquals("Brand", df.getValueAt(0, 2));
        assertEquals("Model", df.getValueAt(0, 3));
        assertEquals("100", df.getValueAt(0, 4));
        assertEquals("2", df.getValueAt(0, 5));
        assertEquals(200, df.getValueAt(0, 6)); // 100 * 2
    }

    private void addToCart() {
        try {
            String itemIdStr = IDBox.getText().trim();
            String addToCartErrorHandling = PriceBox.getText().trim();
            NameBox.getText().trim();
            BrandNameBox.getText().trim();
            ModelNameBox.getText().trim();

            if (itemIdStr.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Item ID field cannot be empty.");
                return;
            }
            if (addToCartErrorHandling.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please press enter before adding to cart.");
                return;
            }

            int itemId = Integer.parseInt(itemIdStr);
            int addToCart = Integer.parseInt(addToCartErrorHandling);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please enter valid numeric values for Item ID and Quantity.");
            return;
        }

        int quantityValue = Integer.parseInt(QuantityChangeButton.getValue().toString());
        if (quantityValue <= 0) {
            JOptionPane.showMessageDialog(null, "Please enter quantity.");
            return;
        }

        int cost = Integer.parseInt(PriceBox.getText());
        int qty = Integer.parseInt(QuantityChangeButton.getValue().toString());
        int tot = cost * qty;

        String priceText = PriceBox.getText();
        String quantityText = QuantityChangeButton.getValue().toString();

        if (!priceText.isEmpty() && !quantityText.isEmpty()) {
            cost = Integer.parseInt(priceText);
            qty = Integer.parseInt(quantityText);
            tot = cost * qty;
        } else {
            JOptionPane.showMessageDialog(null, "Price and Quantity must be specified.");
            return;
        }

        df = (DefaultTableModel) jTable1.getModel();
        df.addRow(new Object[]{
                IDBox.getText(), NameBox.getText(), BrandNameBox.getText(), ModelNameBox.getText(), PriceBox.getText(), QuantityChangeButton.getValue().toString(),
                tot
        });

        int sum = 0;
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            sum += Integer.parseInt(jTable1.getValueAt(i, 6).toString());
        }

        TotalCostBox.setText(String.valueOf(sum));
        IDBox.setText("");
        NameBox.setText("");
        BrandNameBox.setText("");
        ModelNameBox.setText("");
        PriceBox.setText("");
        QuantityChangeButton.setValue(0);
        IDBox.requestFocus();
    }
}
