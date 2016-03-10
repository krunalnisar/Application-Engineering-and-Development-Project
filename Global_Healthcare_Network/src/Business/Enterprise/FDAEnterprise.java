/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.MedicationCategory.MedicineCategoryDirectory;
import Business.Medicine.Medicine;
import Business.Medicine.MedicineDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Krunal Nisar
 */
public class FDAEnterprise extends Enterprise {

    //private MedicineDirectory medicineDir;
       private ArrayList<Medicine> approvedList;
       private ArrayList<Medicine> suspiousList;
    FDAEnterprise(String name) {
        super(name,EnterpriseType.FDA);
       suspiousList = new ArrayList<>();
       approvedList = new ArrayList<>();
      // medicineDir = new MedicineDirectory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
     public ArrayList<Medicine> getSuspiousList() {
        return suspiousList;
    }

    public void setSuspiousList(ArrayList<Medicine> suspiousList) {
        this.suspiousList = suspiousList;
    }

//     public MedicineDirectory getMedicineDir() {
//        return medicineDir;
//    }
//
//    public void setMedicineDir(MedicineDirectory medicineDir) {
//        this.medicineDir = medicineDir;
//    }
    public ArrayList<Medicine> getApprovedList() {
        return approvedList;
    }

    public void setApprovedList(ArrayList<Medicine> approvedList) {
        this.approvedList = approvedList;
    }
    
    public boolean searchMedicine(Medicine med)
    {
        for(Medicine medicine : suspiousList)
        {
            if(medicine == med)
                   return true;
            
               
        }
           return false;
    }
    
}
