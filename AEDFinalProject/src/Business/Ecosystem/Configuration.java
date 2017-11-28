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
import Business.Role.StateAdminRole;
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
        Employee e1 = state1.getEmployeeDirectory().createEmployee("sur");
        state1.getUserAccountDirectory().createUserAccount("sur", "sur", e1, new StateAdminRole());
        Enterprize s1 = state1.getEnterpriseDirectory().createAndAddEnterprise("Prestige High School", School);
        Enterprize s2 = state1.getEnterpriseDirectory().createAndAddEnterprise("Centenary School", School);
        Enterprize s3 = state1.getEnterpriseDirectory().createAndAddEnterprise("Eveline Girls High School", School);
        Enterprize s4 = state1.getEnterpriseDirectory().createAndAddEnterprise("Prestige High School", School);
        Enterprize s5 = state1.getEnterpriseDirectory().createAndAddEnterprise("Dominican Convent High School", School);
        
        Network state2 = system.createAndAddNetwork("Harare");
        e1 = state2.getEmployeeDirectory().createEmployee("chacha");
        state2.getUserAccountDirectory().createUserAccount("chacha", "chacha", e1, new StateAdminRole());
        s1 = state2.getEnterpriseDirectory().createAndAddEnterprise("Alan Wilson High School", School);
        s2 = state2.getEnterpriseDirectory().createAndAddEnterprise("Bob Marley High School", School);
        s3 = state2.getEnterpriseDirectory().createAndAddEnterprise("Churchill School", School);
        s4 = state2.getEnterpriseDirectory().createAndAddEnterprise("Hellenic Academy", School);
        s5 = state2.getEnterpriseDirectory().createAndAddEnterprise("Morgan High School", School);
        
        Network state3 = system.createAndAddNetwork("Manicaland");
        e1 = state3.getEmployeeDirectory().createEmployee("idli");
        state3.getUserAccountDirectory().createUserAccount("idli", "idli", e1, new StateAdminRole());
        s1 = state3.getEnterpriseDirectory().createAndAddEnterprise("Chikwakwa High School", School);
        s2 = state3.getEnterpriseDirectory().createAndAddEnterprise("Gatsi Primary School", School);
        s3 = state3.getEnterpriseDirectory().createAndAddEnterprise("Mutare Junior School", School);
        s4 = state3.getEnterpriseDirectory().createAndAddEnterprise("Baring Junior School", School);
        s5 = state3.getEnterpriseDirectory().createAndAddEnterprise("Hartzell High School", School);
        
        Network state4 = system.createAndAddNetwork("Mashionland Central");
        e1 = state4.getEmployeeDirectory().createEmployee("chotu");
        state4.getUserAccountDirectory().createUserAccount("chotu", "chotu", e1, new StateAdminRole());
        s1 = state4.getEnterpriseDirectory().createAndAddEnterprise("Chindotwe Primary School", School);
        s2 = state4.getEnterpriseDirectory().createAndAddEnterprise("Howard High School", School);
        s3 = state4.getEnterpriseDirectory().createAndAddEnterprise("Mutare Junior School", School);
        s4 = state4.getEnterpriseDirectory().createAndAddEnterprise("Lady Enereta High School", School);
        s5 = state4.getEnterpriseDirectory().createAndAddEnterprise("Guwa Primary School", School);
        
        Network state5 = system.createAndAddNetwork("Mashionland East");
        e1 = state5.getEmployeeDirectory().createEmployee("bhai");
        state5.getUserAccountDirectory().createUserAccount("bhai", "bhai", e1, new StateAdminRole());
        s1 = state5.getEnterpriseDirectory().createAndAddEnterprise("Blackman School", School);
        s2 = state5.getEnterpriseDirectory().createAndAddEnterprise("Ruwa Primary School", School);
        s3 = state5.getEnterpriseDirectory().createAndAddEnterprise("Windsor Primary School", School);
        s4 = state5.getEnterpriseDirectory().createAndAddEnterprise("Zimre Primary School", School);
        s5 = state5.getEnterpriseDirectory().createAndAddEnterprise("Govera Primary and Secondary", School);
        
        Network state6 = system.createAndAddNetwork("Mashionland West");
        e1 = state6.getEmployeeDirectory().createEmployee("aniruddh");
        state6.getUserAccountDirectory().createUserAccount("aniruddh", "aniruddh", e1, new StateAdminRole());
        s1 = state6.getEnterpriseDirectory().createAndAddEnterprise("Dalny Mine High School", School);
        s2 = state6.getEnterpriseDirectory().createAndAddEnterprise("Benhura Secondary School", School);
        s3 = state6.getEnterpriseDirectory().createAndAddEnterprise("Waverly High School", School);
        s4 = state6.getEnterpriseDirectory().createAndAddEnterprise("Muchemwa High School", School);
        s5 = state6.getEnterpriseDirectory().createAndAddEnterprise("Chisina Secondary School", School);
        
        Network state7 = system.createAndAddNetwork("Masvingo");
        e1 = state7.getEmployeeDirectory().createEmployee("tanmay");
        state7.getUserAccountDirectory().createUserAccount("tanmay", "tanmay", e1, new StateAdminRole());
        s1 = state7.getEnterpriseDirectory().createAndAddEnterprise("Jaravaza Primary School", School);
        s2 = state7.getEnterpriseDirectory().createAndAddEnterprise("Mateme High School", School);
        s3 = state7.getEnterpriseDirectory().createAndAddEnterprise("Dogwe Primary School", School);
        s4 = state7.getEnterpriseDirectory().createAndAddEnterprise("Chedutu Primary School ", School);
        s5 = state7.getEnterpriseDirectory().createAndAddEnterprise("Rupare Secondary School    ", School);
        
        Network state8 = system.createAndAddNetwork("Matabeleland North");
        e1 = state8.getEmployeeDirectory().createEmployee("vivek");
        state8.getUserAccountDirectory().createUserAccount("vivek", "vivek", e1, new StateAdminRole());
        s1 = state8.getEnterpriseDirectory().createAndAddEnterprise("Beula Primary School", School);
        s2 = state8.getEnterpriseDirectory().createAndAddEnterprise("Cyrene Mission", School);
        s3 = state8.getEnterpriseDirectory().createAndAddEnterprise("Homestead Primary School", School);
        s4 = state8.getEnterpriseDirectory().createAndAddEnterprise("Minda High School", School);
        s5 = state8.getEnterpriseDirectory().createAndAddEnterprise("Msithi Primary School", School);
        
        Network state9 = system.createAndAddNetwork("Matabeleland South");
        e1 = state9.getEmployeeDirectory().createEmployee("akash");
        state9.getUserAccountDirectory().createUserAccount("akash", "akash", e1, new StateAdminRole());
        s1 = state9.getEnterpriseDirectory().createAndAddEnterprise("Ronga Primary School", School);
        s2 = state9.getEnterpriseDirectory().createAndAddEnterprise("Gwenya Primary School", School);
        s3 = state9.getEnterpriseDirectory().createAndAddEnterprise("St Paul's Secondary School", School);
        s4 = state9.getEnterpriseDirectory().createAndAddEnterprise("Nyatsime College", School);
        s5 = state9.getEnterpriseDirectory().createAndAddEnterprise("Somapani Primary School", School);
        
        Network state10 = system.createAndAddNetwork("Midlands");
        e1 = state10.getEmployeeDirectory().createEmployee("bhaiwillbebhai");
        state10.getUserAccountDirectory().createUserAccount("bhaiwillbebhai", "bhaiwillbebhai", e1, new StateAdminRole());
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
