/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.PharmacyRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.PatientRole.PatientHistoryJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Krunal Nisar
 */
public class PharmacyWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PharmacyWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    Network network;
    Organization organization;
    UserAccount userAccount;
    EcoSystem system;
    public PharmacyWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise,Organization organization,Network network,UserAccount userAccount,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise=enterprise;
        this.network=network;
        this.organization=organization;
        this.userAccount = userAccount;
        this.system = system;
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Manufacture Request  ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 230, 50));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("View Prescriptions");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 230, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("      Pharmacy Work Area");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 308, 37));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        ViewOrderJPanel mmjp = new ViewOrderJPanel(userProcessContainer,enterprise,network,organization,userAccount);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ManageMedicineJPanel", mmjp);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         ManufactureJPanel mmjp = new ManufactureJPanel(userProcessContainer,enterprise,network,organization,userAccount);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ManageMedicineJPanel", mmjp);
        layout.next(userProcessContainer);

    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
