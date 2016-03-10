/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.PatientRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import UserInterface.DoctorRole.ManageAppointmentsJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Krunal Nisar
 */
public class PatientWorkAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientWorkAreaPanel
     */
    

     JPanel userProcessContainer;
    UserAccount userAccount; 
    Organization organization;
    Enterprise enterprise;
    Network network;
    Patient patient;
    EcoSystem system;
    public PatientWorkAreaPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Network network,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.organization = organization;
        this.enterprise= enterprise;
        this.network=network;
        this.system=system;
        patient = (Patient) userAccount.getEmployee();
        patientTF.setText(patient.getName());
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        Blogs = new javax.swing.JButton();
        DrugManual = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        patientTF = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("My History");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 178, 231, 66));

        Blogs.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Blogs.setText("Blogs");
        Blogs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlogsActionPerformed(evt);
            }
        });
        add(Blogs, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 346, 231, 66));

        DrugManual.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DrugManual.setText("Drug Manual");
        DrugManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrugManualActionPerformed(evt);
            }
        });
        add(DrugManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 231, 66));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Social Network");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 231, 66));

        patientTF.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        add(patientTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 274, 41));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Welcome");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 274, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         PatientHistoryJPanel cpp = new PatientHistoryJPanel(userProcessContainer,userAccount , organization , enterprise,patient);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ManageAppointmentsJPanel", cpp);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BlogsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlogsActionPerformed
        // TODO add your handling code here:
        BlogsJPanel bjp = new BlogsJPanel(userProcessContainer,userAccount , organization , enterprise,network);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("BlogsJPanel", bjp);
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_BlogsActionPerformed

    private void DrugManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrugManualActionPerformed
        // TODO add your handling code here:
          DrugManualJPanel dmjp = new DrugManualJPanel(userProcessContainer,userAccount , organization , enterprise,network);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("DrugManualJPanel", dmjp);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_DrugManualActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        SocialNetworkJPanel snjp = new SocialNetworkJPanel(userProcessContainer,userAccount , organization , enterprise,network,system);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("SocialNetworkJPanel", snjp);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Blogs;
    private javax.swing.JButton DrugManual;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel patientTF;
    // End of variables declaration//GEN-END:variables
}