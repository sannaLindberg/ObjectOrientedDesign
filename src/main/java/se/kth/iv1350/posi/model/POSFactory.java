package se.kth.iv1350.posi.model;

//import se.kth.iv1350.posi.integration.ExternalAccountingSystem;
import se.kth.iv1350.posi.integration.ExternalCreator;
//import se.kth.iv1350.posi.integration.ExternalInventorySystem;

public class POSFactory {
    private static final POSFactory instance = new POSFactory();


    /**
     * 
     * private constructor that prevents external instantiation
     * 
     */
    private POSFactory() {}


    /**
     * provides access to the singleton instance
     * 
     * @return instance
     */
    public static POSFactory getInstance() {
        return instance;
    }
    
    /**
     * 
     * 
     * @param balance
     * @return
     */


    public CashRegister createCashRegister (Amount balance) {
        return new CashRegister(balance);
     }


    public CashPayment createCashPayment (Amount paidAmount) {
        return new CashPayment(paidAmount);
    }
     /**
      * 
      *
      * @return
      */

    public Sale createSale() {
        return new Sale();
      }

      /**
       * 
       * 
       * @return 
       */
/*
    public ExternalAccountingSystem createAccountingSystem() {
        return new ExternalAccountingSystem();
       }
 */
    /**
     * 
     * 
     * @return a creation of an instance of an External Inventory system
     */
/*   
    public ExternalInventorySystem createExternalInventorySystem() {
        return new ExternalInventorySystem();
    }
*/
    /**
     * 
     * @return a creation of an instance of an ExternalCreator
     */
    public ExternalCreator createExternalCreator() {
        return new ExternalCreator();
    }
}
