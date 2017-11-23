/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprize.SchoolDirectory;
import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author akash
 */
public class Network extends Organization {
    
    private String networkName;
    SchoolDirectory  schoolDirectory;
    private HealthCare healthCare;
    private InfraProvider infraProvider;
    private StationaryProvider stationaryProvider;
     //make Builders,stionary/healthcare

    //public abstract ArrayList<networkRole> getSupportedRole();
    public Network()
    {
        super(null);//Add super constructor call;
        schoolDirectory= new SchoolDirectory();
       /* healthCare = HealthCare.getInstance();
        infraProvider=InfraProvider.getInstance();remaove comments
        stationaryProvider=StationaryProvider.getInstance();*/
        
    }

    public SchoolDirectory getSchoolDirectory() {
        return schoolDirectory;
    }

    public void setSchoolDirectory(SchoolDirectory schoolDirectory) {
        this.schoolDirectory = schoolDirectory;
    }

    public HealthCare getHealthCare() {
        return healthCare;
    }

    public void setHealthCare(HealthCare healthCare) {
        this.healthCare = healthCare;
    }

    public InfraProvider getInfraProvider() {
        return infraProvider;
    }

    public void setInfraProvider(InfraProvider infraProvider) {
        this.infraProvider = infraProvider;
    }

    public StationaryProvider getStationaryProvider() {
        return stationaryProvider;
    }

    public void setStationaryProvider(StationaryProvider stationaryProvider) {
        this.stationaryProvider = stationaryProvider;
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public SchoolDirectory getEnterpriseDir() {
        return schoolDirectory;
    }

    @Override
    public String toString() {
        return networkName;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ///Add code here
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

