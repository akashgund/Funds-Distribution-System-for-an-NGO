/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Funds;

/**
 *
 * @author akash
 */
public abstract class Funds {
    String fundName;
    int fundAmount;
    private fundsType type;
    public Funds(fundsType type)
    {
       this.type = type;
    }
     public enum fundsType{
         InfraFunds("Infra Funds"),StationaryFunds("Stationary Funds"),HealthCareFunds("HealthCare Funds");
        private String value;
        private fundsType(String name)
        {
            this.value=name;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
        
        
    }

    public void setFundAmount(int fundAmount) {
        this.fundAmount = fundAmount;
    }

    public int getFundAmount() {
        return fundAmount;
    }
     
 
    
}
