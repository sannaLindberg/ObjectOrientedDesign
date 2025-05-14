package se.kth.iv1350.posi.view;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import se.kth.iv1350.posi.model.Amount;
import se.kth.iv1350.posi.model.TotalRevenueObserver;

public class TotalRevenueFileOutput implements TotalRevenueObserver {
    private static final String TOTAL_REVENUE_FILE = "TotalRevenueFile.txt";

    private PrintWriter printerWriter;
    private Amount totalRevenue = new Amount(0.0);

    public TotalRevenueFileOutput() throws IOException {
            printerWriter = new PrintWriter(TOTAL_REVENUE_FILE);
            printerWriter.println(TOTAL_REVENUE_FILE);
        
           // System.out.println("");
           // System.exit(1);
        
    } 
   
    /**
     * 
     * @param addedSale 
     */

    @Override
    public void printTotalRevenue(Amount addedSale) {
        totalRevenue = (totalRevenue.add(addedSale));

    }

    public void printFinalTotal() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(TOTAL_REVENUE_FILE, false))) {
        writer.println("Final total Revenue: " + totalRevenue + " SEK");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

}
