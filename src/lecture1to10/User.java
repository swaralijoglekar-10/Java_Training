package lecture1to10;

// Inheritance
class Person {

    String userName;
    String email;

    public Person(String name, String email){
        this.userName = name;
        this.email = email;
    }
}

class Customer extends Person{
    int loyaltyPoints;

    public Customer(String userName, String email, int points){
        super(userName, email);
        this.loyaltyPoints = points;
    }

    public void placeOrder(){
        System.out.println(userName+ " placed an order.");
    }
}


class Operation{
    int a=10, b=20;
}

class Sum extends Operation{
    int a=100, b = 200;

    public Sum(){
        this.a = a;
        this.b = b;
    }

    public void m1(int a, int b){
        System.out.println(a+b); // values passed in the arguments
        System.out.println(this.a+this.b); // values of instance variables
        System.out.println(super.a+ super.b); // values of instance variables in immediate parent class Operation
    }

    public static void main(String[] args) {
        new Sum().m1(1000, 2000);  //anonymous object
    }
}
