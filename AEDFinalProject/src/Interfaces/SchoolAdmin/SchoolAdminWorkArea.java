/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.SchoolAdmin;


import Business.Ecosystem.Ecosystem;
import Business.Enterprize.Enterprize;
import Business.Network.Network;
import Business.Users.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Dell
 */
public class SchoolAdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form LoginPage
     */
    JPanel container;
    private Enterprize enterprise;
    private UserAccount account;
    public SchoolAdminWorkArea(JPanel container,UserAccount account, Enterprize enterprise) {
        initComponents();
        this.container = container;
        this.enterprise = enterprise;
        this.account = account;
        txtUser.setText(account.getEmployee().getName());
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
        txtUser = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        loginButton2 = new javax.swing.JButton();
        loginButton3 = new javax.swing.JButton();
        loginButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        userProcessContainer.setBackground(new java.awt.Color(255, 255, 255));

        txtUser.setBackground(new java.awt.Color(255, 0, 51));
        txtUser.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        txtUser.setForeground(new java.awt.Color(255, 255, 51));
        txtUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUser.setText("Tanmay Sinha");
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("My Dashboard");

        loginButton2.setBackground(new java.awt.Color(255, 0, 51));
        loginButton2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        loginButton2.setForeground(new java.awt.Color(255, 255, 102));
        loginButton2.setText("Process Requests");
        loginButton2.setBorder(null);
        loginButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButton2ActionPerformed(evt);
            }
        });

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
        loginButton4.setText("Manage Accounts");
        loginButton4.setBorder(null);
        loginButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButton4ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Desktop\\progress1.PNG")); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Desktop\\accounts.PNG")); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Desktop\\email.PNG")); // NOI18N

        javax.swing.GroupLayout userProcessContainerLayout = new javax.swing.GroupLayout(userProcessContainer);
        userProcessContainer.setLayout(userProcessContainerLayout);
        userProcessContainerLayout.setHorizontalGroup(
            userProcessContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userProcessContainerLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(userProcessContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addGroup(userProcessContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userProcessContainerLayout.createSequentialGroup()
                        .addComponent(loginButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userProcessContainerLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
            .addGroup(userProcessContainerLayout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(userProcessContainerLayout.createSequentialGroup()
                .addContainerGap(270, Short.MAX_VALUE)
                .addGroup(userProcessContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(userProcessContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userProcessContainerLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(231, 231, 231)))))
        );
        userProcessContainerLayout.setVerticalGroup(
            userProcessContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userProcessContainerLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(userProcessContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 196, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userProcessContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 3, Short.MAX_VALUE)
                    .addComponent(userProcessContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 3, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 1, Short.MAX_VALUE)
                    .addComponent(userProcessContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 1, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void loginButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButton2ActionPerformed
        // TODO add your handling code here:
        Interfaces.SchoolAdmin.ProcessRequests panel = new Interfaces.SchoolAdmin.ProcessRequests(container);
        container.add("ProcessRequests", panel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_loginButton2ActionPerformed

    private void loginButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButton3ActionPerformed
        // TODO add your handling code here:
        ManageSchoolEmails panel = new ManageSchoolEmails(container,account);
        container.add("ManageEmails", panel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_loginButton3ActionPerformed

    private void loginButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButton4ActionPerformed
        // TODO add your handling code here:
        ManageAccounts panel = new ManageAccounts(container , enterprise);
        container.add("ManageEmails", panel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_loginButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton loginButton2;
    private javax.swing.JButton loginButton3;
    private javax.swing.JButton loginButton4;
    private javax.swing.JTextField txtUser;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
