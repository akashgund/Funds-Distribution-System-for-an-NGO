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
public class InfraRequestQueue {
     ArrayList<InfraRequest> InfraWorkRequestQueue;

    public InfraRequestQueue() {
        InfraWorkRequestQueue= new ArrayList<InfraRequest>();
        
    }

    public ArrayList<InfraRequest> getInfraWorkRequestQueue() {
        return InfraWorkRequestQueue;
    }

    public void setInfraWorkRequestQueue(ArrayList<InfraRequest> InfraWorkRequestQueue) {
        this.InfraWorkRequestQueue = InfraWorkRequestQueue;
    }
    
    
}
