/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.StateAdmin;

import Interfaces.*;

/**
 *
 * @author Dell
 */
public class ViewEmails extends javax.swing.JPanel {

    /**
     * Creates new form LoginPage
     */
    public ViewEmails() {
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

        userProcessContainer = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        loginButton = new javax.swing.JButton();
        loginButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        loginButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        userProcessContainer.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("MY EMAILS");

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("From  :");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        loginButton.setBackground(new java.awt.Color(255, 0, 51));
        loginButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 102));
        loginButton.setText("Reply");
        loginButton.setBorder(null);
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        loginButton2.setBackground(new java.awt.Color(255, 0, 51));
        loginButton2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        loginButton2.setForeground(new java.awt.Color(255, 255, 102));
        loginButton2.setText("<<Back");
        loginButton2.setBorder(null);
        loginButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout userProcessContainerLayout = new javax.swing.GroupLayout(userProcessContainer);
        userProcessContainer.setLayout(userProcessContainerLayout);
        userProcessContainerLayout.setHorizontalGroup(
            userProcessContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userProcessContainerLayout.createSequentialGroup()
                .addGroup(userProcessContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(userProcessContainerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, userProcessContainerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(loginButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, userProcessContainerLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(userProcessContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(userProcessContainerLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(105, 105, 105)
                                .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)))))
                .addGap(48, 48, 48))
        );
        userProcessContainerLayout.setVerticalGroup(
            userProcessContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userProcessContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userProcessContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(loginButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(userProcessContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("User Name");

        loginButton1.setBackground(new java.awt.Color(255, 0, 51));
        loginButton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        loginButton1.setForeground(new java.awt.Color(255, 255, 102));
        loginButton1.setText("View Mail");
        loginButton1.setBorder(null);
        loginButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(521, Short.MAX_VALUE)
                .addComponent(loginButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 3, Short.MAX_VALUE)
                    .addComponent(userProcessContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 3, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 446, Short.MAX_VALUE)
                .addComponent(loginButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(userProcessContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loginButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButton1ActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButtonActionPerformed

    private void loginButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton loginButton1;
    private javax.swing.JButton loginButton2;
    private javax.swing.JTextField txtUser;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}