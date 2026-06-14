package lecture21to30.lambdaexpressions;

@FunctionalInterface
interface FInterface{
    void add(int a, int b);
    default void printName(){
        System.out.println("Welcome to functional interface");
    }
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        FInterface fInterface = (a, b)-> System.out.println(a+b);
        fInterface.printName(); 
    }
}
