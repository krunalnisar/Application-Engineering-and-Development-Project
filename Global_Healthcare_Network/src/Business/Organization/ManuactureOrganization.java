/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Role.HospitalAdminRole;
import Business.Role.ManufactureRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Krunal Nisar
 */
public class ManuactureOrganization extends Organization{

    public ManuactureOrganization() {
        super(Type.Manufacture.getValue());
    }

    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roles = new ArrayList<>();
       roles.add(new ManufactureRole());
       return roles;
    }
}
