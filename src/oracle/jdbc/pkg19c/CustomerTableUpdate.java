/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oracle.jdbc.pkg19c;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Muhammad Shaheer
 */
public class CustomerTableUpdate extends javax.swing.JFrame {
   private int customerId; 
   private String firstName,lastName,CNIC,password;
   private long contactNum;
   
   Connection conn = OracleJdbc19c.getConnection();
    OracleJdbc19c oj = new OracleJdbc19c();
    /**
     * Creates new form CustomerTableUpdate
     */
    public CustomerTableUpdate() {
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

        firstname_label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        customerId_textField = new javax.swing.JTextField();
        firstname_label1 = new javax.swing.JLabel();
        firstName_TextField = new javax.swing.JTextField();
        firstname_label2 = new javax.swing.JLabel();
        lastName_TextField = new javax.swing.JTextField();
        firstname_label3 = new javax.swing.JLabel();
        contact_TextField = new javax.swing.JTextField();
        firstname_label4 = new javax.swing.JLabel();
        CNIC_TextField = new javax.swing.JTextField();
        update_button = new javax.swing.JButton();
        password_TextField = new javax.swing.JTextField();
        firstname_label5 = new javax.swing.JLabel();

        firstname_label.setText("First Name");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel1.setText("CUSTOMER TABLE");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel2.setText("UPDATE ");

        jLabel3.setText("CustomerId:");

        customerId_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerId_textFieldActionPerformed(evt);
            }
        });

        firstname_label1.setText("First Name:");

        firstName_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstName_TextFieldActionPerformed(evt);
            }
        });

        firstname_label2.setText("Last Name:");

        lastName_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastName_TextFieldActionPerformed(evt);
            }
        });

        firstname_label3.setText("CNIC:");

        contact_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contact_TextFieldActionPerformed(evt);
            }
        });

        firstname_label4.setText("Contact:");

        CNIC_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNIC_TextFieldActionPerformed(evt);
            }
        });

        update_button.setText("Update");
        update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_buttonActionPerformed(evt);
            }
        });

        password_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_TextFieldActionPerformed(evt);
            }
        });

        firstname_label5.setText("Password:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(customerId_textField))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(firstname_label2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lastName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(firstname_label1)
                                .addComponent(firstname_label3)
                                .addComponent(firstname_label4)
                                .addComponent(firstname_label5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(contact_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CNIC_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(firstName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(update_button, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(password_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(jLabel2)
                    .addContainerGap(217, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(customerId_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstname_label1)
                    .addComponent(firstName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstname_label2)
                    .addComponent(lastName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstname_label3)
                    .addComponent(CNIC_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstname_label4)
                    .addComponent(contact_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstname_label5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(update_button, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(jLabel2)
                    .addContainerGap(313, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void customerId_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerId_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerId_textFieldActionPerformed

    private void firstName_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstName_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstName_TextFieldActionPerformed

    private void lastName_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastName_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastName_TextFieldActionPerformed

    private void contact_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contact_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contact_TextFieldActionPerformed

    private void CNIC_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNIC_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CNIC_TextFieldActionPerformed

    private void update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_buttonActionPerformed
          customerId = Integer.parseInt(customerId_textField.getText());
          firstName = firstName_TextField.getText();
          lastName = lastName_TextField.getText();
          CNIC = CNIC_TextField.getText();
          contactNum = Long.parseLong(contact_TextField.getText());
          password = password_TextField.getText();
          UpdateSuccess us = new UpdateSuccess();
           
try {
            
            String sql =  "UPDATE Customer SET first_name=?,last_name=?,CNIC=?,contact_number=?,pass=? WHERE customer_id =?";        
            PreparedStatement st = conn.prepareStatement(sql);
            
            st.setString(1,firstName);
            st.setString(2,lastName);
            st.setString(3,CNIC);
            st.setLong(4,contactNum);
            st.setString(5,password);
            st.setInt(6, customerId);
            
            int rows = st.executeUpdate();
            
            if (rows > 0 ) {
                us.setVisible(true);
            }
            conn.close();
         } catch (SQLException ex) {
            Logger.getLogger(OracleJdbc19c.class.getName()).log(Level.SEVERE, null, ex);
           
        }      
    }//GEN-LAST:event_update_buttonActionPerformed

    private void password_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_TextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerTableUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerTableUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerTableUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerTableUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CustomerTableUpdate ctu = new CustomerTableUpdate();
                ctu.pack();
                ctu.setLocationRelativeTo(null);
                ctu.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CNIC_TextField;
    private javax.swing.JTextField contact_TextField;
    private javax.swing.JTextField customerId_textField;
    private javax.swing.JTextField firstName_TextField;
    private javax.swing.JLabel firstname_label;
    private javax.swing.JLabel firstname_label1;
    private javax.swing.JLabel firstname_label2;
    private javax.swing.JLabel firstname_label3;
    private javax.swing.JLabel firstname_label4;
    private javax.swing.JLabel firstname_label5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField lastName_TextField;
    private javax.swing.JTextField password_TextField;
    public javax.swing.JButton update_button;
    // End of variables declaration//GEN-END:variables
}