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
import UserInterface.PharmaceuticalRole.PharmaceuticalAdminWorkAreaJPanel;
import UserInterface.PharmaceuticalRole.PharmaceuticalWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Krunal Nisar
 */
public class PharmaceuticalAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount useraccount, Organization organization, Enterprise enterprise, EcoSystem system , Network network) {
        return new PharmaceuticalAdminWorkAreaJPanel(userProcessContainer, enterprise,network,system);
    }
    
}
