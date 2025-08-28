package brandNewJavaLearning;

public class WrapperClasses {
    int y;
    public static void main(String[] args) {
        //Wrapper classes are final and immutable
        // So, wrapper class cannot be inherited.
        //or example, if you create an Integer object with a value of 10,
        // you cannot modify it to hold a different value. Instead,
        // a new object is created if you need a different value.

        Integer int1 = 100;
        Integer int2 = int1;
        System.out.println(int1 == int2); //compares the references, not the values
        //true

        Integer int3 = 100;
        System.out.println(int1 == int3); //true

        //In Java, Integer objects within the range of -128 to 127 are cached by the JVM.
        // This means that when you assign Integer int3 = 100;, it refers to the same cached object as int1 and int2 (when their value is also 100).
        // Therefore, int1, int2, and int3 all point to the same object in memory for the value 100.


        Integer int4 = 200;
        Integer int5 = int4;
        System.out.println(int4 == int5); //true

        Integer int6 = 200;
        System.out.println(int5 == int6); //false


        int1 = 150; //a new Integer object is created because wrapper classes are immutable
        System.out.println(int1 == int2); //false

        Integer int7 = 400;
        int x = 500;
        int7 = x;

        System.out.println(int7.intValue()+ " "+ int7.compareTo(100));
        Integer int8 = 900;
        System.out.println(int7.compareTo(int8)); // -1

        Integer int9 = 150;
        Integer int10 = 150;
        System.out.println(int9 == int10); //false
        System.out.println(int9.equals(int10)); //true

        //parseInt()
        //Parsing a decimal string
        int number1 = Integer.parseInt("123");
        System.out.println(number1);

        //Parsing a binary string
        int number2 = Integer.parseInt("1010", 2);
        System.out.println(number2); // 10  (1010- binary to int -> 10)

        // Invalid String- Integer.parseInt("abc")

        // Integer.parseInt - returns primitive
        // Integer.valueOf - returns wrapper class object

        String str = Integer.toString(567);

        int sum = Integer.sum(23, 45);
        System.out.println(sum);

        Integer int11 = 1234;
        String st = int1.toString();
        System.out.println(st);

        Integer int12; //since this variable is not initialized, it cannot be used
        Integer int13 = null;
        System.out.println(int13); //null

        String s1 = Integer.toString(87356);
        // NullPointerException- String s2 = int13.toString();
        String s2 = String.valueOf(int13); // converts null to "null"
        System.out.println(s1 + " "+ s2);
    }

}
