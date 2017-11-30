/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprize;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author akash
 */
public class InfraProvider extends Enterprize {

    private String infraProviderName;
    private static InfraProvider infraProvider;

    public InfraProvider(String name) {
        super(name,Enterprize.Enterprisetype.Infrastructure);
    }

    public String getInfraProviderName() {
        return infraProviderName;
    }

    public void setInfraProviderName(String infraProviderName) {
        this.infraProviderName = infraProviderName;
    }

    public static InfraProvider getInstance() {
        if (infraProvider == null) {
            infraProvider = new InfraProvider("State Infrastructure Provider");//chk name passed
        }
        return infraProvider;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
