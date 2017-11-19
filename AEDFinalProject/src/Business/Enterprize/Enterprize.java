/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprize;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author akash
 */
  
  public abstract class Enterprize extends Organization{

    private Enterprisetype enterpriseType;
    private OrganizationDirectory organizationDirectory;
    
    
    public Enterprize(String name, Enterprisetype type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

    

    public Enterprisetype getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(Enterprisetype enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

   
    
    public enum Enterprisetype {
      Health("HealthCare"),Distributor("InfrastructureProvider"),School("School"),StationarySupplier("StationarySupplier");
      
      private String value;
      private Enterprisetype(String value)
              
      {
          this.value=value;
      }
      public String getValue()
      {
          return value;
          
      }
      @Override
      public String toString()
      {
          return value;
      }
  }
    
    


    
}

