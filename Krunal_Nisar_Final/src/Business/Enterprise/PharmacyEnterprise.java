/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.MedicationCategory.MedicineCategoryDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Krunal Nisar
 */
public class PharmacyEnterprise extends Enterprise {
      private MedicineCategoryDirectory medicineCategoryDir;
      
    public PharmacyEnterprise(String name)   
    {
        super(name,EnterpriseType.Pharmacy);
             medicineCategoryDir = new MedicineCategoryDirectory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
         return null;
    }
    
     public MedicineCategoryDirectory getMedicineCategoryDir() {
        return medicineCategoryDir;
    }

    public void setMedicineCategoryDir(MedicineCategoryDirectory medicineCategoryDir) {
        this.medicineCategoryDir = medicineCategoryDir;
    }
}
