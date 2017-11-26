/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprize;

import Business.Network.*;
import Business.Enterprize.Enterprize;
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
public class VaccineManufacturer extends Enterprize {

    private String vaccineManufacturerName;
    private static VaccineManufacturer vaccineManufacturer;

    private VaccineManufacturer(String name) {
        super(name, Enterprize.Enterprisetype.Vaccine);
    }

    public static VaccineManufacturer getInstance() {
        if (vaccineManufacturer == null) {
            vaccineManufacturer = new VaccineManufacturer(null);//chk name passed
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
