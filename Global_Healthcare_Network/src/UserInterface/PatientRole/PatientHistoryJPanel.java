/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.PatientRole;

import Business.Doctor.Doctor;
import Business.Encounter.Encounter;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatienttoDoctorWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Krunal Nisar
 */

public class PatientHistoryJPanel extends javax.swing.JPanel {

     JPanel userProcessContainer;
    UserAccount userAccount; 
    Organization organization;
    Enterprise enterprise;
    Network network;
    Patient patient;
    /**
     * Creates new form PatientHistoryJPanel
     */
    public PatientHistoryJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise,Patient patient) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.organization = organization;
        this.enterprise= enterprise;
        this.patient= patient;
        this.network=network;
        Doctor doctor = patient.getDoctor();
        //Doctor doctor = patient.getDoctor();
        populateHistory(doctor);
        populateComplain();
     
    }
    
    public void populateComplain()
    {
        DefaultTableModel model = (DefaultTableModel) FeebbackTable.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest wr : userAccount.getWorkQueue().getWorkRequestList())
            
            {
                
            Object[] row = new Object[6];
                row[0]=wr.getEnocunter().getStartDate();
                row[1]=wr.getEnocunter().getEnterprise();
                row[2]=wr.getReceiver();
                row[3]=wr;
                row[4]=wr.getEnocunter().getPrescription();
                String status= wr.getStatus();
                statusCheck(status);
                row[5]=status;  
                model.addRow(row);
            
            }
        }
       
        
    public void statusCheck(String status)
    {
      
        if(status.equals("bad"))
        {
                    progress.setValue(20);
                    patient.setProgress(progress.getValue());
       }
        else if(status.equals("ok"))
        {
            progress.setValue(40);
            patient.setProgress(progress.getValue());
        }
          else if(status.equals("good"))
        {
            progress.setValue(60);
            patient.setProgress(progress.getValue());
        }
          else if(status.equals("very good"))
        {
            progress.setValue(90);
            patient.setProgress(progress.getValue());
        }
    }

    public void populateHistory(Doctor doctor)
    {
    DefaultTableModel model = (DefaultTableModel) ReportTable.getModel();
        
        model.setRowCount(0);
        
        for (Patient patient : doctor.getPatientDir().getPatientList()){
            
            {
               Patient p =  (Patient) userAccount.getEmployee();
               if(p.equals(patient))
               {
                    Object[] row = new Object[9];

                    for(Encounter encounter : patient.getEncounterDir().getEncounterList())
                    {
                    row[0] = encounter.getStartDate();
                    row[1] = patient.getName();
                    row[2]= encounter;
                    row[3]= encounter.getDiagnosis().getName();
                    row[4]=encounter.getAssessmentHistory().getAssessmentList();
                    row[5]=encounter.getTreatment();
                    row[6]=encounter.getPrescription().getMedicationList();
                    row[7]= encounter.getDoctor();
                    row[8]= encounter.getEnterprise();
                    model.addRow(row);
                    }
                }
            }
        }
       
        
    }  
//    public void populateHistory()
//    {
//        DefaultTableModel model = (DefaultTableModel) HistoryTable.getModel();
//        
//        model.setRowCount(0);
//     
//                
//            Object[] row = new Object[5];
//            
//            for(Encounter encounter : patient.getEncounterDir().getEncounterList())
//            {
//            row[0] = encounter.getStartDate();
//            row[1] = encounter.getEnterprise();
//            row[2]= encounter.getDoctor();
//            row[3]= encounter.;
//            row[4]=encounter.getMedication();
//           
//            model.addRow(row);
//            }
//    }
      
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        FeebbackTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ReportTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        ReactionTF = new javax.swing.JTextField();
        progress = new javax.swing.JProgressBar();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();

        FeebbackTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Date", "Hospital", "Doctor", "Reaction", "Medication", "FeedBack"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(FeebbackTable);

        jButton1.setText("FeedBack");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ReportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "date", "patient", "Symptoms", "Diagnosis", "Assessment", "Treatment", "Medication", "Doctor", "Hospital"
            }
        ));
        jScrollPane2.setViewportView(ReportTable);

        jLabel3.setText("Provide feedback");

        progress.setForeground(new java.awt.Color(51, 255, 51));
        progress.setValue(10);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("FeedBack Report");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Detailed Report");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Progress Report");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("        My Records");

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(351, 351, 351)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(44, 44, 44)
                                .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(ReactionTF, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(backJButton))))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ReactionTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68)
                .addComponent(backJButton)
                .addGap(122, 122, 122))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {backJButton, jButton1});

    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        UserAccount doctorua = null;
        String reaction = ReactionTF.getText();
        PatienttoDoctorWorkRequest request = new PatienttoDoctorWorkRequest();
        
          int selectedRow =  ReportTable.getSelectedRow();
        if(selectedRow < 0)
        {
            JOptionPane.showMessageDialog(null, "Kindly select a row");
            return;
        }
        
        Encounter encounter = (Encounter) ReportTable.getValueAt(selectedRow, 2);
        //request.setRequestDate(new Date());
//           request.getEnocunter().setStartDate(new Date());
          // request.getEnocunter().setEnterprise(encounter.getEnterprise());
            request.setMessage(reaction);
           request.setEnocunter(encounter);
           request.setSender(userAccount);
           request.setPrescription(encounter.getPrescription());
           //request.setMedicationList(encounter.getPrescription().getMedicationList());
           request.setStatus("Waiting for feedback");
           
           Patient p = (Patient) userAccount.getEmployee();
           Doctor doctor = p.getDoctor();
           
           
           for(Organization org : enterprise.getOrganizationDir().getOrganizationList())
           {
               if(org instanceof DoctorOrganization)
               {
                   for(UserAccount ua : org.getUserAccountDir().getUserAccountList())
                   {
                       Doctor d = (Doctor) ua.getEmployee();
                       
                       if(doctor.equals(d))
                       {
                           doctorua = ua;
                           System.out.println("send to doctor");
                          
                           break;
                           
                       }
                       
                   }
                       }
           }
           
           if(doctorua !=null)
           {
                doctorua.getWorkQueue().getWorkRequestList().add(request);
                userAccount.getWorkQueue().getWorkRequestList().add(request);
                           populateComplain();
           }
                                
     
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable FeebbackTable;
    private javax.swing.JTextField ReactionTF;
    private javax.swing.JTable ReportTable;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JProgressBar progress;
    // End of variables declaration//GEN-END:variables
}
