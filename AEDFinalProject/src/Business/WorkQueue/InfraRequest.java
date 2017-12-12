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
public class InfraRequest extends WorkRequestABS  {
    private int infraRequested;
    private int infraGranted;
    private String status;
    private String requestType;
    public InfraRequest() {
        this.requestType = "Infra Request";
    }

    public int getInfraRequested() {
        return infraRequested;
    }

    public void setInfraRequested(int infraRequested) {
        this.infraRequested = infraRequested;
    }

    public int getInfraGranted() {
        return infraGranted;
    }

    public void setInfraGranted(int infraGranted) {
        this.infraGranted = infraGranted;
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
    
}
