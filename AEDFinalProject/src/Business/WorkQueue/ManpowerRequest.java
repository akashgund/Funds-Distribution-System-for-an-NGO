/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author akash
 */
public class ManpowerRequest extends WorkRequestABS {
    
    private int techerRequested;
    private int teacherGranted;
    private String status;

    public int getTecherRequested() {
        return techerRequested;
    }

    public void setTecherRequested(int techerRequested) {
        this.techerRequested = techerRequested;
    }

    public int getTeacherGranted() {
        return teacherGranted;
    }

    public void setTeacherGranted(int teacherGranted) {
        this.teacherGranted = teacherGranted;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
