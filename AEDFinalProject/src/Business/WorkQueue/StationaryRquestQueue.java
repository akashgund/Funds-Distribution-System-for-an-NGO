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
public class StationaryRquestQueue {
     ArrayList<StationaryRequest> StationaryWorkRequestQueue;

    public StationaryRquestQueue() {
        StationaryWorkRequestQueue= new ArrayList<StationaryRequest>();
    }

    public ArrayList<StationaryRequest> getStationaryWorkRequestQueue() {
        return StationaryWorkRequestQueue;
    }

    public void setStationaryWorkRequestQueue(ArrayList<StationaryRequest> StationaryWorkRequestQueue) {
        this.StationaryWorkRequestQueue = StationaryWorkRequestQueue;
    }
    
}
