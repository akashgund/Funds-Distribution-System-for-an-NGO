/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author akash
 */
public class StationaryRequest extends WorkRequestABS {
     private int StationaryRequested;
    private int StationaryGranted;
    private String status;
    private String requestType;

    public StationaryRequest() {
        this.requestType = "Stationary Request";
        
    }

    public int getStationaryRequested() {
        return StationaryRequested;
    }

    public void setStationaryRequested(int StationaryRequested) {
        this.StationaryRequested = StationaryRequested;
    }

    public int getStationaryGranted() {
        return StationaryGranted;
    }

    public void setStationaryGranted(int StationaryGranted) {
        this.StationaryGranted = StationaryGranted;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }
    @Override
    public String toString()
    {
        return sender.getUsername();
    }
    
}
