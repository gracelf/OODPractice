package vendingMachineDesign;

/**
 * for testing purpose, skip the code to interact with the bank
 */
public class MockCreditCardPayment extends CreditCardPayment {

    @Override
    public PayResponse interactWithBank(double price, double value) {
        System.out.println("pay by credit card, but skip the interaction with bank");
        return new PayResponse("success", "");
    }

}
