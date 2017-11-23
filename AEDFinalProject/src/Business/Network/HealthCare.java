/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Organization.Organization;
import Business.Role.Role;
import Business.WorkQueue.Email;
import Business.WorkQueue.EmailQueue;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author akash
 */
public class HealthCare extends Organization {
    private String healthProviderName;
    private EmailQueue emailQueue;
    private static HealthCare healthCareProvider;
    private WorkQueue workQueue;
    private VaccineManufacturer vaccineManufacturer;

    public String getHealthProviderName() {
        return healthProviderName;
    }

    public void setHealthProviderName(String healthProviderName) {
        this.healthProviderName = healthProviderName;
    }

    public static HealthCare getHealthCareProvider() {
        return healthCareProvider;
    }

    public static void setHealthCareProvider(HealthCare healthCareProvider) {
        HealthCare.healthCareProvider = healthCareProvider;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    
    

   private HealthCare(String name) {
        super(name);
        workQueue= new WorkQueue();
        vaccineManufacturer= new VaccineManufacturer.getInstance();//hanlde code later
        emailQueue= new EmailQueue();
        
    }
private static HealthCare getInstance()
{
    if(healthCareProvider==null)
    {
        healthCareProvider= new HealthCare(null);// chk for the name passed
        
    }
    return healthCareProvider;
}
    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
