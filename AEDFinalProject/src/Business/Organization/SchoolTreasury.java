/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Ecosystem.Ecosystem;
import Business.Enterprize.Enterprize;
import Business.Network.Network;
import Business.Role.Role;
import Business.Role.SchoolPrincipalRole;
import Business.Role.SchoolTreasuryRole;
import Business.Users.UserAccount;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author akash
 */
public class SchoolTreasury extends Organization{

    public SchoolTreasury(String name) {
        super(Organization.organizationType.treasury.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SchoolTreasuryRole());
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
    
    
}
