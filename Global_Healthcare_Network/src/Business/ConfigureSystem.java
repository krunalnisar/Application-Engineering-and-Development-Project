/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Krunal Nisar
 */
public class ConfigureSystem  {
    
    
    public static EcoSystem configure()
    {
    EcoSystem system = EcoSystem.getInstance();
    
    Employee employee = system.getEmployeeDir().addEmployee("Krunal");
    
    UserAccount userAccount = system.getUserAccountDir().createUserAccount("sysadmin","sysadmin",employee,new SystemAdminRole());
    return system;
    }
  
    
}
