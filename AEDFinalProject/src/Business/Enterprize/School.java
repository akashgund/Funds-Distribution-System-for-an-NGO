/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprize;

import Business.Network.*;
import Business.Enterprize.Enterprize;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class School extends Enterprize {

    private Exam exam;
    private static int count = 10010;
    private int authorizationCode;

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }
    
    
    public School(String name) {
        super(name, Enterprize.Enterprisetype.School);
        authorizationCode = ++count;
    }

    public int getAuthorizationCode() {
        return authorizationCode;
    }
    
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
