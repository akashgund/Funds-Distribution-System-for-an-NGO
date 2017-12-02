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
public class StationaryFunds extends Funds {
    private static final int maxLimit = 500000;

    public StationaryFunds(fundsType type) {
        super(Funds.fundsType.HealthCareFunds);
    }

    public static int getMaxLimit() {
        return maxLimit;
    }
}
