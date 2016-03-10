/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Patient;

import Business.Doctor.Doctor;
import Business.Employee.Employee;
import Business.Encounter.EncounterDirectory;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.Doctor;
import Business.Role.HospitalAdminRole;
import Business.Role.PatientRole;
import Business.Role.Role;
import Business.VitalSigns.VitalSignHistory;
import java.util.ArrayList;

/**
 *
 * @author Krunal Nisar
 */
public class Patient extends Employee{
    
    private String name;
    private int id;
    private int ssn;
    private Doctor doctor;
    private String address;
    private String allergy;
    private VitalSignHistory vsh;
    private EncounterDirectory encounterDir;
    private int progress;

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }
    
    
    
    public Patient() {
        
     encounterDir = new EncounterDirectory();
    }
    
    

    public VitalSignHistory getVsh() {
        return vsh;
    }

    public void setVsh(VitalSignHistory vsh) {
        this.vsh = vsh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

  

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAllergy() {
        return allergy;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }
//
//    @Override
//    public String toString() {
//        return name;
//    }

    public EncounterDirectory getEncounterDir() {
        return encounterDir;
    }

    public void setEncounterDir(EncounterDirectory encounterDir) {
        this.encounterDir = encounterDir;
    }
 

    
    

 
}
