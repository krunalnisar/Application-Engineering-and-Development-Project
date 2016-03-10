/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;

import Business.Enterprise.Enterprise;
import Business.Network.City;
import Business.Network.Network;
import Business.Network.State;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Krunal Nisar
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem system;
    private ArrayList<Network> networkList;
    
    public EcoSystem()
    {   
        super(null);
        networkList = new ArrayList<>();
    }
    
    public static EcoSystem getInstance()
    {   
         if(system == null)
         system = new EcoSystem();
         
         return system;
    }
    
    public Network createAndAddNetwork(String name)
    {
        
                Network network = new Network();
                network.setName(name);
                networkList.add(network);
                return network;
        
    }
    
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> roles = new ArrayList<>();
       roles.add(new SystemAdminRole());
       return roles;
    }
    
    public Network searchCountry(String name)
    {
        for(Network network:networkList)
            if(network.getName().equalsIgnoreCase(name))
                return network;
        return null;
    }
    
    
    
    
}
