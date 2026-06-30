package brandNewJavaLearning.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethod {
    public static void main(String[] args) {
        shout("Hey", "Swarali");
        shout(10000, "Dollars");
        
        List<Integer> intList = new ArrayList();
        intList.add(3); 
        intList.add(9); 
        printList(intList);
        
        List<Cow> cowList = new ArrayList<>(); 
        cowList.add(new Cow("Mata", 30)); 
        cowList.add(new Cow("Angel", 28)); 
        printList(cowList);  
        
        List<Deer> deerList = new ArrayList<>(); 
        deerList.add(new Deer("Heeran", 39)); 
        printAnimalList(deerList);        
    }
    
    private static <T, V> void shout(T thingToShout, V otherThingToShout){
        System.out.println(thingToShout+" !!!");
        System.out.println(otherThingToShout+" !!!");
    }

    // If the method has a parameter called List<Object>, we cannot pass List<Integer> to it. 
    // Because List<Integer> is not a subclass of List<Object> 
    // Although Integer is a subclass of Object
    private static void printList(List<?> myList){
        System.out.println(myList);
    }
    
    private static void printAnimalList(List<? extends Animal> myAnimals){
        System.out.println(myAnimals);
    }
}



