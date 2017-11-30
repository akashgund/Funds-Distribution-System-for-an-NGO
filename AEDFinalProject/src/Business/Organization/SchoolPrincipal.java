/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SchoolPrincipalRole;
import java.util.ArrayList;

/**
 *
 * @author akash
 */

public class SchoolPrincipal extends Organization{

    private static SchoolPrincipal principal;
    private SchoolPrincipal(String name) {
        super(name);
    }
    
    public static SchoolPrincipal getInstance() {
        if (principal == null) {
            principal = new SchoolPrincipal(Organization.organizationType.principal.getValue());// chk for the name passed
        }
        return principal;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SchoolPrincipalRole());
        return roles;
    }

}
