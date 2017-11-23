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
public class StationaryProvider extends Organization {
    private String stationaryProviderName;
    //private static InfraProvider infraProvider;
    private WorkQueue workQueue;
    private EmailQueue emailQueue;
    private static StationaryProvider stationaryProvider;

    public StationaryProvider(String name) {
        super(name);
        workQueue = new WorkQueue();
        emailQueue = new EmailQueue();
        
    }

    public String getStationaryProviderName() {
        return stationaryProviderName;
    }

    public void setStationaryProviderName(String stationaryProviderName) {
        this.stationaryProviderName = stationaryProviderName;
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

   public static StationaryProvider getInstance()
   {
       if(stationaryProvider==null)
           
       {
           stationaryProvider = new StationaryProvider(null);//
       }
       return stationaryProvider;
   }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

   

   
      
    
    
    

