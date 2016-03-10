/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Krunal Nisar
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> OrganizationList;
    
    public OrganizationDirectory()
    {
        OrganizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return OrganizationList;
    }

    public void setOrganizationList(ArrayList<Organization> OrganizationList) {
        this.OrganizationList = OrganizationList;
    }
    
    public void createAndAddOrganization(Type type)   
    {
        Organization organization = null;
        if(type.getValue().equals(Type.Doctor.getValue()))
        {
            organization = new DoctorOrganization();
            OrganizationList.add(organization);
        }
        
        if(type.getValue().equals(Type.Lab.getValue()))
        {
            organization = new LabOrganization();
            OrganizationList.add(organization);
        }
        
        if(type.getValue().equals(Type.Nurse.getValue()))
        {
            organization = new NurseOrganization();
            OrganizationList.add(organization);
        }
        
//        if(type.getValue().equals(Type.CustomerService.getValue()))
//        {
//            organization = new CustomerServiceOrganization();
//            OrganizationList.add(organization);
//        }
        
        if(type.getValue().equals(Type.Manufacture.getValue()))
        {
            organization = new ManuactureOrganization();
            OrganizationList.add(organization);
        }
        
        if(type.getValue().equals(Type.AuthorityManager.getValue()))
        {
            organization = new AuthorityManagerOrganization();
            OrganizationList.add(organization);
        }
        
    
        
         if(type.getValue().equals(Type.TechnicalPharmacist.getValue()))
        {
            organization = new TechnicalPharmacist();
            OrganizationList.add(organization);
        }
         

          if(type.getValue().equals(Type.Patient.getValue()))
        {
            organization = new PatientOrganization();
            OrganizationList.add(organization);
        }
    }
}
