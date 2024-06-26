package vendingMachineDesign;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://javarevisited.blogspot.com/2016/06/design-vending-machine-in-java.html#axzz7iCatYUDn
 * java ood class session 3 Oct 15 2022
 */
public class VendingMachine {
    
    public VendingMachine(){
        this.products = new HashMap<>();
    
    }

    private Map<String, Product> products;

    /**
     * @return the products
     */
    public Map<String, Product> getProducts() {
        return products;
    }

    //method: pay
    public PayResponse pay(PayRequest request) {

        //get product info
        Product prod = products.get(request.getProductId());
        double price = prod.getPrice();
        System.out.println("the price is: " + price);
        //common code for all payment types
        if(prod.getQuantity()==0){
            return new PayResponse("fail", "product not available");
        }
        PaymentAbstract payment = PaymentFactory.returnPayment(request.getPaymentType());
        //todo quantity update after successful payment
        return payment.pay(price, request.getValue());
    }
    
    // no longer needed, this can be too long to maintain
    private PayResponse pay(double price, double value, PaymentTypeEnum type){
                PayResponse payResponse = new PayResponse();
                if (null == type){
                    payResponse = new PayResponse("Success","not supported payment type");
                
                }
                else switch (type) {
            case CASH:
                System.out.println("pay by cash"+price+value);
                break;
            case CREDIT_CARD:
                System.out.println("pay by credit card"+price+value);
                break;
            default:
                payResponse = new PayResponse("Success","not supported payment type");
                break;
        }
                return payResponse;
        
    }
            

    //add new product
    public void add(Product prod) {
         this.products.put(prod.getProductId(), prod);

    }

    //remove product
    public boolean remove(Product prod) {
        boolean successFlag = false;
        //remove
        successFlag = true;
        return successFlag;

    }
}
