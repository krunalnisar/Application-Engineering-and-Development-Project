/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Medicine.Medicine;

/**
 *
 * @author Krunal Nisar
 */
public class PharmaceuticaltoPharmacyWorkRequest extends WorkRequest{
    
    Medicine medicine ;
    String effects;

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public String getEffects() {
        return effects;
    }

    public void setEffects(String effects) {
        this.effects = effects;
    }
}
