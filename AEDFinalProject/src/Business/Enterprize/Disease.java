/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprize;

/**
 *
 * @author Dell
 */
public class Disease {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
    public class Vaccine {

        private String vaccineName;
        private int quantity;

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
        
        
        public String getVaccineName() {
            return vaccineName;
        }

        public void setVaccineName(String vaccineName) {
            this.vaccineName = vaccineName;
        }

       

        public Disease getDisease() {
            return Disease.this;
        }

        @Override
        public String toString() {
            return vaccineName;
        }
    }

    @Override
    public String toString() {
        return this.getName();
    }

}
