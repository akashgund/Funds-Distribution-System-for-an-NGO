/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.SchoolAdmin;

import Business.Enterprize.Enterprize;
import Business.Users.UserAccount;
import Interfaces.*;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Dell
 */
public class SchoolTreasuryWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form LoginPage
     */
    JPanel container;
    private Enterprize enterprise;
    private UserAccount account;
    public SchoolTreasuryWorkArea(JPanel container,UserAccount account, Enterprize enterprise) {
        initComponents();
        this.container = container;
        this.enterprise = enterprise;
        this.account = account;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userProcessContainer = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        loginButton3 = new javax.swing.JButton();
        loginButton4 = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        userProcessContainer.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Manage Finances");

        loginButton3.setBackground(new java.awt.Color(255, 0, 51));
        loginButton3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        loginButton3.setForeground(new java.awt.Color(255, 255, 102));
        loginButton3.setText("Check Mails");
        loginButton3.setBorder(null);
        loginButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButton3ActionPerformed(evt);
            }
        });

        loginButton4.setBackground(new java.awt.Color(255, 0, 51));
        loginButton4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        loginButton4.setForeground(new java.awt.Color(255, 255, 102));
        loginButton4.setText("Manage Funds");
        loginButton4.setBorder(null);
        loginButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButton4ActionPerformed(evt);
            }
        });

        BackButton.setBackground(new java.awt.Color(255, 0, 51));
        BackButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        BackButton.setForeground(new java.awt.Color(255, 255, 102));
        BackButton.setText("<<Back");
        BackButton.setBorder(null);
        BackButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout userProcessContainerLayout = new javax.swing.GroupLayout(userProcessContainer);
        userProcessContainer.setLayout(userProcessContainerLayout);
        userProcessContainerLayout.setHorizontalGroup(
            userProcessContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userProcessContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(196, Short.MAX_VALUE))
            .addGroup(userProcessContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(userProcessContainerLayout.createSequentialGroup()
                    .addGap(57, 57, 57)
                    .addGroup(userProcessContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(loginButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                    .addGroup(userProcessContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(loginButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(57, 57, 57)))
        );
        userProcessContainerLayout.setVerticalGroup(
            userProcessContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userProcessContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userProcessContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(BackButton))
                .addContainerGap(554, Short.MAX_VALUE))
            .addGroup(userProcessContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(userProcessContainerLayout.createSequentialGroup()
                    .addGap(174, 174, 174)
                    .addGroup(userProcessContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(userProcessContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(loginButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(loginButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(174, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addComponent(userProcessContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(userProcessContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loginButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButton3ActionPerformed
        // TODO add your handling code here:
        ManageSchoolEmails panel = new ManageSchoolEmails(container,account);
        container.add("ManageEmails", panel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_loginButton3ActionPerformed

    private void loginButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButton4ActionPerformed
        // TODO add your handling code here:
        ManageFinances panel = new ManageFinances(container ,account, enterprise);
        container.add("ManageEmails", panel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_loginButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton loginButton3;
    private javax.swing.JButton loginButton4;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
