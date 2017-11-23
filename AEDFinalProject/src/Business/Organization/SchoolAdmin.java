/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SchoolAdminRole;
import java.util.ArrayList;

/**
 *
 * @author akash
 */
public class SchoolAdmin extends Organization{

    public SchoolAdmin(String name) {
        super(Organization.organizationType.schoolAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SchoolAdminRole());
        return roles; 
    }
    
}
