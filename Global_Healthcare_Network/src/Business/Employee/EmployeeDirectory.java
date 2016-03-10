/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Employee;

import Business.Doctor.Doctor;
import Business.MedicationCategory.MedicineCategoryDirectory;
import static Business.Organization.Organization.Type.Doctor;
import Business.Patient.Patient;
import java.util.ArrayList;

/**
 *
 * @author Krunal Nisar
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;
    
    public EmployeeDirectory()
    {
        employeeList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    
    public Employee addEmployee(String name)
    {
        Employee employee = new Employee();
        employee.setName(name);
        employeeList.add(employee);
        return employee;
    }
    
    public Employee addDoctor(String name)
    {
        Doctor doctor = new Doctor();
        doctor.setName(name);
        Employee employee = doctor;
        employeeList.add(employee);
        return employee;
       
    }
    
    
    public Patient addPatient(int id,String name, String address,String allergy,Doctor doctor,int age)
    {
        Patient patient = new Patient();
        patient.setName(name);
        System.out.println("add patient method"+name);
        patient.setAddress(address);
        patient.setSsn(age);
        patient.setAllergy(allergy);
        patient.setDoctor(doctor);
        patient.setId(id);
        
//        //employee.setName(name);
        employeeList.add(patient);
        System.out.println(patient);
        return patient;
        
    }
    
    public void removeEmployee(Employee e)
    {
        employeeList.remove(e);
    }
    
   
}
