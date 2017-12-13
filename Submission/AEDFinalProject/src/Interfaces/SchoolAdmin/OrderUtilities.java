/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.SchoolAdmin;

import Business.Enterprize.Enterprize;
import Business.Enterprize.HealthCare;
import Business.Enterprize.InfraProvider;
import Business.Enterprize.School;
import Business.Enterprize.StationaryProvider;
import Business.Network.Network;
import Business.Users.UserAccount;
import Business.WorkQueue.InfraRequest;
import Business.WorkQueue.StationaryRequest;
import Business.WorkQueue.VaccineWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author akash
 */
public class OrderUtilities extends javax.swing.JPanel {

    /**
     * Creates new form OrderUtilities
     */
    JPanel userProcessContainer;
    Network network;
    Enterprize enterprize;
    UserAccount ua;
    
   

    public OrderUtilities(JPanel container, School enterprize, Network network,UserAccount ua) {
       initComponents();//To change body of generated methods, choose Tools | Templates.
    
       this.userProcessContainer=container;
       this.network=network;
       this.enterprize= enterprize;
       this.ua=ua;
       
               
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
        OrderButton = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        QuantityHealth = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        QuantityStationary = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        QuantityInfr = new javax.swing.JTextField();

        Panel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Resource Management");

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Enter Quantity of HealthKit :");

        OrderButton.setBackground(new java.awt.Color(255, 0, 51));
        OrderButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        OrderButton.setForeground(new java.awt.Color(255, 255, 102));
        OrderButton.setText("Order");
        OrderButton.setBorder(null);
        OrderButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderButtonActionPerformed(evt);
            }
        });

        Back.setBackground(new java.awt.Color(255, 0, 51));
        Back.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 102));
        Back.setText("<<Back");
        Back.setBorder(null);
        Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Enter Quantity of Stationary :");

        jLabel10.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Enter Infra Requirement:");

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(OrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(QuantityHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(QuantityStationary, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(QuantityInfr, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Back, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuantityHealth, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(QuantityStationary, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(QuantityInfr, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(87, 87, 87)
                .addComponent(OrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(276, 276, 276))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void OrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderButtonActionPerformed
        // TODO add your handling code here:
        int sationaryquantity= 0;
        int healthKitQuantity=0;
        int infra=0;
        try
        {
        sationaryquantity= Integer.parseInt(QuantityStationary.getText());
        healthKitQuantity =Integer.parseInt(QuantityHealth.getText());
        infra= Integer.parseInt(QuantityInfr.getText());
        }
        catch(Exception e )
        {
            JOptionPane.showMessageDialog(null,"pls fill out details correctly");
        }
        if(sationaryquantity>0 &&healthKitQuantity>0)
        {
        for (Enterprize ent: network.getEnterpriseDirectory().getEnterprizeList())
        {
            if(ent instanceof HealthCare)
            {
                VaccineWorkRequest v= new VaccineWorkRequest();
                v.setQuantityReq(healthKitQuantity);
                v.setSender(ua);
                v.setRequestType("Health Kit");
                v.setStatus("Processing");
             ent.getVaccineWorkRequestQueue().getVaccineWorkRequestQueue().add(v);
             JOptionPane.showMessageDialog(null,"Vaccine Work Req Sent");
            }
            
            //add for stationary
            if(ent instanceof StationaryProvider)
            {
                StationaryRequest s= new StationaryRequest();
                s.setStationaryRequested(sationaryquantity);
                s.setSender(ua);
                s.setStatus("Processing");
                s.setRequestType("Stationary");
             ent.getStationaryRequestQueue().getStationaryWorkRequestQueue().add(s);
             JOptionPane.showMessageDialog(null,"Staionary Work Req Sent");
            }
            if(ent instanceof InfraProvider)
            {
                InfraRequest i = new InfraRequest();
                i.setInfraRequested(infra);
                i.setStatus("Processing");
                i.setRequestType("Infra");
                i.setSender(ua);
                ent.getInfraRequestQueue().getInfraWorkRequestQueue().add(i);
                JOptionPane.showMessageDialog(null,"SInfra Work Req Sent");
            }
        }
        }

        

    }//GEN-LAST:event_OrderButtonActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton OrderButton;
    private javax.swing.JPanel Panel;
    private javax.swing.JTextField QuantityHealth;
    private javax.swing.JTextField QuantityInfr;
    private javax.swing.JTextField QuantityStationary;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
