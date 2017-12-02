/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OrderItems;

import Business.Users.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class Order {
    private ArrayList<OrderItem> itemList;
    private UserAccount ua;
    private static int orderid =0;
    public Order()
    {
      itemList = new ArrayList<OrderItem>();
      orderid++;
    }

    public static int getOrderid() {
        return orderid;
    }

    
    public UserAccount getUa() {
        return ua;
    }

    public void setUa(UserAccount ua) {
        this.ua = ua;
    }
    
    

    public ArrayList<OrderItem> getItemList() {
        return itemList;
    }

    
    
    
    public OrderItem addOrderItem(int quantity , int cost)
    {
        OrderItem o= new OrderItem();
        o.setQuantity(quantity);
        o.setCost(cost);
        return o;
    }
}
