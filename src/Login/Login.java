/*
 * Name and Student ID: Abdulmalik Alnasra(15897596) , Akshay Silswal(22163010) 
 * Course Code/Stream: COMP603/W101A
 * Program Design and Construction
 * Project Group 150
 * Project 2
 */
package Login;

import Administrator.AdministratorItems;
import CustomerManagement.UsersItems;
import Database.DBManager;
import Database.UsersSQLTable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    Connection con;
    PreparedStatement pst, stm;
    ResultSet rs;
    ResultSet rs1;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OnlineShoppingTopText = new javax.swing.JLabel();
        LoginBox = new javax.swing.JPanel();
        LoginText = new javax.swing.JLabel();
        UserName = new javax.swing.JLabel();
        UserNameTextBox = new javax.swing.JTextField();
        UserTypeText = new javax.swing.JLabel();
        UserTypeDropDownMenu = new javax.swing.JComboBox<>();
        PasswordText = new javax.swing.JLabel();
        PasswordBox = new javax.swing.JPasswordField();
        SignUpButton = new javax.swing.JButton();
        LoginButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        OnlineShoppingTopText.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        OnlineShoppingTopText.setText("Online Shopping");

        LoginBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        LoginText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LoginText.setText("Login");

        UserName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        UserName.setText("User Name:");

        UserTypeText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        UserTypeText.setText("User Type:");

        UserTypeDropDownMenu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        UserTypeDropDownMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "Administrator" }));
        UserTypeDropDownMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserTypeDropDownMenuActionPerformed(evt);
            }
        });

        PasswordText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PasswordText.setText("Password:");

        SignUpButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SignUpButton.setText("Home Page");
        SignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpButtonActionPerformed(evt);
            }
        });

        LoginButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        CancelButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CancelButton.setText("Clear");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginBoxLayout = new javax.swing.GroupLayout(LoginBox);
        LoginBox.setLayout(LoginBoxLayout);
        LoginBoxLayout.setHorizontalGroup(
            LoginBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginBoxLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(LoginBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(UserName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SignUpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PasswordText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UserTypeText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(LoginBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(LoginBoxLayout.createSequentialGroup()
                        .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                    .addComponent(LoginText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UserNameTextBox)
                    .addComponent(UserTypeDropDownMenu, 0, 162, Short.MAX_VALUE)
                    .addComponent(PasswordBox))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LoginBoxLayout.setVerticalGroup(
            LoginBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LoginText, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LoginBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserName, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(UserNameTextBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(LoginBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserTypeText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UserTypeDropDownMenu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(LoginBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordText, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(PasswordBox))
                .addGap(18, 18, 18)
                .addGroup(LoginBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SignUpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LoginButton)
                    .addComponent(CancelButton))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(LoginBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(OnlineShoppingTopText, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(OnlineShoppingTopText, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoginBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        try {

            if (UserNameTextBox.getText().isEmpty() || PasswordBox.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Invalid username or password");
            } else {
                String uname = UserNameTextBox.getText();
                String pwd = PasswordBox.getText();
                String utype = UserTypeDropDownMenu.getSelectedItem().toString();

                con = DBManager.getConnection();

                UsersSQLTable userssqltable = new UsersSQLTable();

                // Create the USERS table if it doesn't exist
                userssqltable.createUsersTableIfNotExists(con);
                
                pst = con.prepareStatement("select * from users where username = ? and usertype = ? and password = ?");
                pst.setString(1, uname);
                pst.setString(2, utype);
                pst.setString(3, pwd);
                rs = pst.executeQuery();

                if(rs.next()) 
                {
                    if("Administrator".equals(utype))
                    {
                    AdministratorItems t = new AdministratorItems();
                    this.hide();
                    t.setVisible(true);                                 
                    }
                    else
                    {
                            UsersItems s = new UsersItems();
                            this.hide();
                            s.setVisible(true);               
                    }
                } 
                else {
                    JOptionPane.showMessageDialog(this, "Invalid username or password");
                    UserNameTextBox.setText("");
                    PasswordBox.setText("");
                    UserNameTextBox.requestFocus();
                }

            }

        
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_LoginButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        // TODO add your handling code here:
        UserNameTextBox.setText("");
        PasswordBox.setText("");
        UserNameTextBox.requestFocus();

    }//GEN-LAST:event_CancelButtonActionPerformed

    private void SignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpButtonActionPerformed
        HomeScreen homeScreen = new HomeScreen();
        this.hide();
        homeScreen.setVisible(true);

    }//GEN-LAST:event_SignUpButtonActionPerformed

    private void UserTypeDropDownMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserTypeDropDownMenuActionPerformed

    }//GEN-LAST:event_UserTypeDropDownMenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JPanel LoginBox;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel LoginText;
    private javax.swing.JLabel OnlineShoppingTopText;
    private javax.swing.JPasswordField PasswordBox;
    private javax.swing.JLabel PasswordText;
    private javax.swing.JButton SignUpButton;
    private javax.swing.JLabel UserName;
    private javax.swing.JTextField UserNameTextBox;
    private javax.swing.JComboBox<String> UserTypeDropDownMenu;
    private javax.swing.JLabel UserTypeText;
    // End of variables declaration//GEN-END:variables
}
