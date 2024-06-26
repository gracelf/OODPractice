package vendingMachineDesign;

/**
 *
 */
public class PaymentFactory {

    public static PaymentAbstract returnPayment(PaymentTypeEnum type) {

        if (null == type) {
            throw new IllegalArgumentException("payment type can't be null");
        } else {
            switch (type) {
                case CASH:
                    System.out.println("cash payment to be created");
                    return new CashPayment();
                case CREDIT_CARD:
                    System.out.println("credit card payment to be created");
                    return new CreditCardPayment();
                case MOCK_CREDIT_CARD:
                    System.out.println("mock credit card payment to be created");
                    return new MockCreditCardPayment();
                default:
                    throw new IllegalArgumentException("payment type:" + type.getDescription() + "not supported");
            }
        }
    }

}
