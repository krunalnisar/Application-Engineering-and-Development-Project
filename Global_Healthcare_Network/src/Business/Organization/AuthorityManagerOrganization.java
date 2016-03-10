/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Role.AuthorityManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Krunal Nisar
 */
public class AuthorityManagerOrganization extends Organization{
    
    public AuthorityManagerOrganization()
    {
        super(Type.AuthorityManager.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roles = new ArrayList<>();
       roles.add(new AuthorityManagerRole());
       return roles;
    }
}
