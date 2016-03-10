/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Network;

import java.util.ArrayList;

/**
 *
 * @author Krunal Nisar
 */
public class State {
    String name;
    private ArrayList<City> cityList;
    
    public State()
    {
        cityList = new ArrayList<City>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<City> getCityList() {
        return cityList;
    }

    public void setCityList(ArrayList<City> cityList) {
        this.cityList = cityList;
    }
    
    
    public City addCity(String name)
    {
        City city = new City();
        city.setName(name);
        cityList.add(city);
        return city;
        
    }
    
     public String toString()
    {
        return name;
    }
     
     public City searchCity(String name)
     {
         for(City city : cityList)
        {
            if(city.getName().equalsIgnoreCase(name))
            {
                return city;
            }
        }
        return null;
     }
}
