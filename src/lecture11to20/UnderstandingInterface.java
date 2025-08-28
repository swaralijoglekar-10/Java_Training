package lecture11to20;

interface PaymentGatewayNew{
    void initiatePayment(double amount);
    boolean verifyPayment(String transactionId);
}

class CreditCardPayment implements PaymentGatewayNew{

    @Override
    public void initiatePayment(double amount) {
        System.out.println("Credit card payment initiated of amount "+ amount);
    }

    @Override
    public boolean verifyPayment(String transactionId) {
        System.out.println("Verified credit card payment with transaction id "+transactionId);
        return true;
    }
}

class UpiPayment implements PaymentGatewayNew{

    @Override
    public void initiatePayment(double amount) {
        System.out.println("UPI payment initiated of amount "+ amount);
    }

    @Override
    public boolean verifyPayment(String transactionId) {
        System.out.println("Verified UPI payment with transaction id "+transactionId);
        return true;
    }
}

class PaymentService{
    private PaymentGatewayNew paymentGatewayNew;

    public PaymentService(PaymentGatewayNew paymentGatewayNew) {
        this.paymentGatewayNew = paymentGatewayNew;
    }

    public void processPayment(double amount){
        paymentGatewayNew.initiatePayment(amount);
        boolean paymentSuccess = paymentGatewayNew.verifyPayment("Tx12345abcd");
        if(paymentSuccess){
            System.out.println("Payment is successful");
        }
        else{
            System.out.println("Payment failed");
        }
    }
}

class PaymentSystem{
    public static void main(String[] args) {
        PaymentService service1 = new PaymentService(new CreditCardPayment());
        service1.processPayment(10000);

        PaymentService service2 = new PaymentService(new UpiPayment());
        service2.processPayment(500);
    }

}