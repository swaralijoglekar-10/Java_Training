package brandNewJavaLearning;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        // All prime numbers between 1 and 100
        int number;
        int j;

        for(int i=1; i<=100; i++){
            if(i==1)
                continue;
            else if(i==2){
                System.out.println(i);
                continue;
            }

            double limit = Math.sqrt(i);
            number = i;
            j = 2;
            boolean isPrime = true;
            while(number % j != 0 && j<=limit){
                j++;

                if(number % j ==0){
                    isPrime = false;
                    break;
                }
            }

            if(number % j !=0 && isPrime == true)  // if number%j != 0 is false in the while loop in the beginning itself, we check it again
                System.out.println(number);
        }

    }
}

class doWhileLoop{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char ch;

        do {
            System.out.println("Press y to enter a number and press n to exit");
            ch = sc.next().charAt(0);
            if(ch == 'n')
                break;

            int num = sc.nextInt();

            //perfect square
            double squareRoot = Math.sqrt(num);
            int root = (int) squareRoot;

            if((squareRoot - root == 0) && num >50) // perfect square and greater than 50
                System.out.println("Number is a perfect square and is greater than 50");
            else
                System.out.println("Number is neither a perfect square nor greater than 50");
        } while (ch == 'y');


    }

}


