/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SchoolTreasuryRole;
import Business.Role.StaionaryInvoiceManagerRole;
import java.util.ArrayList;

/**
 *
 * @author akash
 */
public class StaionaryInvoiceManager extends Organization {

    public StaionaryInvoiceManager(String name) {
        super(Organization.organizationType.stationaryInvoiceManager.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roles = new ArrayList<>();
        roles.add(new StaionaryInvoiceManagerRole());
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
