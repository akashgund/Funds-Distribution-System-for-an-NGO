/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.StateAdmin;

import Business.Ecosystem.Ecosystem;
import Business.Enterprize.Enterprize;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Users.UserAccount;
import Business.WorkQueue.Email;
import UtilityClasses.JComboBoxDecorator;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author akash
 */
public class ReplyEmail extends javax.swing.JPanel {

    /**
     * Creates new form ReplyEmail
     */
     JPanel userProcessContainer;
    Ecosystem business;
    UserAccount loggedin;
    String receiver;

   public ReplyEmail(JPanel container,UserAccount loggedin, String receiver) {
         initComponents();
         userProcessContainer=container;
         this.business=Ecosystem.getInstance();
         
       //autosuggest();
         this.loggedin=loggedin;
         this.receiver=receiver;
         populateReceiver();
         //To change body of generated methods, choose Tools | Templates.
    }

    
   public void populateReceiver()
   {
       JOptionPane.showMessageDialog(null, "here to ini");
       System.out.println(receiver+"printed here");
        ReceiverEmail.setText(receiver);
        
       
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        SendEmailButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        ReceiverEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmailContent = new javax.swing.JTextArea();

        Panel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Send Email To:");

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("View/Reply");

        SendEmailButton.setBackground(new java.awt.Color(255, 0, 51));
        SendEmailButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        SendEmailButton.setForeground(new java.awt.Color(255, 255, 102));
        SendEmailButton.setText("Send Email");
        SendEmailButton.setBorder(null);
        SendEmailButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SendEmailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendEmailButtonActionPerformed(evt);
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

        EmailContent.setColumns(20);
        EmailContent.setRows(5);
        jScrollPane1.setViewportView(EmailContent);

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(488, Short.MAX_VALUE))
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ReceiverEmail)
                        .addGap(477, 477, 477))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SendEmailButton, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelLayout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(760, Short.MAX_VALUE)))
            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 954, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReceiverEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 386, Short.MAX_VALUE)
                .addComponent(SendEmailButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelLayout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(607, Short.MAX_VALUE)))
            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                    .addContainerGap(128, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(157, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 978, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SendEmailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendEmailButtonActionPerformed
        // TODO add your handling code here:
        String receiverEmail=receiver+"@eduloom.edu";
        //System.out.println(receiverEmail+"Sending to this guy");
        UserAccount userAccount=null;
        for(Network network:business.getNetworkList())
        {
            for(UserAccount ua: network.getUserAccountDirectory().getUserAccount())
            {
                if(ua.getEmailId().equalsIgnoreCase(receiverEmail))
                userAccount=ua;

            }
            if(userAccount==null)
            {
                for(Enterprize ent: network.getEnterpriseDirectory().getEnterprizeList())
                {

                    for(UserAccount ua: ent.getUserAccountDirectory().getUserAccount())
                    {
                        if(ua.getEmailId().equalsIgnoreCase(receiverEmail))
                        {
                            userAccount=ua;
                            break;
                        }
                    }
                    if(userAccount==null)
                    {
                        for(Organization org:ent.getOrganizationDirectory().getOrganisationList())
                        {
                            for(UserAccount ua: org.getUserAccountDirectory().getUserAccount())
                            {
                                if(ua.getEmailId().equalsIgnoreCase(receiverEmail))
                                {
                                    userAccount=ua;
                                    break;
                                }
                            }
                        }
                    }
                }
            }

        }
        UserAccount admin= business.getUserAccountDirectory().getUserAccount().get(0);
        if(admin.getEmailId().equalsIgnoreCase(receiverEmail))
        {
            System.out.println(admin.getEmailId());
            userAccount=admin;
        }
        if(userAccount==null)
        {
            JOptionPane.showMessageDialog(null,"No such Emailid found");
        }
        if(userAccount!=null)
        {
            Email email=new Email();
            email.setEmailContent(EmailContent.getText());
            email.setReceiver(userAccount);
            email.setSender(loggedin);
            JOptionPane.showMessageDialog(null, "Sender"+loggedin.getEmailId());
            JOptionPane.showMessageDialog(null, "Rece"+userAccount.getEmailId());
            userAccount.getEmailQueue().getEmailQueue().add(email);
            JOptionPane.showMessageDialog(null, "Send Succesfully!");
        }

    }//GEN-LAST:event_SendEmailButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BackButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JTextArea EmailContent;
    private javax.swing.JPanel Panel;
    private javax.swing.JTextField ReceiverEmail;
    private javax.swing.JButton SendEmailButton;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}