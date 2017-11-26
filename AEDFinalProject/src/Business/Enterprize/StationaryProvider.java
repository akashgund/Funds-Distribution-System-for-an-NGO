/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprize;

import Business.Network.*;
import Business.Enterprize.Enterprize;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.WorkQueue.EmailQueue;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author akash
 */
public class StationaryProvider extends Enterprize {
    private String stationaryProviderName;
    private static StationaryProvider stationaryProvider;

    public StationaryProvider(String name) {
        super(name,Enterprize.Enterprisetype.Stationary);
    }

    public String getStationaryProviderName() {
        return stationaryProviderName;
    }

    public void setStationaryProviderName(String stationaryProviderName) {
        this.stationaryProviderName = stationaryProviderName;
    }
    
   public static StationaryProvider getInstance()
   {
       if(stationaryProvider==null)     
       {
           stationaryProvider = new StationaryProvider(null);//
       }
       return stationaryProvider;
   }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

   

   
      
    
    
    

