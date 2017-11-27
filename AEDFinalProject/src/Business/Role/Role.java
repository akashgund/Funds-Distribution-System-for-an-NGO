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
import javax.swing.JPanel;

/**
 *
 * @author akash
 */
public abstract class Role {
    /*
    public enum roletype{
        SystemAdmin("SystemAdmin"),SchoolAdminRole("School Admin"),Principal("principal"),Teacher("Teacher");
        
        public String value;
        
        
        private roletype(String value)
        {
            this.value=value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
        @Override
        public String toString()
        {
            return(value);
        }
    }
    */
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account,
            Network network,
            Organization organisation, 
            Enterprize enterprise, 
            Ecosystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}
