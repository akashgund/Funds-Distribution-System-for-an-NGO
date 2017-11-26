/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprize.*;
import java.util.ArrayList;

/**
 *
 * @author akash
 */
public class EnterpriseDirectory {
    public ArrayList<Enterprize> enterprizeList;
    public EnterpriseDirectory()
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
        if (type == Enterprize.Enterprisetype.School){
            enterprize = new School(name);
            enterprizeList.add(enterprize);
        }
        return enterprize;
    }
    
}
