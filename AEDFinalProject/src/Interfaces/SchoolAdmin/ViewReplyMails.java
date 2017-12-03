/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.SchoolAdmin;

import Business.Ecosystem.Ecosystem;
import Business.Users.UserAccount;
import Business.WorkQueue.Email;
import Interfaces.*;
import java.awt.CardLayout;
import javax.swing.JPanel;


/**
 *
 * @author Dell
 */
public class ViewReplyMails extends javax.swing.JPanel {

    /**
     * Creates new form LoginPage
     */
    JPanel userProcessContainer;
    Ecosystem business;
    UserAccount userAccount; 
    Email email;
    String receiver;
    public ViewReplyMails(JPanel container, UserAccount userAccount,Email email) {
        initComponents();
        this.userProcessContainer = container;
        this.email=email;
        this.userAccount=userAccount;
        populateMail();
        business=Ecosystem.getInstance();
    }
    public void populateMail()
    {
        SenderNameText.setText(email.getSender().getUsername());
        Content.setText(email.getEmailContent());
        
        
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
        SenderNameText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Content = new javax.swing.JTextArea();
        Buackbutton = new javax.swing.JButton();
        ReplyButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        Panel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("From :");

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("View/Reply");

        Content.setColumns(20);
        Content.setRows(5);
        jScrollPane1.setViewportView(Content);

        Buackbutton.setBackground(new java.awt.Color(255, 0, 51));
        Buackbutton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        Buackbutton.setForeground(new java.awt.Color(255, 255, 102));
        Buackbutton.setText("<<Back");
        Buackbutton.setBorder(null);
        Buackbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Buackbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuackbuttonActionPerformed(evt);
            }
        });

        ReplyButton.setBackground(new java.awt.Color(255, 0, 51));
        ReplyButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        ReplyButton.setForeground(new java.awt.Color(255, 255, 102));
        ReplyButton.setText("Reply");
        ReplyButton.setBorder(null);
        ReplyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ReplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReplyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(Buackbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SenderNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 264, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ReplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Buackbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SenderNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ReplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ReplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReplyButtonActionPerformed
        // TODO add your handling code here:
        receiver=email.getSender().getUsername();
         ReplyEmail ReplyEmailPanel = new ReplyEmail(userProcessContainer,userAccount,receiver);
        userProcessContainer.add("ManageAccountsPanel", ReplyEmailPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_ReplyButtonActionPerformed

    private void BuackbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuackbuttonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BuackbuttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buackbutton;
    private javax.swing.JTextArea Content;
    private javax.swing.JPanel Panel;
    private javax.swing.JButton ReplyButton;
    private javax.swing.JTextField SenderNameText;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
