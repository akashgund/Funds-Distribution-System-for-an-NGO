/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprize.EnterpriseDirectory;
import Business.Enterprize.HealthCare;
import Business.Enterprize.InfraProvider;
import Business.Enterprize.StationaryProvider;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Organization.VaccineManufacturer;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author akash
 */
public class Network extends Organization {

    private String networkName;
    private HealthCare healthCare;
    private InfraProvider infraProvider;
    private StationaryProvider stationaryProvider;
    private VaccineManufacturer vaccineManufacturer;
    private EnterpriseDirectory enterpriseDirectory;
    //make Builders,stionary/healthcare
    //public abstract ArrayList<networkRole> getSupportedRole();
    public Network(String name) {
        super(name);//Add super constructor call;
        enterpriseDirectory = new EnterpriseDirectory();
        healthCare = HealthCare.getInstance();
        infraProvider = InfraProvider.getInstance();
        stationaryProvider = StationaryProvider.getInstance(); 
        enterpriseDirectory.getEnterprizeList().add(healthCare);
        enterpriseDirectory.getEnterprizeList().add(infraProvider);
        enterpriseDirectory.getEnterprizeList().add(stationaryProvider);
        //enterpriseDirectory.getEnterprizeList().add(vaccineManufacturer);
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public VaccineManufacturer getVaccineManufacturer() {
        return vaccineManufacturer;
    }

    public void setVaccineManufacturer(VaccineManufacturer vaccineManufacturer) {
        this.vaccineManufacturer = vaccineManufacturer;
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
