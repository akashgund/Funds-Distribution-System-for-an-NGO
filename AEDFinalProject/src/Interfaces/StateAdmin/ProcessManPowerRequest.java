/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.StateAdmin;

import Business.WorkQueue.ManpowerRequest;
import Business.WorkQueue.ManpowerRequestQueue;
import javax.swing.JPanel;

/**
 *
 * @author akash
 */
public class ProcessManPowerRequest extends javax.swing.JPanel {

    /**
     * Creates new form ProcessManPowerRequest
     */
    JPanel userProcessContianer;
    ManpowerRequestQueue manPowerRequestQueue;

    ProcessManPowerRequest(JPanel userProcessContainer, ManpowerRequestQueue requestqueue) {
         initComponents(); 
         this.userProcessContianer=userProcessContainer;
         this.manPowerRequestQueue=requestqueue;
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
        ProcessButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        ProcessButton1 = new javax.swing.JButton();

        Panel.setBackground(new java.awt.Color(255, 255, 255));

        ProcessButton.setBackground(new java.awt.Color(255, 0, 51));
        ProcessButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        ProcessButton.setForeground(new java.awt.Color(255, 255, 102));
        ProcessButton.setText("Process");
        ProcessButton.setBorder(null);
        ProcessButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ProcessButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcessButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Handle Man Power Requests");

        ProcessButton1.setBackground(new java.awt.Color(255, 0, 51));
        ProcessButton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        ProcessButton1.setForeground(new java.awt.Color(255, 255, 102));
        ProcessButton1.setText("View Feasibilty");
        ProcessButton1.setBorder(null);
        ProcessButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ProcessButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcessButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addComponent(ProcessButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ProcessButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 231, Short.MAX_VALUE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProcessButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProcessButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(209, 209, 209))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 823, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 624, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ProcessButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcessButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProcessButtonActionPerformed

    private void ProcessButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcessButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProcessButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton ProcessButton;
    private javax.swing.JButton ProcessButton1;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
