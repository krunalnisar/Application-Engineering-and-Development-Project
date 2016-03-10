/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Role.Role;
import Business.Role.ManufactureRole;
import java.util.ArrayList;

/**
 *
 * @author Krunal Nisar
 */
public class TechnicalPharmacist extends Organization {
    
    
    public TechnicalPharmacist()
    {
        super(Type.TechnicalPharmacist.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roles = new ArrayList<>();
       roles.add(new Business.Role.TechnicalPharmacist());
       return roles;
    }
}
