/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Organization.Organization;
import Business.Role.Role;
import Business.WorkQueue.EmailQueue;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author akash
 */
public class InfraProvider extends Organization {

    private String infraProviderName;
    private static InfraProvider infraProvider;
    private WorkQueue workQueue;
    private EmailQueue emailQueue;

    public InfraProvider(String name) {
        super(name);
        workQueue = new WorkQueue();
        emailQueue = new EmailQueue();

    }

    public String getInfraProviderName() {
        return infraProviderName;
    }

    public void setInfraProviderName(String infraProviderName) {
        this.infraProviderName = infraProviderName;
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

    public static InfraProvider getInstance() {
        if (infraProvider == null) {
            infraProvider = new InfraProvider(null);//chk name passed
        }
        return infraProvider;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
