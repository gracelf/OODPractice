

package vendingMachineDesign;

/**
 *
 */
public abstract class PaymentAbstract {
    private PaymentTypeEnum paymenType;
    
    public PaymentAbstract(){
    }
    
    public PaymentAbstract(PaymentTypeEnum paymentType){
        this.paymenType = paymentType;      
    }
  
    abstract PayResponse pay(double price, double value);

    /**
     * @return the paymenType
     */
    public PaymentTypeEnum getPaymenType() {
        return paymenType;
    }

    /**
     * @param paymenType the paymenType to set
     */
    public void setPaymenType(PaymentTypeEnum paymenType) {
        this.paymenType = paymenType;
    }

}
