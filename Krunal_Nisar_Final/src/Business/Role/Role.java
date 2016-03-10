/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Krunal Nisar
 */
public abstract class Role {
    
    public enum RoleType
        {
        
        Admin("Admin Role"),
        Sales("Sales Role"),
        Research("Research Role"),
        Doctor("Doctor Role"),
        Nurse("Nurse Role"),
        Lab("Lab Role"),
        CustomerService("CustomerService Role"),
        RegisterGrievance("RegisterGrievance Role");
        
        private String value;
        
        private RoleType(String value)
        {
            this.value = value;
        }
        
        public String getValue()
        {
            return value;
        }
        
        
        }
    
        public abstract JPanel createWorkArea(JPanel userProcessContainer , UserAccount useraccount , Organization organization , Enterprise  enterprise , EcoSystem system ,Network network);

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
        
        
}
