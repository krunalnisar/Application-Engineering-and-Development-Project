/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Encounter;

import java.util.ArrayList;

/**
 *
 * @author Krunal Nisar
 */
public class EncounterDirectory {
    
    ArrayList<Encounter> encounterList;
    
    public EncounterDirectory()
    {
        encounterList =  new ArrayList<>();
    }

    public ArrayList<Encounter> getEncounterList() {
        return encounterList;
    }

    public void setEncounterList(ArrayList<Encounter> encounterList) {
        this.encounterList = encounterList;
    }
    
    public Encounter createEncounter()
    {
        Encounter encounter = new Encounter();
        encounterList.add(encounter);
        return encounter;
    }
    
}
