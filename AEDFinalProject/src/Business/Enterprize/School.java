/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprize;

import Business.Funds.Funds;
import Business.Funds.HealthFunds;
import Business.Funds.InfraFunds;
import Business.Funds.StationaryFunds;
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
    private double infraFunds=900000,infraScore;
    private double healthFunds=138000,healthScore;
    private double stationaryFunds=499760,stationaryScore;
    private Funds funds;
    private double overallScore;
    private double manpowerScore =0.80;
    private double ispendingRate;
    private double sspendingRate;
    private double hspendingRate;

    public double getIspendingRate() {
        return ispendingRate;
    }

    public void setIspendingRate(double ispendingRate) {
        this.ispendingRate = ispendingRate;
    }

    public double getSspendingRate() {
        return sspendingRate;
    }

    public void setSspendingRate(double sspendingRate) {
        this.sspendingRate = sspendingRate;
    }

    public double getHspendingRate() {
        return hspendingRate;
    }

    public void setHspendingRate(double hspendingRate) {
        this.hspendingRate = hspendingRate;
    }
    
    public void setInfraFunds(double infraFunds) {
        this.infraFunds = infraFunds;
        setScores();
    }

    public void setHealthFunds(double healthFunds) {
        this.healthFunds = healthFunds;
        setScores();
    }

    public void setStationaryFunds(double stationaryFunds) {
        this.stationaryFunds = stationaryFunds;
        setScores();
    }
    
    
    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public Funds getFunds() {
        return funds;
    }

    public void setFunds(Funds funds) {
        this.funds = funds;
        if(funds instanceof InfraFunds)
        {
            infraFunds+= funds.getFundAmount();     
        }
        else if(funds instanceof StationaryFunds)
        {
            stationaryFunds+= funds.getFundAmount();          
        }
        else if(funds instanceof HealthFunds)
        {
            healthFunds+= funds.getFundAmount();           
        }
        
        //overallScore
    }
    
    public void setScores()
    {
         infraScore = (infraFunds) / (InfraFunds.getMaxLimit());
         stationaryScore = (stationaryFunds) / (StationaryFunds.getMaxLimit());
         healthScore = (healthFunds) / (HealthFunds.getMaxLimit());
         //manpowerScore = manpowerScore / WRITE SOME CODE
         overallScore = infraScore*40 + stationaryScore*25 + manpowerScore*20 + healthScore*15;
    }

    public double getOverallScore() {
        return overallScore;
    }

    public double getManpowerScore() {
        return manpowerScore;
    }
    

    public double getInfraScore() {
        return infraScore;
    }

    public double getHealthScore() {
        return healthScore;
    }

    public double getStationaryScore() {
        return stationaryScore;
    }
    
    

    public double getInfraFunds() {
        return infraFunds;
    }

    public double getHealthFunds() {
        return healthFunds;
    }

    public double getStationaryFunds() {
        return stationaryFunds;
    }
    
    
    
    
    public School(String name) {
        super(name, Enterprize.Enterprisetype.School);
        principal = SchoolPrincipal.getInstance();
        treasury = SchoolTreasury.getInstance();
        organisationDirectory = this.getOrganizationDirectory();
        organisationDirectory.getOrganisationList().add(principal);
        organisationDirectory.getOrganisationList().add(treasury);
        setScores();
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

    public OrganizationDirectory getOrganisationDirectory() {
        return organisationDirectory;
    }
    

    
    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
