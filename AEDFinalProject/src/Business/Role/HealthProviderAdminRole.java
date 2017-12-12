/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem.Ecosystem;
import Business.Enterprize.Enterprize;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Users.UserAccount;
import Interfaces.HealthCare.HealthCareProviderAdminRole;
import Interfaces.SchoolAdmin.SchoolAdminWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author akash
 */
public class HealthProviderAdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Network network, Organization organisation, Enterprize enterprise, Ecosystem business) {
          return new HealthCareProviderAdminRole(userProcessContainer , account);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
