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
public class VaccineWorkRequest extends WorkRequestABS {
    private String VaccineName;
    private int quantityReq;
    private double bill;
    private String paymentStatus;
    private String requestType;
    private String status;

    public VaccineWorkRequest() {
        requestType= "Vaccine Request";
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getVaccineName() {
        return VaccineName;
    }

    public void setVaccineName(String VaccineName) {
        this.VaccineName = VaccineName;
    }

    public int getQuantityReq() {
        return quantityReq;
    }

    public void setQuantityReq(int quantityReq) {
        this.quantityReq = quantityReq;
    }

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }
    
    @Override
    public String toString()
    {
        return sender.getUsername();
    }
    
    
    
}
