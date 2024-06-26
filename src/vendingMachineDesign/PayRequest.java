

package vendingMachineDesign;

/**
 *
 */
public class PayRequest {
    private String productId;
    private  double value;
    private PaymentTypeEnum paymentType;

    /**
     * @return the productId
     */
    public String getProductId() {
        return productId;
    }

    /**
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * @return the value
     */
    public double getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * @return the paymentType
     */
    public PaymentTypeEnum getPaymentType() {
        return paymentType;
    }

    /**
     * @param paymentType the paymentType to set
     */
    public void setPaymentType(PaymentTypeEnum paymentType) {
        this.paymentType = paymentType;
    }

}
