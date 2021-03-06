/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.PharmacyRole;

import Business.Enterprise.Enterprise;
import Business.Enterprise.PharmacyEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PharmacyWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Krunal Nisar
 */
public class ViewOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewOrderJPanel
     */
    JPanel userProcessContainer;
    PharmacyEnterprise enterprise;
    Network network;
    Organization organization;
    UserAccount userAccount;
    
    public ViewOrderJPanel(JPanel userProcessContainer, Enterprise enterprise,Network network,Organization organization,UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise=(PharmacyEnterprise) enterprise;
        this.network=network;
        this.organization=organization;
         this.userAccount = userAccount;
         pharmacystatus();
        
    }

    
    
    public void pharmacystatus()
        {
            
        DefaultTableModel model = (DefaultTableModel) ViewOrderTable.getModel();
        
        model.setRowCount(0);
        for(WorkRequest wr : organization.getWorkQueue().getWorkRequestList())
        {
            if(wr instanceof PharmacyWorkRequest)
            {
            Object row [] = new Object[8];
            row[0]= wr;
            row[1]=wr.getPatient().getName();
            row[2]=wr.getEnocunter();
            row[3]=wr.getSender();
            row[4]=wr.getReceiver();
            row[5]=((PharmacyWorkRequest)wr).getPrescription();
            row[6]=wr.getStatus();
            String result = ((PharmacyWorkRequest)wr).getTestResult();
            row[7]=result==null ? "waiting" : result;
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        ViewOrderTable = new javax.swing.JTable();
        feedback = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ViewOrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Patient", "Reason", "Doctor", "Pharmacy", "Medication", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ViewOrderTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 76, 669, 98));
        add(feedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 200, 85, -1));

        jButton1.setText("Update Request");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 237, 153, -1));

        jLabel1.setText("Message");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 203, -1, -1));

        jButton2.setText("Assign ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 150, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("     View Prescriptions");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 22, 274, 41));

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 150, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          int selectedRow =  ViewOrderTable.getSelectedRow();
        if(selectedRow < 0)
        {
            JOptionPane.showMessageDialog(null, "Kindly select a row");
            return;
        }
        
        PharmacyWorkRequest request = (PharmacyWorkRequest) ViewOrderTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        pharmacystatus();
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         
      int selectedRow =  ViewOrderTable.getSelectedRow();
        if(selectedRow < 0)
        {
            JOptionPane.showMessageDialog(null, "Kindly select a row");
            return;
        }
        
        PharmacyWorkRequest request = (PharmacyWorkRequest) ViewOrderTable.getValueAt(selectedRow, 0);
        request.setTestResult(feedback.getText());
        pharmacystatus();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ViewOrderTable;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField feedback;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
