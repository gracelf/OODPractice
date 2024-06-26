

package vendingMachineDesign;

/**
 *
 */
public class CashPayment extends PaymentAbstract {
    CashPayment(){
        super(PaymentTypeEnum.CASH);
    }
    
    @Override
   public  PayResponse pay(double price, double value){
       System.out.println("pay by cash");
       return new PayResponse("success", "");
   
   }

}
