package lecture1to10;

public class Constructors {

    String name;
    int age;

    Constructors(){ //default constructor
        this.name ="Swarali";
        this.age = 23;
    }

    void displayInfo(){
        System.out.println("name = "+ name+ " age = "+age);
    }

    public static void main(String[] args) {
        Constructors constructors = new Constructors(); //default constructor
        constructors.displayInfo();
    }
}

class BankAccount{
    String accountHolder;
    long accountNumber;
    double balance;

    //Constructor overloading-
    public BankAccount(String accountHolder, long accountNumber) { //parameterized constructor
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public BankAccount(String accountHolder, long accountNumber, double balance){
        this(accountHolder, accountNumber);
        this.balance = 1000;
    }

    BankAccount(BankAccount bankAccount){  // copy constructor
        this.accountHolder = bankAccount.accountHolder;
        this.accountNumber = bankAccount.accountNumber;
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("SWARALI JOGLEKAR", 967453210);
        BankAccount bankAccount2 = new BankAccount(bankAccount);

       // using fully qualified name
        lecture1to10.ControlAndFlowStatements controlAndFlowStatements = new lecture1to10.ControlAndFlowStatements();
        controlAndFlowStatements.display();
    }
}

class PrivateConstructor{  // this class cannot be inherited

    int rollNumber;
    String name;

    private PrivateConstructor(){  // private constructor
        rollNumber = 121;
        name = "SWARALI";
    }

    public static void main(String[] args) {
        PrivateConstructor privateConstructor1 = new PrivateConstructor();
        PrivateConstructor privateConstructor2 = new PrivateConstructor();
    }
}

// ERROR- There is no default constructor available in 'Lecture1to10.PrivateConstructor'
//class PublicCons extends PrivateConstructor{
//
//}

