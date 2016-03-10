/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Encounter.Encounter;
import Business.Medication.Medication;
import Business.Medication.Prescription;
import Business.Medicine.Medicine;
import Business.Patient.Patient;
import java.util.ArrayList;

/**
 *
 * @author Krunal Nisar
 */
public class DoctorWorkRequest extends WorkRequest {
     String testResult;
     String date;
     Prescription prescription;
     ArrayList<Medication> medicationList;
     Patient patient;
     

    public ArrayList<Medication> getMedicationList() {
        return medicationList;
    }

    public void setMedicationList(ArrayList<Medication> medicationList) {
        this.medicationList = medicationList;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    
     
     

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

     
    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

//    public Medicine getMedicine() {
//        return medicine;
//    }
//
//    public void setMedicine(Medicine medicine) {
//        this.medicine = medicine;
//    }
//    
    
}
