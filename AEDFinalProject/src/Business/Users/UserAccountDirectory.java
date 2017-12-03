/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Ecosystem.Ecosystem;
import Business.Employee.Employee;
import Business.Enterprize.Enterprize;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author akash
 */
public class UserAccountDirectory {

    ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<UserAccount>();
    }

    public ArrayList<UserAccount> getUserAccount() {
        return userAccountList;
    }

    public void setUserAccount(ArrayList<UserAccount> userAccount) {
        this.userAccountList = userAccount;
    }

    public UserAccount authenticateUser(String username, String password) {
        //loop for testing if req. else comment it out
        /*for (UserAccount userAccount : userAccountList)
         {
             System.out.println(userAccount.getUsername());
         }*/
        for (UserAccount userAccount : userAccountList) {
            // System.out.println(userAccount.getUsername()+" "+ userAccount.getPassword());
            if (userAccount.getUsername().equals(username) && userAccount.getPassword().equals(password)) {
                return userAccount;
            }
        }
        return null;
    }

    public UserAccount createUserAccount(String username, String password, Employee employee, Role role) {
        if (checkUnique(username)) {
            UserAccount userAccount = new UserAccount();
            userAccount.setUserName(username);
            userAccount.setPassword(password);
            userAccount.setEmployee(employee);
            userAccount.setRole(role);
            userAccountList.add(userAccount);
            return userAccount;
        } else {
            System.out.println("lund bazaar");
            return null;
        }
    }

    public boolean checkUnique(String username) {
        Ecosystem system = Ecosystem.getInstance();
        for (UserAccount ua : system.getUserAccountDirectory().getUserAccount()) {
            if (ua.getUsername().equalsIgnoreCase(username)) {
                return false;
            }
        }

        for (Network n : system.getNetworkList()) {
            for (UserAccount ua : n.getUserAccountDirectory().getUserAccount()) {
                if (ua.getUsername().equalsIgnoreCase(username)) {
                    return false;
                }
            }
            for (Enterprize e : n.getEnterpriseDirectory().getEnterprizeList()) {
                for (UserAccount ua : e.getUserAccountDirectory().getUserAccount()) {
                    if (ua.getUsername().equalsIgnoreCase(username)) {
                        return false;
                    }
                }

                for (Organization o : e.getOrganizationDirectory().getOrganisationList()) {
                    for (UserAccount ua : o.getUserAccountDirectory().getUserAccount()) {
                        if (ua.getUsername().equalsIgnoreCase(username)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

}
