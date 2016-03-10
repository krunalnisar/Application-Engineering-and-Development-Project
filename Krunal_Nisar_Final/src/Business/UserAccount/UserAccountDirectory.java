/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.UserAccount;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.Patient.Patient;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Krunal Nisar
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory()
    {
        userAccountList = new ArrayList<>();
    }
    
    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public void setUserAccountList(ArrayList<UserAccount> userAccountList) {
        this.userAccountList = userAccountList;
    }
    
    public UserAccount createUserAccount(String name , String password , Employee employee , Role role)
    {
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(name);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public UserAccount authenicateUser(String name , String password)
    {
        for(UserAccount ua : userAccountList)
        {
            if(ua.getUsername().equals(name) && ua.getPassword().equals(password))
                return ua;
            
        }
        
        return null;
    }
    
//    public UserAccount searchUserAccount(Enterprise enterprise,Patient patient)
//    {
//        PatientOrganization porg =null;
//       for(Organization organization : enterprise.getOrganizationDir().getOrganizationList())
//       {
//           if(organization instanceof PatientOrganization)
//           {
//               porg = (PatientOrganization) organization;
//               if()
//               {
//                   
//               }
//           }
//       }
//        return null;
//    }
}
