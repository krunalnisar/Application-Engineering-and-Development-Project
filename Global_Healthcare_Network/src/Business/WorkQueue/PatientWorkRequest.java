/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Medication.Prescription;
import Business.Medicine.Medicine;

/**
 *
 * @author Krunal Nisar
 */
public class PatientWorkRequest extends WorkRequest{
    private Prescription prescription;
    private Medicine medicine;

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }
    
    
    
}
