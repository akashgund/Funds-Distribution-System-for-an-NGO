/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Ecosystem;

import Business.Employee.Employee;
import Business.Enterprize.Enterprize;
import static Business.Enterprize.Enterprize.Enterprisetype.Healthcare;
import static Business.Enterprize.Enterprize.Enterprisetype.School;
import Business.Enterprize.School;
import Business.Funds.HealthFunds;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.HealthcareRole;
import Business.Role.InfraRole;
import Business.Role.SchoolAdminRole;
import Business.Role.SchoolPrincipalRole;
import Business.Role.SchoolTreasuryRole;
import Business.Role.StateAdminRole;
import Business.Role.StationaryAdminRole;
import Business.Role.SystemAdminRole;
import Business.Users.UserAccount;

/**
 *
 * @author Dell
 */
public class Configuration {

    public static Ecosystem configure() {

        Ecosystem system = Ecosystem.getInstance();
        School s =null;
        //Create a network
        Network state1 = system.createAndAddNetwork("Bulawayo");
        Employee e1 = state1.getEmployeeDirectory().createEmployee("sur");
        state1.getUserAccountDirectory().createUserAccount("sur", "sur", e1, new StateAdminRole());
        //Organization statesur=state1.get
        Enterprize h1 = state1.getHealthCare();
        
        //HEALTH CARE AND STTIONARY ACCOUNTS MADEE HERE
        
        e1 = h1.getEmployeeDirectory().createEmployee("Aditya Dev");
        h1.getUserAccountDirectory().createUserAccount("health1", "health1", e1, new HealthcareRole());
        h1.setAccount(true);
        Enterprize st1 = state1.getStationaryProvider();
        e1 = st1.getEmployeeDirectory().createEmployee("Varun Singh");
        h1.getUserAccountDirectory().createUserAccount("stationary1", "stationary1", e1, new StationaryAdminRole());
        h1.setAccount(true);
        Enterprize i1 = state1.getInfraProvider();
        e1 = i1.getEmployeeDirectory().createEmployee("Varun Singh");
        i1.getUserAccountDirectory().createUserAccount("infra1", "infra1", e1, new InfraRole());
        i1.setAccount(true);
        Enterprize s1 = state1.getEnterpriseDirectory().createAndAddEnterprise("Prestige High School", School);
        e1 = s1.getEmployeeDirectory().createEmployee("prestige");
        s1.getUserAccountDirectory().createUserAccount("prestige", "prestige", e1, new SchoolAdminRole());
        s1.setAccount(true);
        s = (School) s1;
        s.setIspendingRate(7000);
        s.setSspendingRate(1500);
        s.setHspendingRate(850);
        e1 = s1.getEmployeeDirectory().createEmployee("Shardul");
        Organization prestigePrincipal = s1.getOrganizationDirectory().createOrganization(Organization.organizationType.principal);
        prestigePrincipal.getUserAccountDirectory().createUserAccount("prestigeP", "prestigeP", e1, new SchoolPrincipalRole());
        prestigePrincipal.setAccount(true);
        e1 = s1.getEmployeeDirectory().createEmployee("Virat");
        Organization prestigeTreasury = s1.getOrganizationDirectory().createOrganization(Organization.organizationType.treasury);
        prestigeTreasury.getUserAccountDirectory().createUserAccount("prestigeT", "prestigeT", e1, new SchoolTreasuryRole());
        prestigeTreasury.setAccount(true);
        Enterprize s2 = state1.getEnterpriseDirectory().createAndAddEnterprise("Centenary School", School);
        s = (School) s2;
        s.setIspendingRate(5000);
        s.setSspendingRate(1200);
        s.setHspendingRate(800);
        Enterprize s3 = state1.getEnterpriseDirectory().createAndAddEnterprise("Eveline Girls High School", School);
        s = (School) s3;
        s.setIspendingRate(6000);
        s.setSspendingRate(1100);
        s.setHspendingRate(920);
        Enterprize s4 = state1.getEnterpriseDirectory().createAndAddEnterprise("Coventry High School", School);
        s = (School) s4;
        s.setIspendingRate(6500);
        s.setSspendingRate(950);
        s.setHspendingRate(490);
        Enterprize s5 = state1.getEnterpriseDirectory().createAndAddEnterprise("Dominican Convent High School", School);
        s = (School) s5;
        s.setIspendingRate(7900);
        s.setSspendingRate(870);
        s.setHspendingRate(590);
        System.out.println(s1.getOrganizationDirectory().getOrganisationList().size());
        
        Network state2 = system.createAndAddNetwork("Harare");
        e1 = state2.getEmployeeDirectory().createEmployee("chacha");
        state2.getUserAccountDirectory().createUserAccount("chacha", "chacha", e1, new StateAdminRole());
        s1 = state2.getEnterpriseDirectory().createAndAddEnterprise("Alan Wilson High School", School);
        e1 = s1.getEmployeeDirectory().createEmployee("alan");
        s1.getUserAccountDirectory().createUserAccount("alan", "alan", e1, new SchoolAdminRole());
        s1.setAccount(true);
        s = (School) s1;
        s.setIspendingRate(7000);
        s.setSspendingRate(1500);
        s.setHspendingRate(850);
        s2 = state2.getEnterpriseDirectory().createAndAddEnterprise("Bob Marley High School", School);
        s = (School) s2;
        s.setIspendingRate(5000);
        s.setSspendingRate(1200);
        s.setHspendingRate(800);
        s3 = state2.getEnterpriseDirectory().createAndAddEnterprise("Churchill School", School);
        s = (School) s3;
        s.setIspendingRate(6000);
        s.setSspendingRate(1100);
        s.setHspendingRate(920);
        s4 = state2.getEnterpriseDirectory().createAndAddEnterprise("Hellenic Academy", School);
        s = (School) s4;
        s.setIspendingRate(6500);
        s.setSspendingRate(950);
        s.setHspendingRate(490);
        s5 = state2.getEnterpriseDirectory().createAndAddEnterprise("Morgan High School", School);
        s = (School) s5;
        s.setIspendingRate(7900);
        s.setSspendingRate(870);
        s.setHspendingRate(590);
        
        Network state3 = system.createAndAddNetwork("Manicaland");
        e1 = state3.getEmployeeDirectory().createEmployee("idli");
        state3.getUserAccountDirectory().createUserAccount("idli", "idli", e1, new StateAdminRole());
        s1 = state3.getEnterpriseDirectory().createAndAddEnterprise("Chikwakwa High School", School);
        e1 = s1.getEmployeeDirectory().createEmployee("chika");
        s1.getUserAccountDirectory().createUserAccount("chika", "chika", e1, new SchoolAdminRole());
        s1.setAccount(true);
        s = (School) s1;
        s.setIspendingRate(7000);
        s.setSspendingRate(1500);
        s.setHspendingRate(850);
        s2 = state3.getEnterpriseDirectory().createAndAddEnterprise("Gatsi Primary School", School);
        s = (School) s2;
        s.setIspendingRate(5000);
        s.setSspendingRate(1200);
        s.setHspendingRate(800);
        s3 = state3.getEnterpriseDirectory().createAndAddEnterprise("Mutare Junior School", School);
        s = (School) s3;
        s.setIspendingRate(6000);
        s.setSspendingRate(1100);
        s.setHspendingRate(920);
        s4 = state3.getEnterpriseDirectory().createAndAddEnterprise("Baring Junior School", School);
        s4 = state2.getEnterpriseDirectory().createAndAddEnterprise("Hellenic Academy", School);
        s = (School) s4;
        s.setIspendingRate(6500);
        s.setSspendingRate(950);
        s.setHspendingRate(490);
        s5 = state3.getEnterpriseDirectory().createAndAddEnterprise("Hartzell High School", School);
        s5 = state2.getEnterpriseDirectory().createAndAddEnterprise("Morgan High School", School);
        s = (School) s5;
        s.setIspendingRate(7900);
        s.setSspendingRate(870);
        s.setHspendingRate(590);
        
        Network state4 = system.createAndAddNetwork("Mashionland Central");
        e1 = state4.getEmployeeDirectory().createEmployee("chotu");
        state4.getUserAccountDirectory().createUserAccount("chotu", "chotu", e1, new StateAdminRole());
        s1 = state4.getEnterpriseDirectory().createAndAddEnterprise("Chindotwe Primary School", School);
        e1 = s1.getEmployeeDirectory().createEmployee("chin");
        s1.getUserAccountDirectory().createUserAccount("chin", "chin", e1, new SchoolAdminRole());
        s1.setAccount(true);
        s = (School) s1;
        s.setIspendingRate(7000);
        s.setSspendingRate(1500);
        s.setHspendingRate(850);
        s2 = state4.getEnterpriseDirectory().createAndAddEnterprise("Howard High School", School);
        s = (School) s2;
        s.setIspendingRate(5000);
        s.setSspendingRate(1200);
        s.setHspendingRate(800);
        s3 = state4.getEnterpriseDirectory().createAndAddEnterprise("Mutare Junior School", School);
        s = (School) s3;
        s.setIspendingRate(6000);
        s.setSspendingRate(1100);
        s.setHspendingRate(920);
        s4 = state4.getEnterpriseDirectory().createAndAddEnterprise("Lady Enereta High School", School);
        s = (School) s4;
        s.setIspendingRate(6500);
        s.setSspendingRate(950);
        s.setHspendingRate(490);
        s5 = state4.getEnterpriseDirectory().createAndAddEnterprise("Guwa Primary School", School);
        s = (School) s5;
        s.setIspendingRate(7900);
        s.setSspendingRate(870);
        s.setHspendingRate(590);
        
        Network state5 = system.createAndAddNetwork("Mashionland East");
        e1 = state5.getEmployeeDirectory().createEmployee("bhai");
        state5.getUserAccountDirectory().createUserAccount("bhai", "bhai", e1, new StateAdminRole());
        s1 = state5.getEnterpriseDirectory().createAndAddEnterprise("Blackman School", School);
        e1 = s1.getEmployeeDirectory().createEmployee("blackman");
        s1.getUserAccountDirectory().createUserAccount("blackman", "blackman", e1, new SchoolAdminRole());
        s1.setAccount(true);
        s = (School) s1;
        s.setIspendingRate(7000);
        s.setSspendingRate(1500);
        s.setHspendingRate(850);
        s2 = state5.getEnterpriseDirectory().createAndAddEnterprise("Ruwa Primary School", School);
        s = (School) s2;
        s.setIspendingRate(5000);
        s.setSspendingRate(1200);
        s.setHspendingRate(800);
        s3 = state5.getEnterpriseDirectory().createAndAddEnterprise("Windsor Primary School", School);
        s = (School) s3;
        s.setIspendingRate(6000);
        s.setSspendingRate(1100);
        s.setHspendingRate(920);
        s4 = state5.getEnterpriseDirectory().createAndAddEnterprise("Zimre Primary School", School);
        s = (School) s4;
        s.setIspendingRate(6500);
        s.setSspendingRate(950);
        s.setHspendingRate(490);
        s5 = state5.getEnterpriseDirectory().createAndAddEnterprise("Govera Primary and Secondary", School);
        s = (School) s5;
        s.setIspendingRate(7900);
        s.setSspendingRate(870);
        s.setHspendingRate(590);
        
        Network state6 = system.createAndAddNetwork("Mashionland West");
        e1 = state6.getEmployeeDirectory().createEmployee("aniruddh");
        state6.getUserAccountDirectory().createUserAccount("aniruddh", "aniruddh", e1, new StateAdminRole());
        s1 = state6.getEnterpriseDirectory().createAndAddEnterprise("Dalny Mine High School", School);
        s = (School) s1;
        s.setIspendingRate(7000);
        s.setSspendingRate(1500);
        s.setHspendingRate(850);
        s2 = state6.getEnterpriseDirectory().createAndAddEnterprise("Benhura Secondary School", School);
        s = (School) s2;
        s.setIspendingRate(5000);
        s.setSspendingRate(1200);
        s.setHspendingRate(800);
        s3 = state6.getEnterpriseDirectory().createAndAddEnterprise("Waverly High School", School);
        s = (School) s3;
        s.setIspendingRate(6000);
        s.setSspendingRate(1100);
        s.setHspendingRate(920);
        s4 = state6.getEnterpriseDirectory().createAndAddEnterprise("Muchemwa High School", School);
        s = (School) s4;
        s.setIspendingRate(6500);
        s.setSspendingRate(950);
        s.setHspendingRate(490);
        s5 = state6.getEnterpriseDirectory().createAndAddEnterprise("Chisina Secondary School", School);
        s = (School) s5;
        s.setIspendingRate(7900);
        s.setSspendingRate(870);
        s.setHspendingRate(590);
        
        Network state7 = system.createAndAddNetwork("Masvingo");
        e1 = state7.getEmployeeDirectory().createEmployee("tanmay");
        state7.getUserAccountDirectory().createUserAccount("tanmay", "tanmay", e1, new StateAdminRole());
        s1 = state7.getEnterpriseDirectory().createAndAddEnterprise("Jaravaza Primary School", School);
        s = (School) s1;
        s.setIspendingRate(7000);
        s.setSspendingRate(1500);
        s.setHspendingRate(850);
        s2 = state7.getEnterpriseDirectory().createAndAddEnterprise("Mateme High School", School);
        s = (School) s2;
        s.setIspendingRate(5000);
        s.setSspendingRate(1200);
        s.setHspendingRate(800);
        s3 = state7.getEnterpriseDirectory().createAndAddEnterprise("Dogwe Primary School", School);
        s = (School) s3;
        s.setIspendingRate(6000);
        s.setSspendingRate(1100);
        s.setHspendingRate(920);
        s4 = state7.getEnterpriseDirectory().createAndAddEnterprise("Chedutu Primary School ", School);
        s = (School) s4;
        s.setIspendingRate(6500);
        s.setSspendingRate(950);
        s.setHspendingRate(490);
        s5 = state7.getEnterpriseDirectory().createAndAddEnterprise("Rupare Secondary School    ", School);
        s = (School) s5;
        s.setIspendingRate(7900);
        s.setSspendingRate(870);
        s.setHspendingRate(590);
        
        Network state8 = system.createAndAddNetwork("Matabeleland North");
        e1 = state8.getEmployeeDirectory().createEmployee("vivek");
        state8.getUserAccountDirectory().createUserAccount("vivek", "vivek", e1, new StateAdminRole());
        s1 = state8.getEnterpriseDirectory().createAndAddEnterprise("Beula Primary School", School);
        s = (School) s1;
        s.setIspendingRate(7000);
        s.setSspendingRate(1500);
        s.setHspendingRate(850);
        s2 = state8.getEnterpriseDirectory().createAndAddEnterprise("Cyrene Mission", School);
        s = (School) s2;
        s.setIspendingRate(5000);
        s.setSspendingRate(1200);
        s.setHspendingRate(800);
        s3 = state8.getEnterpriseDirectory().createAndAddEnterprise("Homestead Primary School", School);
        s = (School) s3;
        s.setIspendingRate(6000);
        s.setSspendingRate(1100);
        s.setHspendingRate(920);
        s4 = state8.getEnterpriseDirectory().createAndAddEnterprise("Minda High School", School);
        s = (School) s4;
        s.setIspendingRate(6500);
        s.setSspendingRate(950);
        s.setHspendingRate(490);
        s5 = state8.getEnterpriseDirectory().createAndAddEnterprise("Msithi Primary School", School);
        s = (School) s5;
        s.setIspendingRate(7900);
        s.setSspendingRate(870);
        s.setHspendingRate(590);
        
        Network state9 = system.createAndAddNetwork("Matabeleland South");
        e1 = state9.getEmployeeDirectory().createEmployee("akash");
        state9.getUserAccountDirectory().createUserAccount("akash", "akash", e1, new StateAdminRole());
        s1 = state9.getEnterpriseDirectory().createAndAddEnterprise("Ronga Primary School", School);
        s = (School) s1;
        s.setIspendingRate(7000);
        s.setSspendingRate(1500);
        s.setHspendingRate(850);
        s2 = state9.getEnterpriseDirectory().createAndAddEnterprise("Gwenya Primary School", School);
        s = (School) s2;
        s.setIspendingRate(5000);
        s.setSspendingRate(1200);
        s.setHspendingRate(800);
        s3 = state9.getEnterpriseDirectory().createAndAddEnterprise("St Paul's Secondary School", School);
        s = (School) s3;
        s.setIspendingRate(6000);
        s.setSspendingRate(1100);
        s.setHspendingRate(920);
        s4 = state9.getEnterpriseDirectory().createAndAddEnterprise("Nyatsime College", School);
        s = (School) s4;
        s.setIspendingRate(6500);
        s.setSspendingRate(950);
        s.setHspendingRate(490);
        s5 = state9.getEnterpriseDirectory().createAndAddEnterprise("Somapani Primary School", School);
        s = (School) s5;
        s.setIspendingRate(7900);
        s.setSspendingRate(870);
        s.setHspendingRate(590);
        
        Network state10 = system.createAndAddNetwork("Midlands");
        e1 = state10.getEmployeeDirectory().createEmployee("bhaiwillbebhai");
        state10.getUserAccountDirectory().createUserAccount("bhaiwillbebhai", "bhaiwillbebhai", e1, new StateAdminRole());
        s1 = state10.getEnterpriseDirectory().createAndAddEnterprise("Bradley High School", School);
        s = (School) s1;
        s.setIspendingRate(7000);
        s.setSspendingRate(1500);
        s.setHspendingRate(850);
        s2 = state10.getEnterpriseDirectory().createAndAddEnterprise("Sodbury school", School);
        s = (School) s2;
        s.setIspendingRate(5000);
        s.setSspendingRate(1200);
        s.setHspendingRate(800);
        s3 = state10.getEnterpriseDirectory().createAndAddEnterprise("Nyamangara Secondary School", School);
        s = (School) s3;
        s.setIspendingRate(6000);
        s.setSspendingRate(1100);
        s.setHspendingRate(920);
        s4 = state10.getEnterpriseDirectory().createAndAddEnterprise("Moleli High School", School);
        s = (School) s4;
        s.setIspendingRate(6500);
        s.setSspendingRate(950);
        s.setHspendingRate(490);
        s5 = state10.getEnterpriseDirectory().createAndAddEnterprise("Veza Primary School", School);
        s = (School) s5;
        s.setIspendingRate(7900);
        s.setSspendingRate(870);
        s.setHspendingRate(590);
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
