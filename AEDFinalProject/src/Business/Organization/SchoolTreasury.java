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

    private static SchoolTreasury treasury;
    private SchoolTreasury(String name) {
        super(name);
    }

    public static SchoolTreasury getInstance() {
        if (treasury == null) {
            treasury = new SchoolTreasury(Organization.organizationType.treasury.getValue());// chk for the name passed
        }
        return treasury;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SchoolTreasuryRole());
        return roles;
    }
    

    
    
    
}
