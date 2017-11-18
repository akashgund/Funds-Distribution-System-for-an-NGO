/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprize.EnterprizeDirectory;

/**
 *
 * @author akash
 */
public class Network {
    
    private String networkName;
    EnterprizeDirectory  enterprizeDir;
    

    //public abstract ArrayList<networkRole> getSupportedRole();
    public Network()
    {
        enterprizeDir= new EnterprizeDirectory();
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public EnterprizeDirectory getEnterpriseDir() {
        return enterprizeDir;
    }

    @Override
    public String toString() {
        return networkName;
    }
}

