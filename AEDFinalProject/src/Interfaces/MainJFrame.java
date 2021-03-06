/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Business.Ecosystem.Configuration;
import Business.Ecosystem.Ecosystem;
import Business.Enterprize.Enterprize;
import Business.Enterprize.School;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Users.UserAccount;
import Interfaces.SchoolAdmin.SignUp;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Dell
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private Ecosystem system;

    public MainJFrame() {
        initComponents();
        system = Configuration.configure();
        populate();
    }

    public void populate() {

        system.getNetworkList().stream()
                .forEach(x -> {
                    for (Enterprize e : x.getEnterpriseDirectory().getEnterprizeList()) {
                        if (e instanceof School && e.isAccount()) {

                            School s = (School) e;
                            new Thread(new Runnable() {
                                @Override
                                public void run() {
                                    for (;;) {
                                        try {
                                            if(s.getInfraScore()<0.30 || s.getStationaryScore()<0.30 || s.getHealthScore()<0.30)
                                            {
                                                Thread.sleep(12000);
                                            }
                                            else
                                            {
                                                Thread.sleep(5000);
                                            }
                                            s.setInfraFunds(s.getInfraFunds() - s.getIspendingRate());
                                            s.setStationaryFunds(s.getStationaryFunds() - s.getSspendingRate());
                                            s.setHealthFunds(s.getHealthFunds() - s.getHspendingRate());
                                            s.setAverageMarks(s.getAverageMarks());
                                        } catch (InterruptedException ex) {
                                            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, "Thread Exception!", ex);
                                        }
                                    }
                                }

                            }
                            ).start();
                        }
                    }
                });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        loginButton1 = new javax.swing.JButton();
        loginButton2 = new javax.swing.JButton();
        container = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerLocation(300);

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Desktop\\images.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Inspiring Young Minds");

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("EDULOOM");

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("User Name");

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Password ");

        loginButton.setBackground(new java.awt.Color(255, 0, 51));
        loginButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 102));
        loginButton.setText("Log In");
        loginButton.setBorder(null);
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        loginButton1.setBackground(new java.awt.Color(255, 255, 255));
        loginButton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        loginButton1.setForeground(new java.awt.Color(255, 0, 51));
        loginButton1.setText("Sign up your school now!");
        loginButton1.setBorder(null);
        loginButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButton1ActionPerformed(evt);
            }
        });

        loginButton2.setBackground(new java.awt.Color(255, 0, 51));
        loginButton2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        loginButton2.setForeground(new java.awt.Color(255, 255, 102));
        loginButton2.setText("Logout");
        loginButton2.setBorder(null);
        loginButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtUser)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPassword)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginButton)
                .addGap(18, 18, 18)
                .addComponent(loginButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(loginButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSplitPane1.setLeftComponent(jPanel1);

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setPreferredSize(new java.awt.Dimension(700, 600));
        container.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(container);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        String userName = txtUser.getText();
        // Get Password
        char[] passwordCharArray = txtPassword.getPassword();
        String password = String.valueOf(passwordCharArray);

        //Step1: Check in the system user account directory if you have the user
        UserAccount userAccount = system.getUserAccountDirectory().authenticateUser(userName, password);
        Enterprize inEnterprise = null;
        Organization inOrganization = null;
        Network inNetwork = null;
        if (userAccount == null) {
            //Step2: Go inside each network to check each enterprise
            for (Network network : system.getNetworkList()) {
                //Step 2-a: Check against each enterprise
                userAccount = network.getUserAccountDirectory().authenticateUser(userName, password);
                if (userAccount == null) {
                    for (Enterprize enterprise : network.getEnterpriseDirectory().getEnterprizeList()) {
                        userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                        if (userAccount == null) {
                            //Step3: Check against each organization inside that enterprise
                            for (Organization organization : enterprise.getOrganizationDirectory().getOrganisationList()) {
                                userAccount = organization.getUserAccountDirectory().authenticateUser(userName, password);
                                if (userAccount != null) {
                                    inEnterprise = enterprise;
                                    inOrganization = organization;
                                    userAccount.setEnterprize(enterprise);
                                    userAccount.setNetwork(network);
                                    break;
                                }
                            }
                        } else {
                            inEnterprise = enterprise;
                            System.out.println("lodu"+enterprise);
                            userAccount.setEnterprize(enterprise);
                            userAccount.setNetwork(network);
                            System.out.println(userAccount.getNetwork().getOrganisationName());
                            break;
                        }
                        if (inOrganization != null) {
                            break;
                        }
                    }
                }//idhar
                else {
                    inNetwork = network;
                    userAccount.setNetwork(network);
                    break;
                }
                if (inNetwork != null || inEnterprise != null) {
                    break;
                }
            }
        }

        if (userAccount == null) {
            JOptionPane.showMessageDialog(null, "Invalid Credentails!");
            return;
        } else {
            CardLayout layout = (CardLayout) container.getLayout();
            container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount, inNetwork, inOrganization, inEnterprise, system));
            layout.next(container);
        }
        txtUser.setText("");
        txtPassword.setText("");
        loginButton.setEnabled(false);
        loginButton2.setEnabled(true);
    }//GEN-LAST:event_loginButtonActionPerformed

    private void loginButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButton1ActionPerformed
        // TODO add your handling code here:
        SignUp panel = new SignUp(container, system);
        container.add("Reports", panel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_loginButton1ActionPerformed

    private void loginButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButton2ActionPerformed
        // TODO add your handling code here:
        container.removeAll();
        JPanel njp = new JPanel();
        njp.setBackground(Color.WHITE);
        container.add("blank", njp);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        loginButton.setEnabled(true);
        loginButton2.setEnabled(false);
    }//GEN-LAST:event_loginButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton loginButton1;
    private javax.swing.JButton loginButton2;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
