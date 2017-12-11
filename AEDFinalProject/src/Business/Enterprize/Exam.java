/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprize;

import Business.Ecosystem.Ecosystem;
import Business.Network.Network;

/**
 *
 * @author Dell
 */
public class Exam {
    private double average_marks;
    private String year_conducted;
    
    
    public Exam()
    {
        for(Network n : Ecosystem.getInstance().getNetworkList())
        {
            for(Enterprize e : n.getEnterpriseDirectory().getEnterprizeList())
            {
                if(e instanceof School && e.isAccount())
                {
                    ((School) e).setExam(this);
                }
            }
        }
    }

    public double getAverage_marks() {
        return average_marks;
    }

    public void setAverage_marks(double average_marks) {
        this.average_marks = average_marks;
    }

    public String getYear_conducted() {
        return year_conducted;
    }

    public void setYear_conducted(String year_conducted) {
        this.year_conducted = year_conducted;
    }
    
    
}
