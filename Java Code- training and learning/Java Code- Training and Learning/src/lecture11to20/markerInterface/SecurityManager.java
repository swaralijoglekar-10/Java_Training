package lecture11to20.markerInterface;

public class SecurityManager {

    public static void validateTransaction(Object obj){
        if(obj instanceof SecuredTransaction){
            System.out.println(obj.getClass().getName()+ " way of transaction is validated");
        }
    }

    public static void main(String[] args) {
        OnlinePayment onlinePayment = new OnlinePayment();

        validateTransaction(onlinePayment);
    }
}
