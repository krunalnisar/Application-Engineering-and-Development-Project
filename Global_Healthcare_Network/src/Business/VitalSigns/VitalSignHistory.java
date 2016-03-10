/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.VitalSigns;

import java.util.ArrayList;

/**
 *
 * @author Krunal Nisar
 */
public class VitalSignHistory {
    
    private ArrayList<VitalSign> vitalSignHist;
    
    public VitalSignHistory()
    {
        vitalSignHist = new ArrayList<>();
    }

    public ArrayList<VitalSign> getVitalSignHist() {
        return vitalSignHist;
    }

    public void setVitalSignHist(ArrayList<VitalSign> vitalSignHist) {
        this.vitalSignHist = vitalSignHist;
    }
    
    
}
