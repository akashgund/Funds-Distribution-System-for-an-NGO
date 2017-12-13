/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.StateAdmin;

import Business.Ecosystem.Ecosystem;
import Business.Users.UserAccount;
import Business.WorkQueue.Email;
import Interfaces.*;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class ManageStateAdminEmails extends javax.swing.JPanel {

    /**
     * Creates new form LoginPage JPanel container; Ecosystem business;
     * UserAccount userAccount; public ManageStateAdminEmails(JPanel container,
     * Ecosystem business,UserAccount userAccount) { initComponents();
     * this.container = container; this.business= business;
     * this.userAccount=userAccount; populateTable();
     *
     * }
     *
     * /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    JPanel userProcessContainer;
    Ecosystem business;
    UserAccount userAccount;

    public ManageStateAdminEmails(JPanel container, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = container;
        this.business = business;
        this.userAccount = userAccount;
        populateTable();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        Panel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DisplayTable = new javax.swing.JTable();
        ViewEmail = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        ComposeEmail = new javax.swing.JButton();

        jFormattedTextField1.setText("jFormattedTextField1");

        setBackground(new java.awt.Color(255, 255, 255));

        Panel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("MY EMAILS");

        DisplayTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sender", "Date"
            }
        ));
        jScrollPane1.setViewportView(DisplayTable);

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(86, 86, 86)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
        );

        ViewEmail.setBackground(new java.awt.Color(255, 0, 51));
        ViewEmail.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        ViewEmail.setForeground(new java.awt.Color(255, 255, 102));
        ViewEmail.setText("View Mail");
        ViewEmail.setBorder(null);
        ViewEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ViewEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewEmailActionPerformed(evt);
            }
        });

        BackButton.setBackground(new java.awt.Color(255, 0, 51));
        BackButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        BackButton.setForeground(new java.awt.Color(255, 255, 102));
        BackButton.setText("<<Back");
        BackButton.setBorder(null);
        BackButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        ComposeEmail.setBackground(new java.awt.Color(255, 0, 51));
        ComposeEmail.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        ComposeEmail.setForeground(new java.awt.Color(255, 255, 102));
        ComposeEmail.setText("Compose Email");
        ComposeEmail.setBorder(null);
        ComposeEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ComposeEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComposeEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(521, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComposeEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(ViewEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 3, Short.MAX_VALUE)
                    .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 3, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 405, Short.MAX_VALUE)
                .addComponent(ViewEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ComposeEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void attachments() {
        
    }

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) DisplayTable.getModel();
        for (Email email : userAccount.getEmailQueue().getEmailQueue()) {
            Object row[] = new Object[2];
            row[0] = email;
            row[1] = email.getRequestDate();
            dtm.addRow(row);
        }

    }
    private void ViewEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewEmailActionPerformed
        // TODO add your handling code here:

        int selectedRow = DisplayTable.getSelectedRow();
        if (selectedRow >= 0) {
            Email email = (Email) DisplayTable.getValueAt(selectedRow, 0);

            ViewReplyMails viewEmailpanel = new ViewReplyMails(userProcessContainer, userAccount, email);
            userProcessContainer.add("ViewReplyMails", viewEmailpanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_ViewEmailActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void ComposeEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComposeEmailActionPerformed
        // TODO add your handling code here:
        ComposeEmail composeEmail = new ComposeEmail(userProcessContainer,null, userAccount);
        userProcessContainer.add("ComaposeEmail", composeEmail);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_ComposeEmailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton ComposeEmail;
    private javax.swing.JTable DisplayTable;
    private javax.swing.JPanel Panel;
    private javax.swing.JButton ViewEmail;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}