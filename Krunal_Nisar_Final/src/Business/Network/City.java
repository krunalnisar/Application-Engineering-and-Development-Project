/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Network;

import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author Krunal Nisar
 */
public class City {
    private String name;
    private EnterpriseDirectory enterpriseDir;
    
    public City()
    {
       enterpriseDir = new EnterpriseDirectory(); 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public EnterpriseDirectory getEnterpriseDir() {
        return enterpriseDir;
    }

    public void setEnterpriseDir(EnterpriseDirectory enterpriseDir) {
        this.enterpriseDir = enterpriseDir;
    }
    
     public String toString()
    {
        return name;
    }
}
