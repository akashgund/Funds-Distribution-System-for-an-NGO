/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author akash
 */
public class EmailQueue {
    ArrayList<Email> emailQueue;

    public EmailQueue() {
        emailQueue = new ArrayList<Email>();
    }

    public ArrayList<Email> getEmailQueue() {
        return emailQueue;
    }

    public void setEmailQueue(ArrayList<Email> emailQueue) {
        this.emailQueue = emailQueue;
    }
    
    
    
    
}
