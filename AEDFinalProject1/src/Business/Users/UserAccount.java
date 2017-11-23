/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Employee.Employee;
import Business.Role.Role;

/**
 *
 * @author akash
 */
public class UserAccount {
    
     private String userName;
    private String password;
    private Employee employee;
    private Role role;
    //add workqueue
    public UserAccount() {
        //initialize workqueue here, add getter setter
        
    }

    public String getUsername() {
        return userName;
    }

    public void setUserName(String username) {
        this.userName = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Role getRole() {
        System.out.println(role);
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

   
    
}

