/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.Users.UserAccountDirectory;
import Business.WorkQueue.EmailQueue;
import Business.WorkQueue.InfraRequestQueue;
import Business.WorkQueue.ManpowerRequestQueue;
import Business.WorkQueue.StationaryRquestQueue;
import Business.WorkQueue.VaccineWorkRequestQueue;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author akash
 */
public abstract class Organization {
    
    private String organizationName;
    //add workqueue 
 
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter;
    private WorkQueue workQueue;
    private EmailQueue emailQueue;
    private ManpowerRequestQueue manpowerQueue;
    private VaccineWorkRequestQueue vaccineWorkRequestQueue;
    private StationaryRquestQueue stationaryRequestQueue;
    private InfraRequestQueue infraRequestQueue;
    private boolean account;
    public Organization(String name)
    {
        organizationName= name;
        workQueue = new WorkQueue();
        emailQueue = new EmailQueue();
        manpowerQueue= new ManpowerRequestQueue();
        employeeDirectory= new EmployeeDirectory();
        userAccountDirectory= new UserAccountDirectory();
        vaccineWorkRequestQueue= new VaccineWorkRequestQueue();
        stationaryRequestQueue = new StationaryRquestQueue();
        infraRequestQueue= new InfraRequestQueue();
        organizationID=counter;
        ++counter;
    }

    public StationaryRquestQueue getStationaryRequestQueue() {
        return stationaryRequestQueue;
    }

    public InfraRequestQueue getInfraRequestQueue() {
        return infraRequestQueue;
    }

    public void setInfraRequestQueue(InfraRequestQueue infraRequestQueue) {
        this.infraRequestQueue = infraRequestQueue;
    }

    public void setStationaryRequestQueue(StationaryRquestQueue stationaryRequestQueue) {
        this.stationaryRequestQueue = stationaryRequestQueue;
    }

    public VaccineWorkRequestQueue getVaccineWorkRequestQueue() {
        return vaccineWorkRequestQueue;
    }

    public void setVaccineWorkRequestQueue(VaccineWorkRequestQueue vaccineWrokRequestQueue) {
        this.vaccineWorkRequestQueue = vaccineWrokRequestQueue;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public ManpowerRequestQueue getManpowerQueue() {
        return manpowerQueue;
    }

    public void setManpowerQueue(ManpowerRequestQueue manpowerQueue) {
        this.manpowerQueue = manpowerQueue;
    }
    

    public boolean isAccount() {
        return account;
    }

    public void setAccount(boolean account) {
        this.account = account;
    }

    
    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public EmailQueue getEmailQueue() {
        return emailQueue;
    }
    
    
    public enum organizationType{
        schoolAdmin("School Admin"),principal("Principal"),treasury("Treasury"),stationaryInventroyManager("Stationary Inventory Manager"),stationaryInvoiceManager("Stationary Invoice Manager"),vaccineManufacturer("Vaccince Manufacturer"),healthProviderInventoryManager("Health Provider Inventory Manager");//change this
        private String value;
        private organizationType(String name)
        {
            this.value=name;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
        
    }
        
        
    
 

    

    
    
    public abstract ArrayList<Role> getSupportedRole();

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }


    public String getOrganisationName() {
        return organizationName;
    }

    public void setOrganisationName(String organisationName) {
        this.organizationName = organisationName;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }
    public String toString()
    {
        return organizationName;
    }
    
}
