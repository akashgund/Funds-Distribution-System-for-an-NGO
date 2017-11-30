/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.Date;

/**
 *
 * @author akash
 */
public class Email extends WorkRequestABS{
    String emailContent;
    private Date requestDate;
    
    
    
    public Email()
    {
        requestDate= new Date();
    }

    public String getEmailContent() {
        return emailContent;
    }

    public void setEmailContent(String emailContent) {
        this.emailContent = emailContent;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }
    
    @Override
    public String toString()
    {
        return sender;
    }
}
