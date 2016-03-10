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
import UserInterface.FDA.FDAAdminWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author Krunal Nisar
 */
public class AuthorityManagerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount useraccount, Organization organization, Enterprise enterprise, EcoSystem system, Network network) {
        return new FDAAdminWorkArea(userProcessContainer,  enterprise,  system,  network, useraccount,organization);
    }
    
}
