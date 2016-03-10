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
import UserInterface.PharmacyRole.PharmacyWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Krunal Nisar
 */
public class TechnicalPharmacist extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount useraccount, Organization organization, Enterprise enterprise, EcoSystem system, Network network) {
        return new PharmacyWorkAreaJPanel(userProcessContainer, enterprise,organization ,network,useraccount,system);
    }
    
}
