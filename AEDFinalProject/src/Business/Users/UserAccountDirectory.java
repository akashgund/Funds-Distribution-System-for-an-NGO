/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;
import Business.Users.UserAccount;

/**
 *
 * @author akash
 */
public class UserAccountDirectory {
    
    ArrayList<UserAccount> userAccountList;
    public UserAccountDirectory()
    {
    userAccountList= new ArrayList<UserAccount>();
    }

    public ArrayList<UserAccount> getUserAccount() {
        return userAccountList;
    }

    public void setUserAccount(ArrayList<UserAccount> userAccount) {
        this.userAccountList = userAccount;
    }
    
    public UserAccount authenticateUser(String username, String password){
         //loop for testing if req. else comment it out
         for (UserAccount userAccount : userAccountList)
         {
             //System.out.println("your stuff");
            
             System.out.println(userAccount.getUsername());
         }
        System.out.println("in auhtenticate");
        for (UserAccount userAccount : userAccountList){
           // System.out.println(userAccount.getUsername()+" "+ userAccount.getPassword());
            if (userAccount.getUsername().equals(username) && userAccount.getPassword().equals(password)){
                //System.out.println(username+" "+password+"abababba");
                return userAccount;
            }
        }
        return null;
    }
    
     public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUserName(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
}