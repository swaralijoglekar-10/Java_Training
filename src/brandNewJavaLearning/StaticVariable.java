package brandNewJavaLearning;

public class StaticVariable {
    static Integer in1 = 10;
    static int in2; // stored in 'method area' (part of the JVM memory) and are shared among all instances of the class

    int in3; // stored in heap memory

    public static void main(String[] args) {
        // Error- static int in3;
        in2 = 30;
        //Error-  in3 = 30;   //Non-static field 'in3' cannot be referenced from a static context

        int x = 10; // stack memory
    }

    void add(){
        // Error- static int sum;
        in3 = 40;
    }

}
