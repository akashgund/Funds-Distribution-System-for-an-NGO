/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SchoolAdminRole;
import Business.Role.SchoolPrincipalRole;
import java.util.ArrayList;

/**
 *
 * @author akash
 */
public class SchoolPrincipal extends Organization {

    public SchoolPrincipal(String name) {
        super(organizationType.principal.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SchoolPrincipalRole());
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
