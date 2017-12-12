/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.SystemAdmin;

import Interfaces.StateAdmin.*;
import Business.Ecosystem.Ecosystem;
import Business.Enterprize.Enterprize;
import Business.Enterprize.School;
import Business.Network.Network;
import Business.Users.UserAccount;
import Business.WorkQueue.Email;
import Business.WorkQueue.ManpowerRequest;
import Business.WorkQueue.ManpowerRequestQueue;
import Business.WorkQueue.VaccineWorkRequestQueue;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import Interfaces.SystemAdmin.*;
import Interfaces.*;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class ProcessRequests extends javax.swing.JPanel {

    /**
     * Creates new form LoginPage
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    

    public ProcessRequests(JPanel container, UserAccount account) {
        initComponents();
        this.userProcessContainer = container;
        this.userAccount = account;
        populateRequest();
    }


    public void populateRequest() {
        DefaultTableModel dtm = (DefaultTableModel) DisplayTable.getModel();
        dtm.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            Object row[] = new Object[5];
            row[0] = "Funding";
            row[1] = request;
            row[2] = request.getReceiver();
            row[3] = request.getFundRequested();
            row[4] = request.getGrantStatus();
            dtm.addRow(row);
        }
        //}
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DisplayTable = new javax.swing.JTable();
        loginButton4 = new javax.swing.JButton();
        processRequest1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        Panel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Resource Management");

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Requests");

        DisplayTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Type", "Sender", "Receiver", "Details", "Status"
            }
        ));
        jScrollPane1.setViewportView(DisplayTable);

        loginButton4.setBackground(new java.awt.Color(255, 0, 51));
        loginButton4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        loginButton4.setForeground(new java.awt.Color(255, 255, 102));
        loginButton4.setText("<<Back");
        loginButton4.setBorder(null);
        loginButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButton4ActionPerformed(evt);
            }
        });

        processRequest1.setBackground(new java.awt.Color(255, 0, 51));
        processRequest1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        processRequest1.setForeground(new java.awt.Color(255, 255, 102));
        processRequest1.setText("Approve Request");
        processRequest1.setBorder(null);
        processRequest1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        processRequest1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processRequest1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addComponent(loginButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 298, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(processRequest1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginButton4))
                .addGap(98, 98, 98)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(processRequest1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 104, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loginButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButton4ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_loginButton4ActionPerformed

    private void processRequest1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processRequest1ActionPerformed
        // TODO add your handling code here:
        int selectedrow = DisplayTable.getSelectedRow();
        if (selectedrow < 0 || DisplayTable.getValueAt(selectedrow, 0).toString().equalsIgnoreCase("completed")) {
            JOptionPane.showMessageDialog(null, "Please make a valid selection!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
            WorkRequest request = (WorkRequest) DisplayTable.getValueAt(selectedrow, 1);
            Network n = request.getSender().getNetwork();
            n.setTotal_funds(n.getTotal_funds()+request.getFundRequested());
            request.setFundAccepted(request.getFundRequested());
            request.setGrantStatus("completed");
            JOptionPane.showMessageDialog(null, "Successfully delivered funds!", "Success", JOptionPane.INFORMATION_MESSAGE);
            populateRequest();
    }//GEN-LAST:event_processRequest1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DisplayTable;
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loginButton4;
    private javax.swing.JButton processRequest1;
    // End of variables declaration//GEN-END:variables
}
