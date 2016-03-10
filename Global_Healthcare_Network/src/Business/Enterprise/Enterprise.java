/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.Employee.Employee;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Organization.PatientOrganization;
import java.util.ArrayList;



/**
 *
 * @author Krunal Nisar
 */
public abstract class Enterprise extends Organization{
    private EnterpriseType type;
    private OrganizationDirectory organizationDir;
   
    
    public Enterprise(String name , EnterpriseType type)
    {
        super(name);
        this.type = type;
        organizationDir = new OrganizationDirectory();
    }
    public enum EnterpriseType{
        
        Hospital("Hospital Enterprise"),
        Clinic("Clinic Enterprise"),
        Pharmacy("Pharmacy Enterprise"),
        Pharmaceutical("Pharmaceutical Enterprise"),
        FDA("FDA Enterprise");
        private String value;
        
        private EnterpriseType(String value)
        {
            this.value = value;
        }
        
        public String getValue()
        {
            return value;
        }
        
    }

     public EnterpriseType getEnterpriseType() {
        return type;
    }
     
    public OrganizationDirectory getOrganizationDir() {
        return organizationDir;
    }

    public ArrayList<Employee> SearchPatients(Enterprise enterprise)
    {
            ArrayList<Employee> employeeList;
            for(Organization org : enterprise.getOrganizationDir().getOrganizationList() )
                {
                 if(org instanceof PatientOrganization)
                    {
                         employeeList = org.getEmployeeDir().getEmployeeList();
                         return employeeList;
                      
                    }
                }
       return null;
                
    }
    
}
