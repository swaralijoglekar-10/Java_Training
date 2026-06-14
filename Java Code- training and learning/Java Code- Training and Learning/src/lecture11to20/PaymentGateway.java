package lecture11to20;

import java.util.ArrayList;
import java.util.List;

// Method overloading
public class PaymentGateway {

    public void processPayment(String cardNumber, double amount, int discount){
        amount = amount - (amount*discount/100);
        System.out.println("Card number "+ cardNumber+" has to pay the amount Rs. "+ amount);

    }

    public void processPayment(String cardNumber, double amount){
        System.out.println();
    }

}

// Method overriding

class Employee{
    double baseSalary;
    String name;

    public Employee(double baseSalary, String name) {
        this.baseSalary = baseSalary;
        this.name = name;
    }

    public double calculateSalary(){
        return baseSalary;
    }
}

class PartTimeEmploye extends Employee{
        int hoursWorked;
        int hourlyRate;
    public PartTimeEmploye(double baseSalary, String name, int hours, int hourlyRate){
        super(0, name);
        this.hoursWorked = hours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
       return hoursWorked*hourlyRate;
    }

}

// Covariant return type example

class Car{
    Car get(){
        return this;
    }

    public void display(){
        System.out.println("Hello Car!");
    }
}

class Audi extends Car{

    public void display(){
        System.out.println("Hello Audi!");
    }
    Audi get(){
        return this;
    }

    public static void main(String[] args) {
        Car car= new Audi();
        car.display();
    }
}

abstract class Shape{
    protected String shapeName;
    protected int shapeArea;

    public abstract void drawShape();
}

class Circle extends Shape{
    public void drawShape(){
        System.out.println("Circle drawn");
    }
}

// -----------------------------------
