/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.MedicationCategory.MedicineCategoryDirectory;
import Business.Medicine.MedicineDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Krunal Nisar
 */
public class PharmaceuticalEnterprise extends Enterprise {
    
//    private MedicineCategoryDirectory medicineCategoryDir;
    private MedicineDirectory medicineDir;
    
    public PharmaceuticalEnterprise(String name)
    {
        super(name,EnterpriseType.Pharmaceutical);  
//         medicineCategoryDir = new MedicineCategoryDirectory();
        medicineDir = new MedicineDirectory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
//     public MedicineCategoryDirectory getMedicineCategoryDir() {
//        return medicineCategoryDir;
//    }
//
//    public void setMedicineCategoryDir(MedicineCategoryDirectory medicineCategoryDir) {
//        this.medicineCategoryDir = medicineCategoryDir;
//    }

    public MedicineDirectory getMedicineDir() {
        return medicineDir;
    }

    public void setMedicineDir(MedicineDirectory medicineDir) {
        this.medicineDir = medicineDir;
    }
}
