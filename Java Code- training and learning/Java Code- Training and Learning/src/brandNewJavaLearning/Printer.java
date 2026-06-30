package brandNewJavaLearning.generics;

public class Printer <T>{
    T thingToPrint; 
    
    public Printer(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }
    
    public void print(){
        System.out.println(thingToPrint);
    }
}

class Test{
    public static void main(String[] args) {
        Printer<Integer> integerPrinter = new Printer<>(30);
        integerPrinter.print();
        
        Printer<Float> floatPrinter = new Printer<>(40.34f);
        floatPrinter.print();
        
        Printer<String> stringPrinter = new Printer<>("Swarali"); 
        stringPrinter.print();
        
        // Why to use angle brackets- compile-time type safety
        
        //ERROR
        //Printer<Integer> integerPrinter1 = new Printer<>("jfheknf");
        
        //If I write- 
        // Printer<Object> objectPrinter = new Printer<>("ekrj");
       //ERROR- String print = objectPrinter.thingToPrint;
        //Typecasting is required:- String print = (String) objectPrinter.thingToPrint;
    }
}
