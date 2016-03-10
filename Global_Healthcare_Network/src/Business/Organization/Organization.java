/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Employee.Employee;
import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Krunal Nisar
 */
public abstract class Organization {
        
    private String name;
    private int organizationID;
    private EmployeeDirectory employeeDir;
    private UserAccountDirectory userAccountDir;
    private static int count=0;
    private  WorkQueue workQueue;
    
    public Organization(String name)
    {
        this.name = name;
        employeeDir =new EmployeeDirectory();
        userAccountDir = new UserAccountDirectory();
        count++;
        organizationID=count;
        workQueue = new WorkQueue();
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }

  

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmployeeDirectory getEmployeeDir() {
        return employeeDir;
    }

    public void setEmployeeDir(EmployeeDirectory employeeDir) {
        this.employeeDir = employeeDir;
    }

    public UserAccountDirectory getUserAccountDir() {
        return userAccountDir;
    }

    public void setUserAccountDir(UserAccountDirectory userAccountDir) {
        this.userAccountDir = userAccountDir;
    }
    
    
    
    public enum Type
    {
        Admin("Admin Organization"),
        Doctor("Doctor Organization"),
        Nurse("Nurse Organization"),
        Lab("Lab Organization"),
        Manufacture("Manufacture Organization"),
        AuthorityManager("AuthorityManager Organization"),
        Patient("Patient Organization"),
        TechnicalPharmacist("TechnicalPharmacist");
        
        private String value;
        private Type(String value)
        {
            this.value = value;
        }
        
        public String getValue()
        {
            return value;
        }  
    }
    
      public enum PharmaceuticalType
    {
        Admin("Admin Organization"),
        Sales("Sales Organization"),
        Research("Research Organization"),
        Grievance("Grievance Organization");
  
        private String value;
        private PharmaceuticalType(String value)
        {
            this.value = value;
        }
        
        public String getValue()
        {
            return value;
        }  
    }
      
        public enum PharmacyType
    {
        Admin("Admin Organization"),
        FrontEnd("FrontEnd Organization"),
        BackEnd("BackEnd Organization");
        
        private String value;
        private PharmacyType(String value)
        {
            this.value = value;
        }
        
        public String getValue()
        {
            return value;
        }  
    }
    public abstract ArrayList<Role> getSupportedRole();

    @Override
    public String toString() {
        return name;
    }
        
    
    
}
