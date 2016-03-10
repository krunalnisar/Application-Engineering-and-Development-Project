/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.MedicationCategory;

import java.util.ArrayList;

/**
 *
 * @author Krunal Nisar
 */
public class MedicineCategoryDirectory {
    
   private ArrayList<MedicineCategory> medicineCategoryList ;
   
   public MedicineCategoryDirectory()
   {
    medicineCategoryList = new ArrayList<>();
   
   }

    public ArrayList<MedicineCategory> getMedicineCategoryList() {
        return medicineCategoryList;
    }

    public void setMedicineCategoryList(ArrayList<MedicineCategory> medicineCategoryList) {
        this.medicineCategoryList = medicineCategoryList;
    }
   
    
    public MedicineCategory addMedicineCategory()
    {
        MedicineCategory medicineCategory = new MedicineCategory();
        medicineCategoryList.add(medicineCategory);
        return medicineCategory;
    }
   
}
