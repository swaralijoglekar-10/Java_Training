package lecture11to20.exceptionHandling;

public class CustomExceptionDemo {
    public static void main(String[] args) {
        BankAccountOperations bankAccountOperations = new BankAccountOperations();
        try {
            bankAccountOperations.withdraw(15000);
        }
        catch(InsufficientFundsException e){
            e.printStackTrace();
        }
    }
}

class BankAccountOperations{
    int balance=1000;
    void withdraw(int amount) throws InsufficientFundsException{
        if(amount>balance)
            throw new InsufficientFundsException("Not enough balance");
        //unhandled exception
        else{
            balance-=amount;
            System.out.println("Amount is withdrawn successfully");
        }
    }
}

class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message){
        super(message);
    }
}
