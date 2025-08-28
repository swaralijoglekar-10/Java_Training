package TrialPackage;

import lecture1to10.StaticTest;

public class TrialClass {

    public static void main(String[] args) {
        StaticTest st1 = new StaticTest();
        // WRONG- st1.print();  print() is default method in the package Lecture1to10. SO, even after importing the package, it cannot be accessed
    }
}
