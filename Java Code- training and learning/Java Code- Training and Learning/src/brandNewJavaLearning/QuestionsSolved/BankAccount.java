package brandNewJavaLearning.QuestionsSolved;

import java.util.ArrayList;
import java.util.List;

class Bank {
    List<Account> accounts= new ArrayList<>();
    String bankName;

    public Bank(){

    }
    public Bank(List<Account> accounts, String name){
        this.accounts = accounts;
        this.bankName = name;
    }

    public void removeAccount(Account accObject){
        accounts.remove(accObject);
    }

    public void addAccount(Account accObject){
        accounts.add(accObject);
    }

    public void setName(String name){
        this.bankName= name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public String getBankName() {
        return bankName;
    }

    public static void main(String[] args) {

        Bank bank = new Bank();
        Account acc1 = new Account(1001, 10000000);
        Account acc2 = new Account(1002, 20000000);
        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.setName("HDFC");

        System.out.println("Bank: "+bank.getBankName());
        for(Account account: bank.getAccounts()){
            System.out.println("Account balance: "+account.getBalance());
        }
    }

}

class Account {

    long accountNumber;

    double balance;

    public Account(long accNum, double accBalance){
        this.accountNumber = accNum;
        this.balance = accBalance;
    }

     void deposit(double moneyToDeposit){
         if(moneyToDeposit > 0)
         this.balance = this.balance + moneyToDeposit;
     }

     void withDraw(double moneyToWithDraw){
         if(moneyToWithDraw < this.balance)
         this.balance = this.balance - moneyToWithDraw;
     }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

}
