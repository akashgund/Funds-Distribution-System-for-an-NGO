/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Ecosystem;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author akash
 */
public class Ecosystem extends Organization {
    
    private static Ecosystem business;
    ArrayList< Network> networkList;
    
   

    public static Ecosystem getInstance()    {
        //eco
        if (business==null)
        {
           
            business= new Ecosystem();
        }
        return business;
    }
     private Ecosystem() {
         
        super(null);
        networkList = new ArrayList<>();
        
        //Configuration.configure();
    }
      public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    

  
      
      @Override
    public ArrayList<Role> getSupportedRole() {
      //COMPLETE THIS
    return null;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> NetworkList) {
        this.networkList = NetworkList;
    }
    
    public boolean checkIfUsernameIsUnique(String username) {

        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            return false;
        }
        return true;
    }
}

