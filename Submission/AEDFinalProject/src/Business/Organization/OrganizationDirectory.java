/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.organizationType;
import static Business.Organization.Organization.organizationType.principal;
import java.util.ArrayList;

/**
 *
 * @author akash
 */
public class OrganizationDirectory {

    ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<Organization>();
    }

    public ArrayList<Organization> getOrganisationList() {
        return organizationList;
    }

    public void setOrganisationList(ArrayList<Organization> organisationList) {
        this.organizationList = organisationList;
    }

    public Organization createOrganisation() {
        //ADD ORGANISATION ADDING STUFFS HERE

        return null;
    }

    public Organization createOrganization(organizationType type) {
        Organization organization = null;
        
        if (type == principal){
            organization = SchoolPrincipal.getInstance();
        }
        
        else
        {
            organization = SchoolTreasury.getInstance();
        }
        return organization;
    }

}
