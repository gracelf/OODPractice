package vendingMachineDesign;

/**
 *
 */
public class CreditCardPayment extends PaymentAbstract {

    CreditCardPayment() {
        super(PaymentTypeEnum.CREDIT_CARD);
    }

    public PayResponse pay(double price, double value) {
        System.out.println("pay by credit card");
        return interactWithBank( price,  value);
    }
    
    public PayResponse interactWithBank(double price, double value) {
        System.out.println("pay by credit card, interaction with bank");
        return new PayResponse("success", "");
    }

}
