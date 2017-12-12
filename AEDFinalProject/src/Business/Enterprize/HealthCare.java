/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprize;

import Business.OrderItems.Disease.Vaccine;
import Business.OrderItems.Disease;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author akash
 */
public class HealthCare extends Enterprize {

    private String healthProviderName;
    private static HealthCare healthCareProvider;
 

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

    private HealthCare(String name) {
        super(name,Enterprize.Enterprisetype.Healthcare);
        
    }
    
  

    public static HealthCare getInstance() {
        if (healthCareProvider == null) {
            healthCareProvider = new HealthCare("State Healthcare Provider");// chk for the name passed
        }
        return healthCareProvider;
    }
     @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
