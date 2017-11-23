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
public class VaccineManufacturer extends Organization{

    private String vaccineManufacturerName;
    private WorkQueue workQueue;
    private EmailQueue emailQueue;
    private static VaccineManufacturer vaccineManufacturer;
    private VaccineManufacturer(String name) {
        super(name);
        workQueue= new WorkQueue();
        emailQueue= new EmailQueue();
        
        
    }
public static VaccineManufacturer getInstance()
{
    if(vaccineManufacturer==null)
    {
        vaccineManufacturer= new VaccineManufacturer(null);//chk name passed
    }
    return vaccineManufacturer;
}
    public String getVaccineManufacturerName() {
        return vaccineManufacturerName;
    }

    public void setVaccineManufacturerName(String vaccineManufacturerName) {
        this.vaccineManufacturerName = vaccineManufacturerName;
    }
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
