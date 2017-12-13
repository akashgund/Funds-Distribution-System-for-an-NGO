/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.SchoolAdmin;

import Business.Enterprize.Enterprize;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.SchoolAdminRole;
import Business.Users.UserAccount;
import Business.WorkQueue.ManpowerRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author akash
 */
public class PrincipalTeacherRequest extends javax.swing.JPanel {

    /**
     * Creates new form PrincipalTeacherRequest
     */
    JPanel userProcessContainer;
    Enterprize enterprize;
    UserAccount ua;
 
    PrincipalTeacherRequest(JPanel userProcessContainer, Enterprize enterprize,UserAccount ua) {
         initComponents();
         this.userProcessContainer=userProcessContainer;
        this.enterprize=enterprize;
        
this.ua=ua;//To change body of generated methods, choose Tools | Templates.
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
        jLabel7 = new javax.swing.JLabel();
        CreateButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        teacherNumberText = new javax.swing.JTextField();
        BackButton = new javax.swing.JButton();

        JPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Request Details");

        CreateButton.setBackground(new java.awt.Color(255, 0, 51));
        CreateButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        CreateButton.setForeground(new java.awt.Color(255, 255, 102));
        CreateButton.setText("Create Request");
        CreateButton.setBorder(null);
        CreateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Enter Number of Teachers:");

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

        javax.swing.GroupLayout JPanelLayout = new javax.swing.GroupLayout(JPanel);
        JPanel.setLayout(JPanelLayout);
        JPanelLayout.setHorizontalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CreateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(124, 124, 124)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(JPanelLayout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(teacherNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(306, Short.MAX_VALUE))
        );
        JPanelLayout.setVerticalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(BackButton))
                .addGap(54, 54, 54)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(CreateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(420, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 920, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateButtonActionPerformed
        // TODO add your handling code here:
        //ent.getEnterpriseType().toString()
       /* String choice= RequestMenu.getSelectedItem().toString();
        PrincipalTeacherRequest panel = new PrincipalTeacherRequest(userProcessContainer, enterprize, choice);
        userProcessContainer.add("CreateFaciltiyProviderAccount", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);*/
       int numberReq= Integer.parseInt(teacherNumberText.getText());
        ManpowerRequest manPowerRequest= new ManpowerRequest();
        manPowerRequest.setSender(ua);
        manPowerRequest.setTecherRequested(numberReq);
        manPowerRequest.setStatus("Requested");
        System.out.println(enterprize.getOrganisationName()+"  hfjsbjdfsjd");
       enterprize.getManpowerQueue().getManpwerWorkRequestQueue().add(manPowerRequest);
      // enterprize.getUserAccountDirectory().getUserAccount()
      enterprize.getUserAccountDirectory().getUserAccount().stream()
                    .filter(x -> x.getRole() instanceof SchoolAdminRole)
                    .forEach(x -> {
                        manPowerRequest.setReceiver(x);
                        manPowerRequest.setTecherRequested(numberReq);
                        x.getManPowerQueue().getManpwerWorkRequestQueue().add(manPowerRequest);
                    });
            JOptionPane.showMessageDialog(null, "Sent request to school admin!", "Sent", JOptionPane.INFORMATION_MESSAGE);
       ua.getManPowerQueue().getManpwerWorkRequestQueue().add(manPowerRequest);
       JOptionPane.showMessageDialog(null,"Request sent!");
       //network.getManPowerRequestQueue().getManpwerWorkRequestQueue().add(manPowerRequest);
        //ua.getManpowerRequestQueue().getManpwerWorkRequestQueue().add(manPowerRequest);
        
        
       

    }//GEN-LAST:event_CreateButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BackButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton CreateButton;
    private javax.swing.JPanel JPanel;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField teacherNumberText;
    // End of variables declaration//GEN-END:variables
}
