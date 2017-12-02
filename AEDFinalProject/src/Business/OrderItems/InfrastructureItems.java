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
public class InfrastructureItems extends OrderItem {

    private final int unitprice = 100;
    public InfrastructureItems()
    {
        this.setCost(unitprice);
    }
}
