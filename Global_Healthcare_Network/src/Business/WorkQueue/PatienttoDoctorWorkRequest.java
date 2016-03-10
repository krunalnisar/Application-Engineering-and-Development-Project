/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Medication.Prescription;

/**
 *
 * @author Krunal Nisar
 */
public class PatienttoDoctorWorkRequest extends WorkRequest {
     Prescription prescription;

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }
     
     
}
