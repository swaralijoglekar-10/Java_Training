package lecture1to10;

import java.util.ArrayList;
import java.util.Scanner;

public class ControlAndFlowStatements {

    void display(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {

        //Control statements- if, else, switch
        switch(1){
            case 1:
                System.out.println("Accenture");
                break;
            case 2:
                System.out.println("Schaeffler");
                break;
        }

        // Flow statements:- loops: for, while, do-while, for-each

        // do-while, for-each
        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        do{
            balance-=100;
            System.out.println("You donated Rs. 100. Current balance: "+balance);
            System.out.println("Type YES to contribute to the next donation drive");
        }while(sc.next().equalsIgnoreCase("YES"));

        // for-each loop
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(34);
        for(int a: intList){
            System.out.println(a);
        }
    }
}
