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
import Business.WorkQueue.ManpowerRequest;
import Business.WorkQueue.VaccineWorkRequest;
import Business.WorkQueue.WorkRequest;
import UtilityClasses.JComboBoxDecorator;
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
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author akash
 */
public class FundingAnalyticsPagesysadmin extends javax.swing.JPanel {

    /**
     * Creates new form FundingAnalyticsPagesysadmin
     */
    Network network;
    Ecosystem business;
    JPanel userProcessContainer;
    String input;
    static double infrafund = 10;
    static double healthkitfund = 100;
    static double manpowerfund = 1000;
    static double totalfund = 0;
    String schoolchoice="";

    public FundingAnalyticsPagesysadmin(JPanel userProcessContainer, Ecosystem business, String input) {
        initComponents();
        this.business = business;
        this.userProcessContainer = userProcessContainer;
        this.input = input;
        jComboBox1.removeAllItems();
        for(Network network:business.getNetworkList())
        {
        network.getEnterpriseDirectory().getEnterprizeList().stream()
                .filter(x -> (x instanceof School))
                .forEach(x
                        -> {
                    jComboBox1.addItem(x);
                }
                );
        }
        //jComboBox1.setEnabled(false);
        load();
        
        //autosuggest();
    }
    
    public void autosuggest() {
        JTextField text = (JTextField) jComboBox1.getEditor().getEditorComponent();
        text.setText("");
        text.addKeyListener(new JComboBoxDecorator(jComboBox1));
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

    public void populateGraph() {
        //View by Fund Type, View by Funding History, View by Schools Funded
        //JOptionPane.showMessageDialog(null, "In populategraph");
        if (input.equalsIgnoreCase("view by Fund Type")) {

            DefaultPieDataset dataset = new DefaultPieDataset();
            System.out.println("in populate graph");

            //System.out.println("ababa"+business.getNetworkList().size()+ infrafund);
            for (Network network : business.getNetworkList()) {
                /*
                for(Enterprize ent: network.getEnterpriseDirectory().getEnterprizeList())
                {
                    infrafund=0;
                healthkitfund=0;
                healthkitfund=0;
                 
                if(ent instanceof School && ent.isAccount())
                {
                    //JOptionPane.showMessageDialog(null,"in school");
                for(WorkRequest wr: ent.getWorkQueue().getWorkRequestList())
                {
                infrafund=infrafund+wr.getFundAccepted();
                System.out.println(infrafund);
                JOptionPane.showMessageDialog(null,"in loop");
                }
                for(VaccineWorkRequest vr:ent.getVaccineWorkRequestQueue().getVaccineWorkRequestQueue())
                {
                healthkitfund=healthkitfund+vr.getBill();
                }
                for(ManpowerRequest mn: ent.getManpowerQueue().getManpwerWorkRequestQueue())
                {
                manpowerfund= manpowerfund+(mn.getTeacherGranted()*1000);
                }
                infrafund=infrafund++;
                dataset.setValue("Infrafund",infrafund);
                dataset.setValue("HealthKit Fund",healthkitfund);
                dataset.setValue("ManpowerFund",healthkitfund);
                
                }
                 */
                infrafund = infrafund + 10;
                healthkitfund = healthkitfund + 10;
                manpowerfund = manpowerfund + 5;
                dataset.setValue("Infrafund", infrafund);//remove this to outer loop;
                dataset.setValue("HealthKit Fund", healthkitfund);
                dataset.setValue("ManpowerFund", manpowerfund);
            }

            //infrafund=0;
            //healthkitfund=0;
            //manpowerfund=0;
            /*infrafund=infrafund++;
                dataset.setValue("Infrafund",infrafund);
                dataset.setValue("HealthKit Fund",healthkitfund);
                dataset.setValue("ManpowerFund",manpowerfund);*/
            //}
            JFreeChart chartdata = ChartFactory.createPieChart(
                    "Funds Distibution", // chart title
                    dataset, // data
                    true, // include legend
                    true,
                    false
            );
            // CategoryPlot areachart= chartdata.getCategoryPlot();
            // areachart.setRangeCrosshairPaint(Color.BLUE);
            ChartPanel panel = new ChartPanel(chartdata);

            PiePlot plot = (PiePlot) chartdata.getPlot();
            plot.setLabelFont(new Font("Times new roman", Font.PLAIN, 14));
            plot.setNoDataMessage("data missing");
            plot.setCircular(false);
            plot.setLabelGap(0.03);
            GraphPanel.removeAll();
            GraphPanel.add(panel);
            //JOptionPane.showMessageDialog(null,"sddfs aDDING GRAPH MFK");
            GraphPanel.validate();
        }

        if (input.equalsIgnoreCase("View by Schools Funded")) {
            //double totalfund=0;
            //GraphPanel.removeAll();
             DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            //DefaultCategoryDataset dataset= new DefaultCategoryDataset();//DefaultCategoryDataset dataset= new DefaultCategoryDataset();
            for (Network network : business.getNetworkList()) {
               
                for (Enterprize ent : network.getEnterpriseDirectory().getEnterprizeList()) {
                    //totalfund=0;
                   

                    if (ent instanceof School && ent.isAccount()) {
                        System.out.println(ent.getOrganisationName());
                        //JOptionPane.showMessageDialog(null,"in school");
                        for (WorkRequest wr : ent.getWorkQueue().getWorkRequestList()) {
                            totalfund = totalfund + wr.getFundAccepted();
                            System.out.println(infrafund);
                            //JOptionPane.showMessageDialog(null,"in loop");
                        }
                        for (VaccineWorkRequest vr : ent.getVaccineWorkRequestQueue().getVaccineWorkRequestQueue()) {
                            totalfund = totalfund + vr.getBill();
                        }
                        for (ManpowerRequest mn : ent.getManpowerQueue().getManpwerWorkRequestQueue()) {
                            totalfund = totalfund + (mn.getTeacherGranted() * 100);
                        }

                        //dataset.setValue(salesPerson.getSalesValueCurrent(),"Sales",salesPerson.getSalesPersonID());
                        totalfund = totalfund + Math.random();
                        dataset.setValue(totalfund, "", ent.getOrganizationName());

                    }

                    
                }
                JFreeChart chartdata = ChartFactory.createBarChart("School Funding data", "School", "Funds Total", dataset);
                    CategoryPlot areachart = chartdata.getCategoryPlot();
                    areachart.setRangeCrosshairPaint(Color.BLUE);
                    ChartPanel panel = new ChartPanel(chartdata);
                    GraphPanel.removeAll();
                    GraphPanel.add(panel);
                    //JOptionPane.showMessageDialog(null,"sddfs aDDING GRAPH MFK");
                    GraphPanel.validate();
            }//end of network

        }
        if (input.equalsIgnoreCase("View by Funding History")) {
            
            //String schoolchoice= jComboBox1.getSelectedItem().toString();
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            
            for (Network network : business.getNetworkList()) {
               
                for (Enterprize ent : network.getEnterpriseDirectory().getEnterprizeList()) {
                    //totalfund=0;
                   double tempinfra=0;
                        double temphealthkit=0;
                        double tempmanpower=0;
                            //JOptionPane.showMessageDialog(null,schoolchoice);
                    if (ent instanceof School && ent.isAccount()&& ent.getOrganisationName().equalsIgnoreCase(schoolchoice))
                    {
                        //JOptionPane.showMessageDialog(null,"In if");
                       /* for (WorkRequest wr : ent.getWorkQueue().getWorkRequestList()) {
                            
                            //JOptionPane.showMessageDialog(null,"in loop");
                            tempinfra=tempinfra+wr.getFundAccepted();
                        }
                        for (VaccineWorkRequest vr : ent.getVaccineWorkRequestQueue().getVaccineWorkRequestQueue()) {
                            temphealthkit=temphealthkit + vr.getBill();
                        }
                        for (ManpowerRequest mn : ent.getManpowerQueue().getManpwerWorkRequestQueue()) {
                            tempmanpower= tempmanpower + (mn.getTeacherGranted() * 100);
                        }*/
                       temphealthkit++;
                       tempinfra++;
                       tempmanpower++;
                       System.out.println(tempinfra+" "+temphealthkit+" "+tempmanpower);
                        dataset.setValue(tempinfra,"infraFund",schoolchoice);//remove this to outer loop;
                dataset.setValue( temphealthkit,"HealthKit Fund",schoolchoice);
                dataset.setValue( tempmanpower,"ManpowerFund",schoolchoice);
               
                    }
                }
                  System.out.println("dataset"+dataset);
            //ChartFactory.createLineChart3D("Funding history", "Year", "fund granted ", dataset);
            //JFreeChart chartdata = ChartFactory.createXYLineChart("Funding History", "Year", "Fund Granted", dataset);
             JFreeChart chartdata = ChartFactory.createBarChart3D("Funding History", "Year", "Fund Granted", dataset);
               /* BarRenderer renderer=null;
                CategoryPlot category=null;
                renderer= new BarRenderer();*/
            System.out.println("chartdata"+chartdata.getTitle()); 
            CategoryPlot areachart = chartdata.getCategoryPlot();
            areachart.setRangeCrosshairPaint(Color.green);
            ChartPanel panel = new ChartPanel(chartdata);
            panel.setVisible(true);
            GraphPanel.removeAll();
            GraphPanel.add(panel);
            GraphPanel.validate();
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

        JPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        FundingHistory = new javax.swing.JButton();
        schoolFunded = new javax.swing.JButton();
        fundTypeButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        GOBUTTON = new javax.swing.JButton();
        GraphPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        JPanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        FundingHistory.setBackground(new java.awt.Color(255, 0, 51));
        FundingHistory.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        FundingHistory.setForeground(new java.awt.Color(255, 255, 102));
        FundingHistory.setText("Funding History");
        FundingHistory.setBorder(null);
        FundingHistory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FundingHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FundingHistoryActionPerformed(evt);
            }
        });

        schoolFunded.setBackground(new java.awt.Color(255, 0, 51));
        schoolFunded.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        schoolFunded.setForeground(new java.awt.Color(255, 255, 102));
        schoolFunded.setText("School Funded");
        schoolFunded.setBorder(null);
        schoolFunded.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        schoolFunded.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schoolFundedActionPerformed(evt);
            }
        });

        fundTypeButton.setBackground(new java.awt.Color(255, 0, 51));
        fundTypeButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        fundTypeButton.setForeground(new java.awt.Color(255, 255, 102));
        fundTypeButton.setText("Fund Type");
        fundTypeButton.setBorder(null);
        fundTypeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fundTypeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fundTypeButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Fund Analytics ");

        jComboBox1.setBackground(new java.awt.Color(255, 0, 51));
        jComboBox1.setEditable(true);
        jComboBox1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "gund", "chacha", "nair", "bhai" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(fundTypeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                .addComponent(schoolFunded, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(GOBUTTON, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FundingHistory, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(schoolFunded, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fundTypeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FundingHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(0, 3, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void FundingHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FundingHistoryActionPerformed
        // TODO add your handling code here:
        input = "View by Funding History";
        load();
    }//GEN-LAST:event_FundingHistoryActionPerformed

    private void schoolFundedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schoolFundedActionPerformed
        // TODO add your handling code here:
        input = "View by Schools Funded";
        load();
    }//GEN-LAST:event_schoolFundedActionPerformed

    private void fundTypeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fundTypeButtonActionPerformed
        // TODO add your handling code here:
        input = "View by Funding History";
        jComboBox1.setEnabled(true);
        schoolchoice= jComboBox1.getSelectedItem().toString();
        //load();
        JOptionPane.showMessageDialog(null,"passed test");
        //jComboBox1.setEnabled(false);
       
    }//GEN-LAST:event_fundTypeButtonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        GOBUTTON.setEnabled(true);
        //Enterprize enterprize = null;
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void GOBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GOBUTTONActionPerformed
        // TODO add your handling code here:
       schoolchoice= jComboBox1.getSelectedItem().toString();
       input = "View by Funding History";
       JOptionPane.showMessageDialog(null,"from go button"+schoolchoice);
        load();
    }//GEN-LAST:event_GOBUTTONActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FundingHistory;
    private javax.swing.JButton GOBUTTON;
    private javax.swing.JPanel GraphPanel;
    private javax.swing.JPanel JPanel;
    private javax.swing.JButton fundTypeButton;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton schoolFunded;
    // End of variables declaration//GEN-END:variables
}
