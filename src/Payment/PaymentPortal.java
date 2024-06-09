/*
 * Name and Student ID: Abdulmalik Alnasra(15897596) , Akshay Silswal(22163010) 
 * Course Code/Stream: COMP603/W101A
 * Program Design and Construction
 * Project Group 150
 * Project 2
 */
package Payment;

import javax.swing.JOptionPane;

public class PaymentPortal extends javax.swing.JFrame {

    /**
     * Creates new form PaymentPortal
     */
    public PaymentPortal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CardInformationText = new javax.swing.JLabel();
        PaymentBox = new javax.swing.JPanel();
        NameOnTheCardText = new javax.swing.JLabel();
        NameOnTheCardBox = new javax.swing.JTextField();
        CardNumberText = new javax.swing.JLabel();
        CardNumberBox = new javax.swing.JTextField();
        CVCText = new javax.swing.JLabel();
        CVCBox = new javax.swing.JTextField();
        ExpiryDateText = new javax.swing.JLabel();
        ExpiryDateBox = new javax.swing.JTextField();
        PayButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CardInformationText.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CardInformationText.setText("Card Information");

        PaymentBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        NameOnTheCardText.setText("Name on the card:");

        NameOnTheCardBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameOnTheCardBoxActionPerformed(evt);
            }
        });

        CardNumberText.setText("Card Number:");

        CVCText.setText("CVC:");

        ExpiryDateText.setText("Expiry Date:");

        PayButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PayButton.setText("Pay");
        PayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PaymentBoxLayout = new javax.swing.GroupLayout(PaymentBox);
        PaymentBox.setLayout(PaymentBoxLayout);
        PaymentBoxLayout.setHorizontalGroup(
            PaymentBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaymentBoxLayout.createSequentialGroup()
                .addGroup(PaymentBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PaymentBoxLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(PaymentBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PaymentBoxLayout.createSequentialGroup()
                                .addComponent(CVCText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CVCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ExpiryDateText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ExpiryDateBox, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PaymentBoxLayout.createSequentialGroup()
                                .addComponent(CardNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CardNumberBox))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaymentBoxLayout.createSequentialGroup()
                                .addComponent(NameOnTheCardText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NameOnTheCardBox, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PaymentBoxLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(PayButton)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        PaymentBoxLayout.setVerticalGroup(
            PaymentBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaymentBoxLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PaymentBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameOnTheCardText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameOnTheCardBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(PaymentBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CardNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CardNumberBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(PaymentBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PaymentBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CVCText)
                        .addComponent(CVCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PaymentBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ExpiryDateText)
                        .addComponent(ExpiryDateBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(PayButton)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(PaymentBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CardInformationText)
                .addGap(211, 211, 211))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(CardInformationText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PaymentBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Thanks for the purchase, Your shipment is on its way. Please visit again.");
        dispose();
    }//GEN-LAST:event_PayButtonActionPerformed

    private void NameOnTheCardBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameOnTheCardBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameOnTheCardBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PaymentPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentPortal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CVCBox;
    private javax.swing.JLabel CVCText;
    private javax.swing.JLabel CardInformationText;
    private javax.swing.JTextField CardNumberBox;
    private javax.swing.JLabel CardNumberText;
    private javax.swing.JTextField ExpiryDateBox;
    private javax.swing.JLabel ExpiryDateText;
    private javax.swing.JTextField NameOnTheCardBox;
    private javax.swing.JLabel NameOnTheCardText;
    private javax.swing.JButton PayButton;
    private javax.swing.JPanel PaymentBox;
    // End of variables declaration//GEN-END:variables
}
