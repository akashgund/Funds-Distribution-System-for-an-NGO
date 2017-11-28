/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Employee.Employee;
import Business.Role.Role;
import Business.WorkQueue.EmailQueue;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author akash
 */
public class UserAccount {
    
    private String userName;
    private String password;
    private Employee employee;
    private Role role;
    private WorkQueue workQueue;
    private EmailQueue emailQueue;
    //add workqueue
    public UserAccount() {
       workQueue = new WorkQueue();
       emailQueue = new EmailQueue();
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

