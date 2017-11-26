/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.Analytics.StateAdmin;

import Business.Enterprize.Enterprize;
import Business.Network.Network;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
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
    public SchoolAnalyticsPage( JPanel userProcessContainer,Network network,String input) {
        initComponents();
        this.network=network;
        this.userProcessContainer=userProcessContainer;
        this.input=input;
        populateSchool();
        
    }
    public void populateSchool()
    {
        //network.getEnterpriseDir().getEnterprizeList();//thi will have list of schools
        schoolJCombo.removeAllItems();
        for(Enterprize ent: network.getEnterpriseDir().getEnterprizeList() )
        {
            schoolJCombo.addItem(ent.getOrganisationName());
        }
        
    }
public void populateGraph()
    {
        if(input.equalsIgnoreCase("Individual School Performance"))
        {
            DefaultPieDataset  dataset= new DefaultPieDataset();
      String schoolSelected= schoolJCombo.getSelectedItem().toString();
      
       /* for (Supplier supplier:supplierList.getListOfSuppliers())
        {
           //DefaultTableModel dtm= (DefaultTableModel) DisplayTable.getModel();
            ProductCatalogue productCatalogue = supplier.getProductCatalogue();
            int soldtotal=0;
            for(Product product:productCatalogue.getListOfProducts())
            {
               soldtotal= soldtotal+product.getSold();
                System.out.println(" in the foolowing loop");
               
            }
             dataset.setValue(supplier.getSupplierName(),soldtotal);//dataset.setValue(orderItem.getProduct().getSold(),"Sales",orderItem.getProduct().getProductName());
        }
        
*/
        

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
        if(input.equalsIgnoreCase("School Funded"))
        {
            
             DefaultCategoryDataset dataset= new DefaultCategoryDataset();
        /*for(SalesPerson salesPerson:salesPersonList.getSalesPersonList())
        {
            Object row[] = new Object[3];
            row[0]=salesPerson;
            row[1]=salesPerson.getSalesValueCurrent();
            row[2]= salesPerson.getCommission();
            dataset.setValue(salesPerson.getSalesValueCurrent(),"Sales",salesPerson.getSalesPersonID());

        }
             */

        //dataset.setValue(2000,"contribution","Sales1");
        //dataset.setValue(3000,"contribution","Sales2");
        //JFreeChart dataSet = ChartFactory.createBarChart("Sales data", "Salesdata", "SSS", dataset);

        JFreeChart chartdata=ChartFactory.createBarChart3D("SalesData","Sales Person", "Revenue", dataset);
        CategoryPlot areachart= chartdata.getCategoryPlot();
        areachart.setRangeCrosshairPaint(Color.BLUE);
        ChartPanel panel= new ChartPanel(chartdata);
        GraphPanel.removeAll();
        GraphPanel.add(panel);
        GraphPanel.validate();
        }
         if(input.equalsIgnoreCase("Funding History"))
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

        AnalyticsMenu = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        JPanel = new javax.swing.JPanel();
        Individualschool = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        schoolJCombo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        compareSchools = new javax.swing.JButton();
        bestSchool = new javax.swing.JButton();
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

        Individualschool.setBackground(new java.awt.Color(255, 0, 51));
        Individualschool.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        Individualschool.setForeground(new java.awt.Color(255, 255, 102));
        Individualschool.setText("Individual School");
        Individualschool.setBorder(null);
        Individualschool.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Individualschool.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IndividualschoolActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Select School");
        jLabel5.setEnabled(false);

        schoolJCombo.setBackground(new java.awt.Color(255, 0, 51));
        schoolJCombo.setEditable(true);
        schoolJCombo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        schoolJCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Funding", "School Performance" }));
        schoolJCombo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        schoolJCombo.setEnabled(false);
        schoolJCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schoolJComboActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Fund Analytics ");

        compareSchools.setBackground(new java.awt.Color(255, 0, 51));
        compareSchools.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        compareSchools.setForeground(new java.awt.Color(255, 255, 102));
        compareSchools.setText("Compare Performance");
        compareSchools.setBorder(null);
        compareSchools.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        compareSchools.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compareSchoolsActionPerformed(evt);
            }
        });

        bestSchool.setBackground(new java.awt.Color(255, 0, 51));
        bestSchool.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        bestSchool.setForeground(new java.awt.Color(255, 255, 102));
        bestSchool.setText("Best School");
        bestSchool.setBorder(null);
        bestSchool.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bestSchool.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bestSchoolActionPerformed(evt);
            }
        });

        GraphPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout JPanelLayout = new javax.swing.GroupLayout(JPanel);
        JPanel.setLayout(JPanelLayout);
        JPanelLayout.setHorizontalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(schoolJCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(GraphPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(Individualschool, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bestSchool, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(compareSchools, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(174, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        JPanelLayout.setVerticalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(schoolJCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GraphPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 281, Short.MAX_VALUE)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Individualschool, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bestSchool, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(compareSchools, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 971, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 656, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void IndividualschoolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IndividualschoolActionPerformed
        // TODO add your handling code here:
        schoolJCombo.setEnabled(true);
    }//GEN-LAST:event_IndividualschoolActionPerformed

    private void compareSchoolsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compareSchoolsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_compareSchoolsActionPerformed

    private void bestSchoolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bestSchoolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bestSchoolActionPerformed

    private void AnalyticsMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnalyticsMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnalyticsMenuActionPerformed

    private void schoolJComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schoolJComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_schoolJComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AnalyticsMenu;
    private javax.swing.JPanel GraphPanel;
    private javax.swing.JButton Individualschool;
    private javax.swing.JPanel JPanel;
    private javax.swing.JButton bestSchool;
    private javax.swing.JButton compareSchools;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> schoolJCombo;
    // End of variables declaration//GEN-END:variables
}
