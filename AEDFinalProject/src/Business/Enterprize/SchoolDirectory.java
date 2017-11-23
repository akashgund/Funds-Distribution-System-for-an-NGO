/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprize;

import java.util.ArrayList;

/**
 *
 * @author akash
 */
public class SchoolDirectory {
    public ArrayList<Enterprize> enterprizeList;
    public SchoolDirectory()
    {
        enterprizeList= new ArrayList<>();
        
    }

    public ArrayList<Enterprize> getEnterprizeList() {
        return enterprizeList;
    }

    public void setEnterpriseList(ArrayList<Enterprize> enterpriseList) {
        this.enterprizeList = enterpriseList;
    }
     public Enterprize createAndAddEnterprise(String name, Enterprize.Enterprisetype type){
        Enterprize enterprize = null;
        //add code here
        /*
        if (type == Enterprize.Enterprisetype.Health){
            enterprise = new HealthEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
*/
        return enterprize;
    }
    
}
