
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Encounter;


import Business.Doctor.Doctor;
import Business.Enterprise.Enterprise;
import Business.Medication.Medication;
import Business.Medication.MedicationHistory;
import Business.Medication.Prescription;
import Business.Organization.DoctorOrganization;
import Business.Report.AssessmentHistory;
import Business.Report.Diagnosis;
import Business.Report.Treatment;
import Business.VitalSigns.VitalSign;
import Business.VitalSigns.VitalSignHistory;
import java.util.Date;

/**
 *
 * @author Krunal Nisar
 */
public class Encounter {
    
    private Diagnosis diagnosis;
    private AssessmentHistory assessmentHistory;
    private Treatment treatment;
    
    private Doctor doctor;
   // private MedicationHistory medicationHistory;
    //private Medication medication;
    //private String medication;
    private Prescription prescription;
    private String symptoms;
    private Enterprise enterprise;
     private Date startDate;
    private Date endDate;
    private String sideEffects;
    
    private VitalSign vitalSign;

    public Encounter()
    {
        diagnosis = new Diagnosis();
        vitalSign = new VitalSign();
      //  medicationHistory = new MedicationHistory();
       // medication =  new Medication();
        assessmentHistory = new AssessmentHistory();
        prescription = new Prescription();
        treatment = new Treatment();
    }

    public String getSideEffects() {
        return sideEffects;
    }

    public void setSideEffects(String sideEffects) {
        this.sideEffects = sideEffects;
    }
    
    
    public Diagnosis getDiagnosis() {
        return diagnosis;
    }

//    public String getMedication() {
//        return medication;
//    }
//
//    public void setMedication(String medication) {
////        this.medication = medication;
////    }
//    public Medication getMedication() {
//        return medication;
//    }
//
//    public void setMedication(Medication medication) {
//        this.medication = medication;
//    }
    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }
    
    

    
    public void setDiagnosis(Diagnosis diagnosis) {
        this.diagnosis = diagnosis;
    }

    public AssessmentHistory getAssessmentHistory() {
        return assessmentHistory;
    }

    public void setAssessmentHistory(AssessmentHistory assessmentHistory) {
        this.assessmentHistory = assessmentHistory;
    }

  

    public Treatment getTreatment() {
        return treatment;
    }

    public void setTreatment(Treatment treatment) {
        this.treatment = treatment;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }



    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

//    public MedicationHistory getMedicationHistory() {
//        return medicationHistory;
//    }
//
//    public void setMedicationHistory(MedicationHistory medicationHistory) {
//        this.medicationHistory = medicationHistory;
//    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public VitalSign getVitalSign() {
        return vitalSign;
    }

    public void setVitalSign(VitalSign vitalSign) {
        this.vitalSign = vitalSign;
    }


    @Override
    public String toString() {
        return symptoms;
    }
    
    
}
