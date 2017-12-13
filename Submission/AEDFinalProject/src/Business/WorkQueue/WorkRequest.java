/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Enterprize.School;

/**
 *
 * @author akash
 */
public class WorkRequest extends WorkRequestABS {
    String fundType;
    double fundRequested;
    double fundAccepted;
    int teacherReq;
    String grantStatus;
    private String requestType;
    private boolean reported;

    public boolean isReported() {
        return reported;
    }

    public void setReported(boolean reported) {
        this.reported = reported;
    }

    
    
    

    public WorkRequest() {
        requestType="Fund Request";
    }
    

    public String getGrantStatus() {
        return grantStatus;
    }

    public void setGrantStatus(String grantStatus) {
        this.grantStatus = grantStatus;
    }
    
    public String getFundType() {
        return fundType;
    }

    public void setFundType(String fundType) {
        this.fundType = fundType;
    }

    public double getFundRequested() {
        return fundRequested;
    }

    public void setFundRequested(double fundRequested) {
        this.fundRequested = fundRequested;
    }

    public double getFundAccepted() {
        return fundAccepted;
    }

    public void setFundAccepted(double fundAccepted) {
        this.fundAccepted = fundAccepted;
    }

   
    
    
}
