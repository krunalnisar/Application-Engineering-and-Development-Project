/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.DoctorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.Report.Diagnosis;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Krunal Nisar
 */
public class DoctorAreaWorkJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorAreaWorkJPanel
     */
    
    JPanel userProcessContainer;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    EcoSystem system;
    Network network;
    
    public DoctorAreaWorkJPanel(JPanel userProcessContainer, UserAccount userAccount,  Organization organization, Enterprise enterprise,EcoSystem system,Network network) {
         initComponents();
          this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise=enterprise;
        this.userAccount = userAccount;
        this.network = network;
        this.system=system;
        System.out.println(organization);
        System.out.println(enterprise);
        System.out.println(userAccount);
        System.out.println(network);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ManagePatients = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        ManagePatients.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ManagePatients.setText("Manage Patients");
        ManagePatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManagePatientsActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("View Patient Complains");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setText("view Global Request");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton7.setText("Search Global Patient");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("              Doctor Work Area");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(365, 365, 365)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ManagePatients, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(336, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ManagePatients, jButton4, jButton5, jButton7});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ManagePatients)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(445, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ManagePatients, jButton4, jButton5, jButton7});

    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        
        GlobalPatientSearchJPanel gpsjp = new GlobalPatientSearchJPanel(userProcessContainer,userAccount,organization,enterprise,system,network);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("GlobalPatientSearchJPanel", gpsjp);
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void ManagePatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManagePatientsActionPerformed
        // TODO add your handling code here:
        CreatePaitentJPanel cpp = new CreatePaitentJPanel(userProcessContainer,userAccount,organization,enterprise,network);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("CreatePaitentJPanel", cpp);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_ManagePatientsActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        PatientComplainJPanel pcjp = new PatientComplainJPanel(userProcessContainer,userAccount,organization,enterprise,network);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("PatientComplainJPanel", pcjp);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        ViewGlobalPatientRequest vgpr = new ViewGlobalPatientRequest(userProcessContainer,userAccount,organization,enterprise);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ViewGlobalPatientRequest", vgpr);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ManagePatients;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}