/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.SchoolAdmin;

import Business.Enterprize.Enterprize;
import Business.Enterprize.School;
import Business.Network.Network;
import Business.Users.UserAccount;
import Business.WorkQueue.ManpowerRequest;
import Interfaces.SystemAdmin.CreateFacilityProviderAccount;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author akash
 */
public class SchoolPrincipalWorkRequestGenrate extends javax.swing.JPanel {

    /**
     * Creates new form SchoolPrincipalWorkRequestGenrate
     */
    JPanel userProcessContainer;
    School enterprize;
    UserAccount ua;
    Network network;

    public SchoolPrincipalWorkRequestGenrate(JPanel userProcessContainer, Enterprize enterprize, UserAccount ua) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprize = (School) enterprize;
        this.ua = ua;
        load();
    }

    public void load() {
        final Timer t = new Timer(200, (ActionEvent e) -> {
            simulate();
            if (jProgressBar2.getValue() == 30) {
                ((Timer) e.getSource()).stop();
            }
        });
        t.start();
    }

    public void simulate() {
        jProgressBar2.setValue((int) enterprize.getManpowerScore());
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
        jLabel8 = new javax.swing.JLabel();
        CreateButton1 = new javax.swing.JButton();
        jProgressBar2 = new javax.swing.JProgressBar();
        jLabel9 = new javax.swing.JLabel();

        Panel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Create Training Request");

        CreateButton1.setBackground(new java.awt.Color(255, 0, 51));
        CreateButton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        CreateButton1.setForeground(new java.awt.Color(255, 255, 102));
        CreateButton1.setText("Request Online Training");
        CreateButton1.setBorder(null);
        CreateButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CreateButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateButton1ActionPerformed(evt);
            }
        });

        jProgressBar2.setBackground(new java.awt.Color(51, 51, 255));
        jProgressBar2.setForeground(new java.awt.Color(0, 0, 0));
        jProgressBar2.setStringPainted(true);

        jLabel9.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Score:");

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CreateButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(154, 154, 154))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(108, 108, 108)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(116, 116, 116)
                .addComponent(CreateButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(286, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 892, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 638, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CreateButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateButton1ActionPerformed
        ManpowerRequest request = new ManpowerRequest();
        request.setSender(ua);
        request.setRequestType("man power request");
        enterprize.getUserAccountDirectory().getUserAccount().stream()
                .forEach(x
                        -> {
                    request.setReceiver(x);
                    request.setStatus("In transit");
                    x.getManPowerQueue().getManpwerWorkRequestQueue().add(request);
                }
                );
        JOptionPane.showMessageDialog(null, "Send request", "Success" , JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_CreateButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateButton1;
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar2;
    // End of variables declaration//GEN-END:variables
}