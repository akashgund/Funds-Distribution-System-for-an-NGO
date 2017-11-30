/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprize;

import Business.Network.*;
import Business.Enterprize.Enterprize;
import Business.Organization.OrganizationDirectory;
import Business.Organization.SchoolPrincipal;
import Business.Organization.SchoolTreasury;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class School extends Enterprize {

    private Exam exam;
    private SchoolPrincipal principal; 
    private SchoolTreasury treasury;
    private OrganizationDirectory organisationDirectory;

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }
    
    
    public School(String name) {
        super(name, Enterprize.Enterprisetype.School);
        principal = SchoolPrincipal.getInstance();
        treasury = SchoolTreasury.getInstance();
        organisationDirectory = this.getOrganizationDirectory();
        organisationDirectory.getOrganisationList().add(principal);
        organisationDirectory.getOrganisationList().add(treasury);
    }

    public SchoolPrincipal getPrincipal() {
        return principal;
    }

    public SchoolTreasury getTreasury() {
        return treasury;
    }

    public void setOrganisationDirectory(OrganizationDirectory organisationDirectory) {
        this.organisationDirectory = organisationDirectory;
    }
    

    
    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
