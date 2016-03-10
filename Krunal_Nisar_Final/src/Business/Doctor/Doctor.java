/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Doctor;

import Business.Employee.Employee;
import Business.Patient.PatientDirectory;


/**
 *
 * @author Krunal Nisar
 */
public class Doctor extends Employee{
    
    private String name;
    private PatientDirectory patientDir ;
    
    public Doctor()
    {
        patientDir = new PatientDirectory();
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    public PatientDirectory getPatientDir() {
        return patientDir;
    }

    public void setPatientDir(PatientDirectory patientDir) {
        this.patientDir = patientDir;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
