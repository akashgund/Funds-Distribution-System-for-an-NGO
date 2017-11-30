/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Users.UserAccount;
import java.util.Date;

/**
 *
 * @author akash
 */
public abstract class WorkRequestABS {
   
    UserAccount sender;
   UserAccount receiver;
    
   
    
    public WorkRequestABS(){
        
    }

    

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

   
}
    
    