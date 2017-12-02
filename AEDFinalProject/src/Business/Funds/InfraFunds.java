/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Funds;

/**
 *
 * @author Dell
 */
public class InfraFunds extends Funds {
    private static final int maxLimit = 1000000;

    public InfraFunds(fundsType type) {
        super(Funds.fundsType.InfraFunds);
    }

    public static int getMaxLimit() {
        return maxLimit;
    }
}
