/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.Analytics.StateAdmin;

import Business.Network.Network;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author akash
 */
public class AnalyticsHome extends javax.swing.JPanel {

    /**
     * Creates new form AnalyticsHome
     */
    Network network;
    JPanel userProcessContainer;
    
    public AnalyticsHome(Network network, JPanel userProcessContainer) {
        initComponents();
        this.network = network;
        this.userProcessContainer=userProcessContainer;
        populateMenu();
    }
public void populateMenu()
{
    
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel = new javax.swing.JPanel();
        performAnalytucsButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        AnalyticsMenu = new javax.swing.JComboBox<>();

        JPanel.setBackground(new java.awt.Color(255, 255, 255));

        performAnalytucsButton.setBackground(new java.awt.Color(255, 0, 51));
        performAnalytucsButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        performAnalytucsButton.setForeground(new java.awt.Color(255, 255, 102));
        performAnalytucsButton.setText("Perform Analytics");
        performAnalytucsButton.setBorder(null);
        performAnalytucsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        performAnalytucsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                performAnalytucsButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Analytics Home");

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Select Analytics Filter");

        AnalyticsMenu.setBackground(new java.awt.Color(255, 0, 51));
        AnalyticsMenu.setEditable(true);
        AnalyticsMenu.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        AnalyticsMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Funding", "School Performance" }));
        AnalyticsMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AnalyticsMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnalyticsMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanelLayout = new javax.swing.GroupLayout(JPanel);
        JPanel.setLayout(JPanelLayout);
        JPanelLayout.setHorizontalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AnalyticsMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(performAnalytucsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(199, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPanelLayout.setVerticalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AnalyticsMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(253, 253, 253)
                .addComponent(performAnalytucsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 872, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(JPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 624, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 13, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void performAnalytucsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_performAnalytucsButtonActionPerformed
        // TODO add your handling code here:
        
         String entry= AnalyticsMenu.getSelectedItem().toString();
        
        if(entry.equalsIgnoreCase("Funding"))// redirect to funding analytics home
        {
           FundingAnalyticsHome fundingAnalyticsHome = new FundingAnalyticsHome(userProcessContainer, network);
userProcessContainer.add("FundingAnalyticsHome",fundingAnalyticsHome);
CardLayout layout = (CardLayout) userProcessContainer.getLayout();
layout.next(userProcessContainer);
        }
        if(entry.equalsIgnoreCase("School Performance"))// redirect to funding analytics home
        {
           SchoolAnalyticsHome schoolAnalyticsHome = new SchoolAnalyticsHome(userProcessContainer, network);
userProcessContainer.add("SchoolAnalyticsHome",schoolAnalyticsHome);
CardLayout layout = (CardLayout) userProcessContainer.getLayout();
layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_performAnalytucsButtonActionPerformed

    private void AnalyticsMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnalyticsMenuActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_AnalyticsMenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AnalyticsMenu;
    private javax.swing.JPanel JPanel;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton performAnalytucsButton;
    // End of variables declaration//GEN-END:variables
}
