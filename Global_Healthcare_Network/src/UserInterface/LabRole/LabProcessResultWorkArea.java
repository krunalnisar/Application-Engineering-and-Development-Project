/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.LabRole;

import Business.Encounter.Encounter;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Report.Assessment;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Krunal Nisar
 */
public class LabProcessResultWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form LabProcessResultWorkArea
     */
    public enum Test {
        Xray("Xray"), 
        BloodTest("BloodTest");
        private String value;
        private Test(String value)
        {
            this.value = value;
        }
        public String getValue()
        {
            return value;
        }
        
        public String toString()
        {
            return value;
        }
    
    }
     JPanel userProcessContainer;
    UserAccount userAccount; 
    Encounter encounter;
    Enterprise enterprise;
    Network network;
    WorkRequest workRequest;
    
    LabProcessResultWorkArea(JPanel userProcessContainer, UserAccount userAccount, Encounter encounter, Enterprise enterprise, Network network,WorkRequest workRequest) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.encounter = encounter;
        this.enterprise=enterprise;
        this.userAccount = userAccount;
        this.network = network;
        this.workRequest = workRequest;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        AddButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Description = new javax.swing.JTextArea();
        ResultTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TestComboBox = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setText("Test");

        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Description");

        Description.setColumns(20);
        Description.setRows(5);
        jScrollPane2.setViewportView(Description);

        jLabel5.setText("Result");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Send Report");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("            Perform Tests");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ResultTF)
                            .addComponent(TestComboBox, 0, 166, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddButton)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addComponent(jButton1))
                .addContainerGap(310, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AddButton, ResultTF, TestComboBox, jButton1, jButton2, jLabel1, jLabel4, jLabel5});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TestComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResultTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddButton)
                    .addComponent(jButton2))
                .addGap(41, 41, 41)
                .addComponent(jButton1)
                .addContainerGap(404, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {AddButton, jButton1, jButton2});

    }// </editor-fold>//GEN-END:initComponents

    public void populateTable()
    {
         TestComboBox.removeAllItems();
       for(Test test : Test.values())
       {
           TestComboBox.addItem(test.getValue());
       }
    }
    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
//       JList list = new JList();
//       list.setModel(new DefaultListModel());
     //  DefaultListModel model = (DefaultListModel) SelectedList.getModel();
//        DefaultListModel listModel = new DefaultListModel();
//listModel.addElement("Jane Doe");
//listModel.addElement("John Smith");
//listModel.addElement("Kathy Green");
//
//
//
//JList list = new JList(listModel);

       
           
           

        
        
        String test = (String) TestComboBox.getSelectedItem();
        String description= Description.getText();
        String result = ResultTF.getText();
        Assessment assessment = encounter.getAssessmentHistory().createAssessment(test, description,result);
        
        
        Description.setText("");
        ResultTF.setText("");
        
        JOptionPane.showMessageDialog(null, "Test Added");
        for(Assessment ass : encounter.getAssessmentHistory().getAssessmentList())
        {
            System.out.println(ass.getLabTest());
        }
        
        
        
    }//GEN-LAST:event_AddButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        workRequest.setStatus("Completed");
        ((LabWorkRequest)workRequest).setTestResult("Report Generated for the Patient");
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JTextArea Description;
    private javax.swing.JTextField ResultTF;
    private javax.swing.JComboBox TestComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
