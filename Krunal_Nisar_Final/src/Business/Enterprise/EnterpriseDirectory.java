/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.Enterprise.Enterprise.EnterpriseType;
import java.util.ArrayList;

/**
 *
 * @author Krunal Nisar
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDirectory()
    {
        enterpriseList =  new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name , EnterpriseType type)
    {
        Enterprise enterprise   = null;
        if(type == EnterpriseType.Pharmaceutical)
        {
            enterprise = new PharmaceuticalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        if(type == EnterpriseType.Hospital)
        {
            enterprise = new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if(type == EnterpriseType.Clinic)
        {
            enterprise = new ClinicEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        if(type == EnterpriseType.Pharmacy)
        {
            enterprise = new PharmacyEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
         if(type == EnterpriseType.FDA)
        {
            enterprise = new FDAEnterprise(name);
            enterpriseList.add(enterprise);
        }
         
        return enterprise;
        
    }
}
