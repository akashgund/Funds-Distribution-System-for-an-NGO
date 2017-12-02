/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OrderItems;

/**
 *
 * @author Dell
 */
public class StationaryItems extends OrderItem {
    public final int unitprice = 50;
    public StationaryItems()
    {
        this.setCost(unitprice);
    }
}
