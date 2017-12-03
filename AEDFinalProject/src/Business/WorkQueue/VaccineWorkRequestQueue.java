/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author akash
 */
public class VaccineWorkRequestQueue {
    ArrayList<VaccineWorkRequest> vaccineWorkRequestQueue;

    public VaccineWorkRequestQueue() {
        vaccineWorkRequestQueue= new ArrayList<VaccineWorkRequest>();
    }

    public ArrayList<VaccineWorkRequest> getVaccineWorkRequestQueue() {
        return vaccineWorkRequestQueue;
    }

    public void setVaccineWorkRequestQueue(ArrayList<VaccineWorkRequest> vaccineWorkRequestQueue) {
        this.vaccineWorkRequestQueue = vaccineWorkRequestQueue;
    }
    
    
}
