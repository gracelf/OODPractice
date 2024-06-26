package vendingMachineDesign;

/**
 *
 */
public class TestVendingMachine {

    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        vm.getProducts().put("1A", new Product("1A", "Water", 1.20, 5));
        vm.add(new Product("1B", "Chips", 2.50, 6));
        vm.add(new Product("1C", "Gums", 3.50, 5));
        
        //cash payment
        PayRequest request = new PayRequest();
        request.setPaymentType(PaymentTypeEnum.CASH);
        request.setProductId("1A");
        request.setValue(7.00);
        
        PayResponse response = vm.pay(request);
        System.out.println("response status: " + response.getStatus() + ", msg: " + response.getErrorMsg()); 
        
                //cash payment
        PayRequest request2 = new PayRequest();
        request.setPaymentType(PaymentTypeEnum.MOCK_CREDIT_CARD);
        request.setProductId("1A");
        request.setValue(7.00);
        
        PayResponse response2 = vm.pay(request2);
        System.out.println("response status: " + response2.getStatus() + ", msg: " + response.getErrorMsg()); 
    }

}
