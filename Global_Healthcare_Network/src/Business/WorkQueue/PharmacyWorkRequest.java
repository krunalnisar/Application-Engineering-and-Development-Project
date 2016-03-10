/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Medication.Prescription;
import Business.Patient.Patient;

/**
 *
 * @author Krunal Nisar
 */
public class PharmacyWorkRequest extends WorkRequest{
    
      String testResult;
      String name;
      Prescription prescription;
      Patient patient;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    
    
}
