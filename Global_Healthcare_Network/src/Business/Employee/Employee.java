/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Employee;

import Business.MedicationCategory.MedicineCategoryDirectory;
import Business.Medicine.Medicine;
import Business.Medicine.MedicineDirectory;
import java.util.ArrayList;

/**
 *
 * @author Krunal Nisar
 */
public class Employee {
    
    private String name;
    private int id;
//    private MedicineCategoryDirectory medicineCategoryDir;
//    private MedicineDirectory medicineDir;
//    private ArrayList<Medicine> suspiousList;
    
    public Employee()
    {
//        medicineCategoryDir = new MedicineCategoryDirectory();
//        medicineDir = new MedicineDirectory();
//        suspiousList = new ArrayList<>();
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

//    public MedicineCategoryDirectory getMedicineCategoryDir() {
//        return medicineCategoryDir;
//    }
//
//    public void setMedicineCategoryDir(MedicineCategoryDirectory medicineCategoryDir) {
//        this.medicineCategoryDir = medicineCategoryDir;
//    }
//
//    public MedicineDirectory getMedicineDir() {
//        return medicineDir;
//    }
//
//    public void setMedicineDir(MedicineDirectory medicineDir) {
//        this.medicineDir = medicineDir;
//    }

//    public ArrayList<Medicine> getSuspiousList() {
//        return suspiousList;
//    }
//
//    public void setSuspiousList(ArrayList<Medicine> suspiousList) {
//        this.suspiousList = suspiousList;
//    }
    
    
}
