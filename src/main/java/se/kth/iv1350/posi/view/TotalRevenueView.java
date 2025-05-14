package se.kth.iv1350.posi.view;

import se.kth.iv1350.posi.model.Amount;
import se.kth.iv1350.posi.model.TotalRevenueObserver;

public class TotalRevenueView implements TotalRevenueObserver {
    private Amount totalRevenue = new Amount(0.0); 
    public TotalRevenueView() {
    }
        /**
         * 
         * @param saleAmount
         * @prints the updated total revenue of each iteration of a program.
         */
    
    @Override
    public void printTotalRevenue(Amount saleAmount) {
        totalRevenue = (totalRevenue.add(saleAmount));
    }

}
