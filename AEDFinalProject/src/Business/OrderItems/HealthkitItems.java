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
public class HealthkitItems extends OrderItem {

    public final int unitprice = 20;

    public HealthkitItems() {
        this.setCost(unitprice);
    }
}
