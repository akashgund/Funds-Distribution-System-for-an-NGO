/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.Analytics.Sysadmin;

import Business.Ecosystem.Ecosystem;
import Business.Enterprize.Enterprize;
import Business.Enterprize.School;
import Business.Network.Network;
import UtilityClasses.JComboBoxDecorator;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author akash
 */
public class SchoolAnalyticsPage extends javax.swing.JPanel {

    /**
     * Creates new form SchoolAnalyticsPage
     */ Network network;
    JPanel userProcessContainer;
    String input;
    Ecosystem business;
     SchoolAnalyticsPage(JPanel userProcessContainer, Ecosystem business, String entry) {
       initComponents();
        
        this.business=business;
        
        this.userProcessContainer=userProcessContainer;
        this.input=entry;
        populateSchool(); //To change body of generated methods, choose Tools | Templates.
        load();
    }
    public void autosuggest() {
        JTextField text = (JTextField) SchoolJCombo.getEditor().getEditorComponent();
        text.setText("");
        text.addKeyListener(new JComboBoxDecorator(SchoolJCombo));
    }
    

    public void load() {
        final Timer t = new Timer(2000, (ActionEvent e) -> {
            populateGraph();
            /*if (jProgressBar1.getValue() == 30) {
                ((Timer) e.getSource()).stop();
            }*/
        });
        t.start();
    }


   
    public void populateSchool()
    {
        //network.getEnterpriseDir().getEnterprizeList();//thi will have list of schools
        SchoolJCombo.removeAllItems();
        for(Network network: business.getNetworkList())
        {
        for(Enterprize ent: network.getEnterpriseDirectory().getEnterprizeList() )
        {
            if( ent instanceof School)
            SchoolJCombo.addItem(ent.getOrganisationName());
        }
        }
        
    }
public void populateGraph()
    {
        if(input.equalsIgnoreCase("Best School"))
        {
            DefaultCategoryDataset  dataset= new DefaultCategoryDataset();
      String schoolSelected= SchoolJCombo.getSelectedItem().toString();
      //print analytics for the selected school in this loop
      //JOption
                    double max=0;
                    School best=null;
               for (Network network : business.getNetworkList()) {

                for (Enterprize ent : network.getEnterpriseDirectory().getEnterprizeList()) {
                    //totalfund=0;

                    if (ent instanceof School && ent.isAccount()) {
                          School s=(School) ent;
                          if(s.getOverallScore()>max)
                          {
                              best=s;
                          }
                    }
                }
                
               //e.getExam();
               if(best!=null)
               dataset.setValue(best.getAverageMarks(),"",best.getOrganisationName());
               
                //dataset.setValue(supplier.getSupplierName(),soldtotal);
            
            
           
      //dataset.setValue(supplier.getSupplierName(),soldtotal);
        
     
        //create
//ChartFactory.createBarChart
        JFreeChart chartdata=ChartFactory.createBarChart(
            "Exam Results",
                "School",
                    "Marks",// chart title
            dataset            // data
                          // include legend
            
        );
       // CategoryPlot areachart= chartdata.getCategoryPlot();
       
       // areachart.setRangeCrosshairPaint(Color.BLUE);
       
        
        CategoryPlot areachart = chartdata.getCategoryPlot();
                areachart.setRangeCrosshairPaint(Color.BLUE);
                ChartPanel panel = new ChartPanel(chartdata);
                GraphPanel.removeAll();
                GraphPanel.add(panel);
                //JOptionPane.showMessageDialog(null,"sddfs aDDING GRAPH MFK");
                GraphPanel.validate();
    }
                }
               
        
        
               
        
        if(input.equalsIgnoreCase("Compare Exam Scores"))
        {
             DefaultCategoryDataset  dataset= new DefaultCategoryDataset();
      String schoolSelected= SchoolJCombo.getSelectedItem().toString();
      //print analytics for the selected school in this loop
      //JOption
                    
               for (Network network : business.getNetworkList()) {

                for (Enterprize ent : network.getEnterpriseDirectory().getEnterprizeList()) {
                    //totalfund=0;

                    if (ent instanceof School && ent.isAccount()) {
                          School s=(School) ent;
                           dataset.setValue(s.getAverageMarks(),"",s.getOrganisationName());
                            
                          }
                    }
                }
                
               //e.getExam();
               
              
               
                //dataset.setValue(supplier.getSupplierName(),soldtotal);
            
            
           
      //dataset.setValue(supplier.getSupplierName(),soldtotal);
        
     
        //create
//ChartFactory.createBarChart
        JFreeChart chartdata=ChartFactory.createBarChart(
            "Exam Results",
                "School",
                    "Marks",// chart title
            dataset            // data
                          // include legend
            
        );
       // CategoryPlot areachart= chartdata.getCategoryPlot();
       
       // areachart.setRangeCrosshairPaint(Color.BLUE);
       
        
        CategoryPlot areachart = chartdata.getCategoryPlot();
                areachart.setRangeCrosshairPaint(Color.BLUE);
                ChartPanel panel = new ChartPanel(chartdata);
                GraphPanel.removeAll();
                GraphPanel.add(panel);
                //JOptionPane.showMessageDialog(null,"sddfs aDDING GRAPH MFK");
                GraphPanel.validate();
        }
         if(input.equalsIgnoreCase("Individual School"))
        {
         DefaultCategoryDataset  dataset= new DefaultCategoryDataset();
      String schoolSelected= SchoolJCombo.getSelectedItem().toString();
      //print analytics for the selected school in this loop
      //JOption
                    
               for (Network network : business.getNetworkList()) {

                for (Enterprize ent : network.getEnterpriseDirectory().getEnterprizeList()) {
                    //totalfund=0;

                    if (ent instanceof School && ent.isAccount()&& ent.getOrganisationName().equalsIgnoreCase(schoolSelected)) {
                          School s=(School) ent;
                           dataset.setValue(s.getAverageMarks(),"","Exam Results");
                            
                          }
                    }
                }
                
               //e.getExam();
               
              
               
                //dataset.setValue(supplier.getSupplierName(),soldtotal);
            
            
           
      //dataset.setValue(supplier.getSupplierName(),soldtotal);
        
     
        //create
//ChartFactory.createBarChart
        JFreeChart chartdata=ChartFactory.createBarChart(
            "Exam Results",
                "School",
                    "Marks",// chart title
            dataset            // data
                          // include legend
            
        );
       // CategoryPlot areachart= chartdata.getCategoryPlot();
       
       // areachart.setRangeCrosshairPaint(Color.BLUE);
       
        
        CategoryPlot areachart = chartdata.getCategoryPlot();
                areachart.setRangeCrosshairPaint(Color.BLUE);
                ChartPanel panel = new ChartPanel(chartdata);
                GraphPanel.removeAll();
                GraphPanel.add(panel);
                //JOptionPane.showMessageDialog(null,"sddfs aDDING GRAPH MFK");
                GraphPanel.validate();
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

        AnalyticsMenu = new javax.swing.JComboBox<>();
        JPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Indi = new javax.swing.JButton();
        schoolFunded = new javax.swing.JButton();
        BestSchool = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        SchoolJCombo = new javax.swing.JComboBox();
        GOBUTTON = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        GraphPanel = new javax.swing.JPanel();

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

        JPanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Indi.setBackground(new java.awt.Color(255, 0, 51));
        Indi.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        Indi.setForeground(new java.awt.Color(255, 255, 102));
        Indi.setText("Individual School Analysis");
        Indi.setBorder(null);
        Indi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Indi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IndiActionPerformed(evt);
            }
        });

        schoolFunded.setBackground(new java.awt.Color(255, 0, 51));
        schoolFunded.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        schoolFunded.setForeground(new java.awt.Color(255, 255, 102));
        schoolFunded.setText("Compare Exam Scores");
        schoolFunded.setBorder(null);
        schoolFunded.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        schoolFunded.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schoolFundedActionPerformed(evt);
            }
        });

        BestSchool.setBackground(new java.awt.Color(255, 0, 51));
        BestSchool.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        BestSchool.setForeground(new java.awt.Color(255, 255, 102));
        BestSchool.setText("Best School");
        BestSchool.setBorder(null);
        BestSchool.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BestSchool.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BestSchoolActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Academic Analytics");

        SchoolJCombo.setBackground(new java.awt.Color(255, 0, 51));
        SchoolJCombo.setEditable(true);
        SchoolJCombo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        SchoolJCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "gund", "chacha", "nair", "bhai" }));
        SchoolJCombo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SchoolJCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SchoolJComboActionPerformed(evt);
            }
        });

        GOBUTTON.setBackground(new java.awt.Color(255, 0, 51));
        GOBUTTON.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        GOBUTTON.setForeground(new java.awt.Color(255, 255, 102));
        GOBUTTON.setText("GO");
        GOBUTTON.setBorder(null);
        GOBUTTON.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GOBUTTON.setEnabled(false);
        GOBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GOBUTTONActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(BestSchool, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                .addComponent(schoolFunded, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(GOBUTTON, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SchoolJCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Indi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(schoolFunded, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BestSchool, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Indi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SchoolJCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GOBUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        GraphPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout JPanelLayout = new javax.swing.GroupLayout(JPanel);
        JPanel.setLayout(JPanelLayout);
        JPanelLayout.setHorizontalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GraphPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        JPanelLayout.setVerticalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GraphPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AnalyticsMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnalyticsMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnalyticsMenuActionPerformed

    private void IndiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IndiActionPerformed
        // TODO add your handling code here:
        input = "Individual School";
        load();
    }//GEN-LAST:event_IndiActionPerformed

    private void schoolFundedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schoolFundedActionPerformed
        // TODO add your handling code here:
        input = "Compare Exam Scores";
        load();
    }//GEN-LAST:event_schoolFundedActionPerformed

    private void BestSchoolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BestSchoolActionPerformed
        // TODO add your handling code here:
        input = "Best School";
        SchoolJCombo.setEnabled(true);
        //schoolchoice= SchoolJCombo.getSelectedItem().toString();
        //load();
        JOptionPane.showMessageDialog(null,"passed test");
        //jComboBox1.setEnabled(false);

    }//GEN-LAST:event_BestSchoolActionPerformed

    private void SchoolJComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SchoolJComboActionPerformed
        // TODO add your handling code here:
        GOBUTTON.setEnabled(true);
        //Enterprize enterprize = null;
    }//GEN-LAST:event_SchoolJComboActionPerformed

    private void GOBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GOBUTTONActionPerformed
        // TODO add your handling code here:
        //schoolchoice= SchoolJCombo.getSelectedItem().toString();
        input = "Individual School Performance";
        //JOptionPane.showMessageDialog(null,"from go button"+schoolchoice);
        load();
    }//GEN-LAST:event_GOBUTTONActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BackButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AnalyticsMenu;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton BestSchool;
    private javax.swing.JButton GOBUTTON;
    private javax.swing.JPanel GraphPanel;
    private javax.swing.JButton Indi;
    private javax.swing.JPanel JPanel;
    private javax.swing.JComboBox SchoolJCombo;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton schoolFunded;
    // End of variables declaration//GEN-END:variables
}
