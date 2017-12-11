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
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
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
public class FundingAnalyticsPagesysadmin extends javax.swing.JPanel {

    /**
     * Creates new form FundingAnalyticsPagesysadmin
     */ Network network;
     Ecosystem business;
    JPanel userProcessContainer;
    String input;
    public FundingAnalyticsPagesysadmin( JPanel userProcessContainer,Ecosystem business,String input) {
        initComponents();
        this.business= business;
        this.userProcessContainer=userProcessContainer;
        this.input=input;
        populateGraph();
    }
    public void populateGraph()
    {
        //View by Fund Type, View by Funding History, View by Schools Funded
        JOptionPane.showMessageDialog(null, "In populategraph");
        if(input.equalsIgnoreCase("view by Fund Type"))
        {
            DefaultPieDataset  dataset= new DefaultPieDataset();
      
        

       double infrafund=10;
       double healthkitfund=100;
       double manpowerfund=1000;
       for(Network network : business.getNetworkList())
       {
           /*for(Enterprize ent: network.getEnterpriseDirectory().getEnterprizeList())
           {
               if(ent instanceof School)
               {
               for(WorkRequest wr: ent.getWorkQueue().getWorkRequestList())
               {
                   infrafund=infrafund+wr.getFundAccepted();
               }
               for(VaccineWorkRequest vr:ent.getVaccineWorkRequestQueue().getVaccineWorkRequestQueue())
               {
                   healthkitfund=healthkitfund+vr.getBill();
               }
               for(ManpowerRequest mn: ent.getManpowerQueue().getManpwerWorkRequestQueue())
               {
                   manpowerfund= manpowerfund+(mn.getTeacherGranted()*1000);
               }
              
               
               
               
               }
           }*/
           dataset.setValue("Infrafund",infrafund);
           dataset.setValue("HealthKit Fund",healthkitfund);
           dataset.setValue("ManpowerFund",manpowerfund);
           //infrafund=0;
           //healthkitfund=0;
           //manpowerfund=0;
       }
        

        JFreeChart chartdata=ChartFactory.createPieChart(
            "Funds Distibution",  // chart title
            dataset,             // data
            true,               // include legend
            true,
            false
        );
       // CategoryPlot areachart= chartdata.getCategoryPlot();
       // areachart.setRangeCrosshairPaint(Color.BLUE);
        ChartPanel panel= new ChartPanel(chartdata);
        
        PiePlot plot =(PiePlot)chartdata.getPlot();
        plot.setLabelFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
        plot.setNoDataMessage("data missing");
        plot.setCircular(false);
        plot.setLabelGap(0.03);
        GraphPanel.removeAll();
        GraphPanel.add(panel);
        GraphPanel.validate();
        }
        if(input.equalsIgnoreCase("View by Schools Funded"))
        {
            
             DefaultCategoryDataset dataset= new DefaultCategoryDataset();
             business.getNetworkList().stream().map((_item) -> ChartFactory.createBarChart3D("SalesData","Sales Person", "Revenue", dataset)).map((chartdata) -> {
                /*for(Enterprize ent: network.getEnterpriseDirectory().getEnterprizeList())
                {
                if(ent instanceof School)
                {
                for(WorkRequest wr: ent.getWorkQueue().getWorkRequestList())
                {
                infrafund=infrafund+wr.getFundAccepted();
                }
                for(VaccineWorkRequest vr:ent.getVaccineWorkRequestQueue().getVaccineWorkRequestQueue())
                {
                healthkitfund=healthkitfund+vr.getBill();
                }
                for(ManpowerRequest mn: ent.getManpowerQueue().getManpwerWorkRequestQueue())
                {
                manpowerfund= manpowerfund+(mn.getTeacherGranted()*1000);
                }
                }
                }*/
                //dataset.setValue(2000,"contribution","Sales1");
                //dataset.setValue(3000,"contribution","Sales2");
                //JFreeChart dataSet = ChartFactory.createBarChart("Sales data", "Salesdata", "SSS", dataset);
                CategoryPlot areachart = chartdata.getCategoryPlot();
                areachart.setRangeCrosshairPaint(Color.BLUE);
                ChartPanel panel= new ChartPanel(chartdata);
                return panel;
            }).map((panel) -> {
                GraphPanel.removeAll();
                return panel;
            }).map((panel) -> {
                GraphPanel.add(panel);
                return panel;
            }).forEachOrdered((_item) -> {
                GraphPanel.validate();
            });
        }
         if(input.equalsIgnoreCase("View by Funding History"))
        {
         DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
          JFreeChart chartdata=ChartFactory.createLineChart3D("Funding History","Year", "Fund Granted", dataset);
        CategoryPlot areachart= chartdata.getCategoryPlot();
        areachart.setRangeCrosshairPaint(Color.BLUE);
        ChartPanel panel= new ChartPanel(chartdata);
        GraphPanel.removeAll();
        GraphPanel.add(panel);
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

        JPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        performAnalyticsButton2 = new javax.swing.JButton();
        performAnalyticsButton3 = new javax.swing.JButton();
        fundTypeButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        GraphPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        JPanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        performAnalyticsButton2.setBackground(new java.awt.Color(255, 0, 51));
        performAnalyticsButton2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        performAnalyticsButton2.setForeground(new java.awt.Color(255, 255, 102));
        performAnalyticsButton2.setText("Funding History");
        performAnalyticsButton2.setBorder(null);
        performAnalyticsButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        performAnalyticsButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                performAnalyticsButton2ActionPerformed(evt);
            }
        });

        performAnalyticsButton3.setBackground(new java.awt.Color(255, 0, 51));
        performAnalyticsButton3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        performAnalyticsButton3.setForeground(new java.awt.Color(255, 255, 102));
        performAnalyticsButton3.setText("School Funded");
        performAnalyticsButton3.setBorder(null);
        performAnalyticsButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        performAnalyticsButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                performAnalyticsButton3ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 997, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(fundTypeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(performAnalyticsButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(performAnalyticsButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(54, 54, 54)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 347, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(95, 95, 95)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(25, 25, 25)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fundTypeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(performAnalyticsButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(performAnalyticsButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(95, Short.MAX_VALUE)))
        );

        GraphPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout JPanelLayout = new javax.swing.GroupLayout(JPanel);
        JPanel.setLayout(JPanelLayout);
        JPanelLayout.setHorizontalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addComponent(GraphPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 925, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void performAnalyticsButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_performAnalyticsButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_performAnalyticsButton2ActionPerformed

    private void performAnalyticsButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_performAnalyticsButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_performAnalyticsButton3ActionPerformed

    private void fundTypeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fundTypeButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, input);
        if(input.equalsIgnoreCase("View By Fund Type"))
        {
            DefaultPieDataset  dataset= new DefaultPieDataset();
            System.out.println("in populate graph");
            
            double infrafund=10;
            double healthkitfund=100;
            double manpowerfund=1000;
            System.out.println("ababa"+business.getNetworkList().size()+ infrafund);
            
            business.getNetworkList().stream().map((_item) -> {
                /*for(Enterprize ent: network.getEnterpriseDirectory().getEnterprizeList())
                {
                if(ent instanceof School)
                {
                for(WorkRequest wr: ent.getWorkQueue().getWorkRequestList())
                {
                infrafund=infrafund+wr.getFundAccepted();
                }
                for(VaccineWorkRequest vr:ent.getVaccineWorkRequestQueue().getVaccineWorkRequestQueue())
                {
                healthkitfund=healthkitfund+vr.getBill();
                }
                for(ManpowerRequest mn: ent.getManpowerQueue().getManpwerWorkRequestQueue())
                {
                manpowerfund= manpowerfund+(mn.getTeacherGranted()*1000);
                }
                
                }
                }*/
                dataset.setValue("Infrafund",infrafund);
                return _item;
            }).map((_item) -> {
                dataset.setValue("HealthKit Fund",healthkitfund);
                return _item;
            }).map((_item) -> {
                dataset.setValue("ManpowerFund",manpowerfund);
                return _item;
            }).forEachOrdered((_item) -> {
                System.out.println(dataset);
                //infrafund=0;
                //healthkitfund=0;
                //manpowerfund=0;
            });

            JFreeChart chartdata=ChartFactory.createPieChart(
                "Funds Distibution",  // chart title
                dataset,             // data
                true,               // include legend
                true,
                false
            );
            // CategoryPlot areachart= chartdata.getCategoryPlot();
            // areachart.setRangeCrosshairPaint(Color.BLUE);
            ChartPanel panel= new ChartPanel(chartdata);

            PiePlot plot =(PiePlot)chartdata.getPlot();
            plot.setLabelFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
            plot.setNoDataMessage("data missing");
            plot.setCircular(false);
            plot.setLabelGap(0.03);
            GraphPanel.removeAll();
            GraphPanel.add(panel);
            JOptionPane.showMessageDialog(null,"sddfs aDDING GRAPH MFK");
            GraphPanel.validate();
        }
    }//GEN-LAST:event_fundTypeButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GraphPanel;
    private javax.swing.JPanel JPanel;
    private javax.swing.JButton fundTypeButton;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton performAnalyticsButton2;
    private javax.swing.JButton performAnalyticsButton3;
    // End of variables declaration//GEN-END:variables
}
