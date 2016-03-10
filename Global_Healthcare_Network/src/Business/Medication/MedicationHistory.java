/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Medication;

import java.util.ArrayList;

/**
 *
 * @author Krunal Nisar
 */
public class MedicationHistory {
    private ArrayList<Medication> medicationList;
    
    public MedicationHistory()
    {
        medicationList = new ArrayList<>();
    }

    public ArrayList<Medication> getMedicationList() {
        return medicationList;
    }

    public void setMedicationList(ArrayList<Medication> medicationList) {
        this.medicationList = medicationList;
    }
    
    
}
