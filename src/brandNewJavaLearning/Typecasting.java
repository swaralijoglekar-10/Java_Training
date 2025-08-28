package brandNewJavaLearning;

public class Typecasting {
    public static void main(String[] args) {

        //Widening
        System.out.println("1. Widening");
        short sh1 = 678;
        double do1 = sh1;

        //Narrowing
        System.out.println("2. Narrowing");
        //long to float
        long lo1 = 3456L;
        float fl1 = (float) lo1;

        // long to char
        long lo2 = 7l;
        char ch1 = (char) lo2;

        //Auto boxing
        System.out.println("3. Auto boxing");
        byte b1 = 34;
        Byte b2 = b1;

        // Unboxing
        System.out.println("4. Unboxing");
        Double do2 = 234D;
        double do3 = do2;

        //-----------------------------

        //Upcasting
        System.out.println("5. Upcasting");
        Payment payment = new CreditCardPayment();
        payment.processPayment();
        // cannot call credit card specific method

        //Down casting
        System.out.println("6. Down casting");
        if(payment instanceof CreditCardPayment){
            CreditCardPayment creditCardPayment = (CreditCardPayment) payment;
            creditCardPayment.creditCardSpecificMethod();
        }

        int i1 = 23;
        Byte b3 = (byte) i1;

    }
}

    class Payment {
        void processPayment() {
        System.out.println("Processing payment... ");
        }
    }

    class CreditCardPayment extends Payment {
        void processPayment() {
        System.out.println("Processing credit card payment... ");
        }

        void creditCardSpecificMethod() {
        System.out.println("Inside credit card specific method");
        }
    }
