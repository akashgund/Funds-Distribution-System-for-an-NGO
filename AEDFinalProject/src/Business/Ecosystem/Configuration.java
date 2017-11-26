/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Ecosystem;

import Business.Employee.Employee;
import Business.Enterprize.Enterprize;
import static Business.Enterprize.Enterprize.Enterprisetype.School;
import Business.Network.Network;
import Business.Role.SystemAdminRole;
import Business.Users.UserAccount;

/**
 *
 * @author Dell
 */
public class Configuration {

    public static Ecosystem configure() {

        Ecosystem system = Ecosystem.getInstance();

        //Create a network
        Network state1 = system.createAndAddNetwork("Bulawayo");
        Enterprize s1 = state1.getEnterpriseDirectory().createAndAddEnterprise("Prestige High School", School);
        Enterprize s2 = state1.getEnterpriseDirectory().createAndAddEnterprise("Centenary School", School);
        Enterprize s3 = state1.getEnterpriseDirectory().createAndAddEnterprise("Eveline Girls High School", School);
        Enterprize s4 = state1.getEnterpriseDirectory().createAndAddEnterprise("Prestige High School", School);
        Enterprize s5 = state1.getEnterpriseDirectory().createAndAddEnterprise("Dominican Convent High School", School);
        Network state2 = system.createAndAddNetwork("Harare");
        s1 = state2.getEnterpriseDirectory().createAndAddEnterprise("Alan Wilson High School", School);
        s2 = state2.getEnterpriseDirectory().createAndAddEnterprise("Bob Marley High School", School);
        s3 = state2.getEnterpriseDirectory().createAndAddEnterprise("Churchill School", School);
        s4 = state2.getEnterpriseDirectory().createAndAddEnterprise("Hellenic Academy", School);
        s5 = state2.getEnterpriseDirectory().createAndAddEnterprise("Morgan High School", School);
        Network state3 = system.createAndAddNetwork("Manicaland");
        s1 = state3.getEnterpriseDirectory().createAndAddEnterprise("Chikwakwa High School", School);
        s2 = state3.getEnterpriseDirectory().createAndAddEnterprise("Gatsi Primary School", School);
        s3 = state3.getEnterpriseDirectory().createAndAddEnterprise("Mutare Junior School", School);
        s4 = state3.getEnterpriseDirectory().createAndAddEnterprise("Baring Junior School", School);
        s5 = state3.getEnterpriseDirectory().createAndAddEnterprise("Hartzell High School", School);
        Network state4 = system.createAndAddNetwork("Mashionland Central");
        s1 = state4.getEnterpriseDirectory().createAndAddEnterprise("Chindotwe Primary School", School);
        s2 = state4.getEnterpriseDirectory().createAndAddEnterprise("Howard High School", School);
        s3 = state4.getEnterpriseDirectory().createAndAddEnterprise("Mutare Junior School", School);
        s4 = state4.getEnterpriseDirectory().createAndAddEnterprise("Lady Enereta High School", School);
        s5 = state4.getEnterpriseDirectory().createAndAddEnterprise("Guwa Primary School", School);
        Network state5 = system.createAndAddNetwork("Mashionland East");
        s1 = state5.getEnterpriseDirectory().createAndAddEnterprise("Blackman School", School);
        s2 = state5.getEnterpriseDirectory().createAndAddEnterprise("Ruwa Primary School", School);
        s3 = state5.getEnterpriseDirectory().createAndAddEnterprise("Windsor Primary School", School);
        s4 = state5.getEnterpriseDirectory().createAndAddEnterprise("Zimre Primary School", School);
        s5 = state5.getEnterpriseDirectory().createAndAddEnterprise("Govera Primary and Secondary", School);
        Network state6 = system.createAndAddNetwork("Mashionland West");
        s1 = state6.getEnterpriseDirectory().createAndAddEnterprise("Dalny Mine High School", School);
        s2 = state6.getEnterpriseDirectory().createAndAddEnterprise("Benhura Secondary School", School);
        s3 = state6.getEnterpriseDirectory().createAndAddEnterprise("Waverly High School", School);
        s4 = state6.getEnterpriseDirectory().createAndAddEnterprise("Muchemwa High School", School);
        s5 = state6.getEnterpriseDirectory().createAndAddEnterprise("Chisina Secondary School", School);
        Network state7 = system.createAndAddNetwork("Masvingo");
        s1 = state7.getEnterpriseDirectory().createAndAddEnterprise("Jaravaza Primary School", School);
        s2 = state7.getEnterpriseDirectory().createAndAddEnterprise("Mateme High School", School);
        s3 = state7.getEnterpriseDirectory().createAndAddEnterprise("Dogwe Primary School", School);
        s4 = state7.getEnterpriseDirectory().createAndAddEnterprise("Chedutu Primary School ", School);
        s5 = state7.getEnterpriseDirectory().createAndAddEnterprise("Rupare Secondary School    ", School);
        Network state8 = system.createAndAddNetwork("Matabeleland North");
        s1 = state8.getEnterpriseDirectory().createAndAddEnterprise("Beula Primary School", School);
        s2 = state8.getEnterpriseDirectory().createAndAddEnterprise("Cyrene Mission", School);
        s3 = state8.getEnterpriseDirectory().createAndAddEnterprise("Homestead Primary School", School);
        s4 = state8.getEnterpriseDirectory().createAndAddEnterprise("Minda High School", School);
        s5 = state8.getEnterpriseDirectory().createAndAddEnterprise("Msithi Primary School", School);
        Network state9 = system.createAndAddNetwork("Matabeleland South");
        s1 = state9.getEnterpriseDirectory().createAndAddEnterprise("Ronga Primary School", School);
        s2 = state9.getEnterpriseDirectory().createAndAddEnterprise("Gwenya Primary School", School);
        s3 = state9.getEnterpriseDirectory().createAndAddEnterprise("St Paul's Secondary School", School);
        s4 = state9.getEnterpriseDirectory().createAndAddEnterprise("Nyatsime College", School);
        s5 = state9.getEnterpriseDirectory().createAndAddEnterprise("Somapani Primary School", School);
        Network state10 = system.createAndAddNetwork("Midlands");
        s1 = state10.getEnterpriseDirectory().createAndAddEnterprise("Bradley High School", School);
        s2 = state10.getEnterpriseDirectory().createAndAddEnterprise("Sodbury school", School);
        s3 = state10.getEnterpriseDirectory().createAndAddEnterprise("Nyamangara Secondary School", School);
        s4 = state10.getEnterpriseDirectory().createAndAddEnterprise("Moleli High School", School);
        s5 = state10.getEnterpriseDirectory().createAndAddEnterprise("Veza Primary School", School);
        //System.out.println(state1.get);
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account

        Employee employee = system.getEmployeeDirectory().createEmployee("Tanmay Sinha");

        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());

        return system;
    }

}
