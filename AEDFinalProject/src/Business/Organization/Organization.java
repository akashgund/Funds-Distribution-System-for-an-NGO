/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.Users.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author akash
 */
public abstract class Organization {
    
    private String organisationName;
    //add workqueue 
 
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter;
    public Organization(String name)
    {
        //loop ids
        organisationName= name;
       
     
        employeeDirectory= new EmployeeDirectory();
        userAccountDirectory= new UserAccountDirectory();
        
        
        organizationID=counter;
        ++counter;
    }
    
    public enum organizationType{
        Clinic("Clinic"),Admin("Organisation Admin"),Provider("Provider"),Doctor("Doctor"),StockManager("Stock Manager");
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
        return organisationName;
    }

    public void setOrganisationName(String organisationName) {
        this.organisationName = organisationName;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }
    public String toString()
    {
        return organisationName;
    }
    
}
