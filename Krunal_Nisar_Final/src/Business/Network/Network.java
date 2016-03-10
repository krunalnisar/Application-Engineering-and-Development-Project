/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Network;

import Business.Enterprise.EnterpriseDirectory;
import java.util.ArrayList;

/**
 *
 * @author Krunal Nisar
 */
public class Network {
    
    private String name;
    //private EnterpriseDirectory enterpriseDir;
    private ArrayList<State> stateList;
    
    public Network()
    {
        //enterpriseDir = new EnterpriseDirectory();
        stateList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
    public String toString()
    {
        return name;
    }
    
    public ArrayList<State> getStateList() {
        return stateList;
    }

    public void setStateList(ArrayList<State> stateList) {
        this.stateList = stateList;
    }
    
    public State addState(String name)
    {
        State s = new State();
        s.setName(name);
        stateList.add(s);
        return s;
    }
    
    public State searchState(String name)
    {
        for(State state : stateList)
        {
            if(state.getName().equalsIgnoreCase(name))
            {
                return state;
            }
        }
        return null;
    }
}
