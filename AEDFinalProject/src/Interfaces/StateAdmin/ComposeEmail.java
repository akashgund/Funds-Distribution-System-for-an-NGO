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
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import UtilityClasses.JComboBoxDecorator;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author akash
 */
public class ComposeEmail extends javax.swing.JPanel {

    /**
     * Creates new form ComaposeEmail
     */
    JPanel userProcessContainer;
    Ecosystem business;
    UserAccount loggedin;
    WorkQueue queue;

    public ComposeEmail(JPanel container, WorkQueue queue, UserAccount loggedin) {
        initComponents();
        userProcessContainer = container;
        this.business = Ecosystem.getInstance();
        this.queue = queue;
        populateReceiverList();
        autosuggest();
        this.loggedin = loggedin;
    }

    public void populatemail() {
        StringBuilder s= new StringBuilder("");
        for(WorkRequest request : loggedin.getWorkQueue().getWorkRequestList())
        {
            if(!request.isReported() && request.getGrantStatus().equalsIgnoreCase("completed"))
            {
                s.append("Sender: "+request.getSender().getEnterprize()+" Fund Type: "+request.getFundType()+" Total: "+request.getFundRequested()+"\n");
                request.setReported(true);
            }
        }
        if(s.toString().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "No attachments available!" , "Sorry", JOptionPane.WARNING_MESSAGE);
        }
        EmailContent.setText(s.toString());
    }

    public void autosuggest() {
        JTextField text = (JTextField) jComboBox1.getEditor().getEditorComponent();
        text.setText("");
        text.addKeyListener(new JComboBoxDecorator(jComboBox1));
    }

    public void populateReceiverList() {
        jComboBox1.removeAllItems();
        jComboBox1.addItem("sysadmin@eduloom.edu");

        for (Network network : business.getNetworkList()) {
            for (UserAccount ua : network.getUserAccountDirectory().getUserAccount()) {
                jComboBox1.addItem(ua.getEmailId());

            }
            for (Enterprize ent : network.getEnterpriseDirectory().getEnterprizeList()) {
                for (UserAccount ua : ent.getUserAccountDirectory().getUserAccount()) {
                    jComboBox1.addItem(ua.getEmailId());
                }
                for (Organization org : ent.getOrganizationDirectory().getOrganisationList()) {
                    for (UserAccount ua : org.getUserAccountDirectory().getUserAccount()) {
                        jComboBox1.addItem(ua.getEmailId());
                    }
                }
            }
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        EmailContent = new javax.swing.JTextArea();
        SendEmailButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        SendEmailButton1 = new javax.swing.JButton();

        Panel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("From :");

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("View/Reply");

        EmailContent.setColumns(20);
        EmailContent.setRows(5);
        jScrollPane1.setViewportView(EmailContent);

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

        jComboBox1.setBackground(new java.awt.Color(255, 0, 51));
        jComboBox1.setEditable(true);
        jComboBox1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "gund", "chacha", "nair", "bhai" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        SendEmailButton1.setBackground(new java.awt.Color(255, 0, 51));
        SendEmailButton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        SendEmailButton1.setForeground(new java.awt.Color(255, 255, 102));
        SendEmailButton1.setText("Attach Report");
        SendEmailButton1.setBorder(null);
        SendEmailButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SendEmailButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendEmailButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(453, 453, 453))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(SendEmailButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SendEmailButton, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelLayout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(760, Short.MAX_VALUE)))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SendEmailButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SendEmailButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(208, Short.MAX_VALUE))
            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelLayout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(607, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 955, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 748, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SendEmailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendEmailButtonActionPerformed
        // TODO add your handling code here:
        String receiverEmail = jComboBox1.getSelectedItem().toString();
        UserAccount userAccount = null;
        for (Network network : business.getNetworkList()) {
            for (UserAccount ua : network.getUserAccountDirectory().getUserAccount()) {
                if (ua.getEmailId().equalsIgnoreCase(receiverEmail)) {
                    userAccount = ua;
                }

            }
            if (userAccount == null) {
                for (Enterprize ent : network.getEnterpriseDirectory().getEnterprizeList()) {

                    for (UserAccount ua : ent.getUserAccountDirectory().getUserAccount()) {
                        if (ua.getEmailId().equalsIgnoreCase(receiverEmail)) {
                            userAccount = ua;
                            break;
                        }
                    }
                    if (userAccount == null) {
                        for (Organization org : ent.getOrganizationDirectory().getOrganisationList()) {
                            for (UserAccount ua : org.getUserAccountDirectory().getUserAccount()) {
                                if (ua.getEmailId().equalsIgnoreCase(receiverEmail)) {
                                    userAccount = ua;
                                    break;
                                }
                            }
                        }
                    }
                }
            }

        }
        UserAccount admin = business.getUserAccountDirectory().getUserAccount().get(0);
        if (admin.getEmailId().equalsIgnoreCase(receiverEmail)) {
            userAccount = admin;
        }
        if (userAccount == null) {
            JOptionPane.showMessageDialog(null, "No such Emailid found");
        }
        if (userAccount != null) {
            Email email = new Email();
            email.setEmailContent(EmailContent.getText());
            email.setReceiver(userAccount);
            email.setSender(loggedin);
            JOptionPane.showMessageDialog(null, "Sender" + loggedin.getEmailId());
            JOptionPane.showMessageDialog(null, "Rece" + userAccount.getEmailId());
            userAccount.getEmailQueue().getEmailQueue().add(email);
            JOptionPane.showMessageDialog(null, "Send Succesfully!");
        }


    }//GEN-LAST:event_SendEmailButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void SendEmailButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendEmailButton1ActionPerformed
        // TODO add your handling code here:
        populatemail();
    }//GEN-LAST:event_SendEmailButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JTextArea EmailContent;
    private javax.swing.JPanel Panel;
    private javax.swing.JButton SendEmailButton;
    private javax.swing.JButton SendEmailButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
