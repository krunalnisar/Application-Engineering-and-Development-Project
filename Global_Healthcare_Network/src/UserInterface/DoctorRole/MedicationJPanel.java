/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.DoctorRole;

import Business.Doctor.Doctor;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Encounter.Encounter;
import Business.Enterprise.Enterprise;
import Business.Enterprise.FDAEnterprise;
import Business.Medication.Medication;
import Business.Medicine.Medicine;
import Business.Network.City;
import Business.Network.Network;
import Business.Network.State;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.Organization.TechnicalPharmacist;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabWorkRequest;
import Business.WorkQueue.PharmacyWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Krunal Nisar
 */
public class MedicationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MedicationJPanel
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    EcoSystem system;
    Network network;
    Encounter encounter;
    Doctor doctor;
    Patient patient;
    Medication medication =  null;
    
    public MedicationJPanel(JPanel userProcessContainer, UserAccount userAccount,  Organization organization, Enterprise enterprise,Network network,Encounter encounter,Patient patient) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise=enterprise;
        this.userAccount = userAccount;
        this.network = network;
        this.encounter = encounter;
        this.patient = patient;
        System.out.println(patient);
         MedicineComboBox.removeAllItems();
        populatePharmacy();
       populateFields();
        //pharmacystatus();
        MedicineList();
       
       // PharmacyTF.removeAllItems();
        
    }
    
    public void MedicineList()
    {
     MedicineComboBox.removeAllItems();
        FDAEnterprise fdaEnterprise;
        for(State state : network.getStateList())
        {
            for(City city : state.getCityList())
            {
                for(Enterprise ent : city.getEnterpriseDir().getEnterpriseList())
                {
                    if(ent.getEnterpriseType().equals(Enterprise.EnterpriseType.FDA))
                    {
                        fdaEnterprise = (FDAEnterprise) ent;
                        for(Medicine medicine : fdaEnterprise.getApprovedList())
                        {
                            MedicineComboBox.addItem(medicine);
                        }
                    }
                }
            }
        }
    }

    public void pharmacystatus()
        {
            
        DefaultTableModel model = (DefaultTableModel) MedicationJTable.getModel();
        
        model.setRowCount(0);
        for(WorkRequest wr : userAccount.getWorkQueue().getWorkRequestList())
        {
            if(wr instanceof PharmacyWorkRequest)
            {
            Object row [] = new Object[8];
            row[0]= wr;
            row[1]=wr.getPatient();
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
    
    public void populateFields()
    {
        PatientTF.setText(patient.getName());
          SymptomsTF.setText(encounter.getSymptoms());
        DiagnosisTF.setText(encounter.getDiagnosis().getName());
        
    }
   
    public void populatePharmacy()
    {
        PharmacyTF.removeAllItems();
        for(State state : network.getStateList())
        {
            for(City city : state.getCityList())
            {
                for(Enterprise ent : city.getEnterpriseDir().getEnterpriseList())
                {
                    if(ent.getEnterpriseType().equals(Enterprise.EnterpriseType.Pharmacy))
                    {
//                        for(Organization org : ent.getOrganizationDir().getOrganizationList())
//                            {
//                                    if(org instanceof TechnicalPharmacist)
//                                    {
//                                        for(Employee emp : org.getEmployeeDir().getEmployeeList())
//                                        {
//                                            
//                                            PharmacyTF.addItem(emp);
//                                        }
//                                    }
//                            }
                         PharmacyTF.addItem(ent);
                        
                }

            }
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

        jDialog1 = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MedicationJTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        SymptomsTF = new javax.swing.JTextField();
        TreatmentTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        DiagnosisTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        SaveAndProceed = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        PharmacyTF = new javax.swing.JComboBox();
        PatientTF = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        MedicationListTF = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        MedicineComboBox = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        RefillTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Remarks = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        MedicationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Information", "Patient", "Reason", "Doctor", "Pharmacy", "Medication", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(MedicationJTable);

        jButton2.setText("<<Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(0, 492, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Prescription Status", jPanel2);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Patient");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 58, 96, -1));

        SymptomsTF.setEditable(false);
        SymptomsTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SymptomsTFActionPerformed(evt);
            }
        });
        jPanel1.add(SymptomsTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 101, 64, -1));

        TreatmentTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TreatmentTFActionPerformed(evt);
            }
        });
        jPanel1.add(TreatmentTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 185, 64, -1));

        jLabel5.setText("Treatment");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 188, 96, -1));

        DiagnosisTF.setEditable(false);
        DiagnosisTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiagnosisTFActionPerformed(evt);
            }
        });
        jPanel1.add(DiagnosisTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 150, 64, -1));

        jLabel6.setText("Diagnosis");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 153, 96, -1));

        SaveAndProceed.setText("Save and forward to pharmacy");
        SaveAndProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveAndProceedActionPerformed(evt);
            }
        });
        jPanel1.add(SaveAndProceed, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 570, 269, 37));

        jLabel4.setText(" Symptoms");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 104, 96, -1));

        jLabel8.setText("Select pharmacy");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 480, 96, -1));

        PharmacyTF.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        PharmacyTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PharmacyTFActionPerformed(evt);
            }
        });
        jPanel1.add(PharmacyTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 477, -1, -1));

        PatientTF.setEditable(false);
        jPanel1.add(PatientTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 64, -1));

        MedicationListTF.setColumns(20);
        MedicationListTF.setRows(5);
        jScrollPane2.setViewportView(MedicationListTF);

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        MedicineComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        MedicineComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedicineComboBoxActionPerformed(evt);
            }
        });

        jLabel7.setText("Medications");

        jLabel3.setText("Refill");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(RefillTF, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton1))
                    .addComponent(MedicineComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(MedicineComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RefillTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 236, -1, -1));
        jPanel1.add(Remarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 73, -1));

        jLabel9.setText("Remarks");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 70, 20));

        jTabbedPane1.addTab("Prescribe Medication", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TreatmentTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TreatmentTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TreatmentTFActionPerformed

    private void DiagnosisTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiagnosisTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiagnosisTFActionPerformed

    private void SaveAndProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveAndProceedActionPerformed
        // TODO add your handling code here:
        
        
        encounter.getTreatment().setName(TreatmentTF.getText());
        encounter.getPrescription().getMedicationList().add(medication);
        
         PharmacyWorkRequest pharmacyRequest = new PharmacyWorkRequest();
        pharmacyRequest.setRequestDate(new Date());
        pharmacyRequest.setPrescription(encounter.getPrescription());
        
        pharmacyRequest.setSender(userAccount);
        pharmacyRequest.setStatus("sent");
        pharmacyRequest.setEnocunter(encounter);
        pharmacyRequest.setPatient(patient);
        pharmacyRequest.setMessage(Remarks.getText());
        
        Organization org = null;
        Enterprise ent = (Enterprise) PharmacyTF.getSelectedItem();
        for (Organization o : ent.getOrganizationDir().getOrganizationList()){
                                if (o instanceof TechnicalPharmacist)
                                {
                                    System.out.println(o);
                                    org = o;
                                    break;
                                }
                            }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(pharmacyRequest);
            userAccount.getWorkQueue().getWorkRequestList().add(pharmacyRequest);
            pharmacystatus();
        }
      
        

    }//GEN-LAST:event_SaveAndProceedActionPerformed

    private void PharmacyTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PharmacyTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PharmacyTFActionPerformed

    private void SymptomsTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SymptomsTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SymptomsTFActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        Medicine medicine = (Medicine) MedicineComboBox.getSelectedItem();
        int refill = (Integer.parseInt(RefillTF.getText()));
        MedicationListTF.append(medicine.getName()+" "+refill+"\n");
        Medication medication = encounter.getPrescription().addMedication();
        medication.setMedicine(medicine);
        medication.setRefill(RefillTF.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MedicineComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedicineComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedicineComboBoxActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DiagnosisTF;
    private javax.swing.JTable MedicationJTable;
    private javax.swing.JTextArea MedicationListTF;
    private javax.swing.JComboBox MedicineComboBox;
    private javax.swing.JTextField PatientTF;
    private javax.swing.JComboBox PharmacyTF;
    private javax.swing.JTextField RefillTF;
    private javax.swing.JTextField Remarks;
    private javax.swing.JButton SaveAndProceed;
    private javax.swing.JTextField SymptomsTF;
    private javax.swing.JTextField TreatmentTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
