package lecture11to20.exceptionHandling;

import java.util.Scanner;

public class ExceptionTest3 {
    static void validate(int age){
        if(age < 18)
            throw new ArithmeticException("Not eligible to drive");
        else
            System.out.println("You can drive");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        sc.close();
        validate(age);
    }
}
