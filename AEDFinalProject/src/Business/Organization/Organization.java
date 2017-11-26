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
    public Organization(String name)
    {

        organisationName= name;
        workQueue = new WorkQueue();
        emailQueue = new EmailQueue();

        employeeDirectory= new EmployeeDirectory();
        userAccountDirectory= new UserAccountDirectory();
        organizationID=counter;
        ++counter;
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
