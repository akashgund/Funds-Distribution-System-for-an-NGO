/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Employee.EmployeeDirectory;
import Business.Enterprize.EnterpriseDirectory;
import Business.Enterprize.HealthCare;
import Business.Enterprize.InfraProvider;
import Business.Enterprize.StationaryProvider;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Organization.VaccineManufacturer;
import Business.Role.Role;
import Business.Users.UserAccountDirectory;
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
    private UserAccountDirectory userAccountDirectory;
    private double total_funds = 1000000.0;
    int healthcount;
    int infracount;
    int stationarycount;
    //private EmployeeDirectory employeeDirectory;
            
    //make Builders,stionary/healthcare
    //public abstract ArrayList<networkRole> getSupportedRole();
    public Network(String name) {
        super(name);//Add super constructor call;
        enterpriseDirectory = new EnterpriseDirectory();
        userAccountDirectory= new UserAccountDirectory();
        //employeeDirectory= new EmployeeDirectory();
        healthCare = HealthCare.getInstance();
        infraProvider = InfraProvider.getInstance();
        stationaryProvider = StationaryProvider.getInstance(); 
        enterpriseDirectory.getEnterprizeList().add(healthCare);
        enterpriseDirectory.getEnterprizeList().add(infraProvider);
        enterpriseDirectory.getEnterprizeList().add(stationaryProvider);
        healthcount=0;
        
        //enterpriseDirectory.getEnterprizeList().add(vaccineManufacturer);
    }

    public double getTotal_funds() {
        return total_funds;
    }

    public void setTotal_funds(double total_funds) {
        this.total_funds = total_funds;
    }
    
    

    public int getHealthcount() {
        return healthcount;
    }

    public void setHealthcount(int healthcount) {
        this.healthcount = healthcount;
    }

    public int getInfracount() {
        return infracount;
    }

    public void setInfracount(int infracount) {
        this.infracount = infracount;
    }

    public int getStationarycount() {
        return stationarycount;
    }

    public void setStationarycount(int stationarycount) {
        this.stationarycount = stationarycount;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
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
        return this.getOrganisationName();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ///Add code here
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
