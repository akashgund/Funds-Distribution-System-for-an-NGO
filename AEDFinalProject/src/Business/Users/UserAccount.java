/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Employee.Employee;
import Business.Enterprize.Enterprize;
import Business.Network.Network;
import Business.OrderItems.Order;
import Business.Role.Role;
import Business.WorkQueue.EmailQueue;
import Business.WorkQueue.ManpowerRequestQueue;
import Business.WorkQueue.StationaryRquestQueue;
import Business.WorkQueue.VaccineWorkRequestQueue;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author akash
 */
public class UserAccount {
    
    private String userName;
    private String password;
    private String emailId;
    private Employee employee;
    private Role role;
    private WorkQueue workQueue;
    private EmailQueue emailQueue;
    private ArrayList<Order> orderList;
    private ManpowerRequestQueue manPowerQueue;
    private VaccineWorkRequestQueue vacccineWorkRequestQueue;
    private StationaryRquestQueue stationaryWorkRequestQueue;
    private Network network;
    private Enterprize enterprize;
    //add workqueue
    public UserAccount() {
       workQueue = new WorkQueue();
       emailQueue = new EmailQueue();
       orderList = new ArrayList<>();
       manPowerQueue= new ManpowerRequestQueue();
       vacccineWorkRequestQueue= new VaccineWorkRequestQueue();
    }

    public StationaryRquestQueue getStationaryWorkRequestQueue() {
        return stationaryWorkRequestQueue;
    }

    public void setStationaryWorkRequestQueue(StationaryRquestQueue stationaryWorkRequestQueue) {
        this.stationaryWorkRequestQueue = stationaryWorkRequestQueue;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public Enterprize getEnterprize() {
        return enterprize;
    }

    public void setEnterprize(Enterprize enterprize) {
        this.enterprize = enterprize;
    }

    
    public VaccineWorkRequestQueue getVacccineWorkRequestQueue() {
        return vacccineWorkRequestQueue;
    }

    public void setVacccineWorkRequestQueue(VaccineWorkRequestQueue vacccineWorkQueue) {
        this.vacccineWorkRequestQueue = vacccineWorkQueue;
    }

    public ManpowerRequestQueue getManPowerQueue() {
        return manPowerQueue;
    }

    public void setManPowerQueue(ManpowerRequestQueue manPowerQueue) {
        this.manPowerQueue = manPowerQueue;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public EmailQueue getEmailQueue() {
        return emailQueue;
    }

    public void setEmailQueue(EmailQueue emailQueue) {
        this.emailQueue = emailQueue;
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
    
    
@Override
public String toString()
{
    return userName;
}
   
    
}

