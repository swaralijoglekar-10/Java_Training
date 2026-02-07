package brandNewJavaLearning;

// <T> is generic type parameter 

import java.util.HashMap;
import java.util.Map;

class Pair<T1, T2> {
    T1 value1; 
    T2 value2;
    
    public Pair(T1 value1, T2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    
    public T1 getFirst(){
        return value1;
    }
    
    public T2 getSecond(){
        return value2;
    }
    
    public void printTypesAndValues(){
        System.out.println(value1.getClass().getName()+" : "+value1);
        System.out.println(value2.getClass().getName()+" : "+value2);
    }
    
}

class Stats<T extends Number> {
    T[] nums;
    
    //constructor
    public Stats(T[] nums){
        this.nums = nums;
    }
    
    public void printAverage(){
        double average = 0.0;
        for(T t: nums){
            average+=t.doubleValue();
        }
        average/=(this.nums.length);
        System.out.println("Average of given numbers: "+average);
    }

    public static void main(String[] args) {
        Integer[] integers = {10, 20, 30, 40, 50}; 
        Stats<Integer> stats = new Stats<Integer>(integers);
        stats.printAverage();
    }
}


class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<Integer, String>(10, "Apples");
        pair1.printTypesAndValues();

        Pair<String, Double> pair2 = new Pair<String, Double>("Swarali", 9.65);
        pair2.printTypesAndValues();
    }
}

class GenericMethod {
    public static <T> void print(T[] array){
        for(T i: array){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    
    public static void processNumberClass(Class<? extends Number> numberType){
        //System.out.println(number.getClass().getName());
        System.out.println(numberType.getName());
    }

    public static void main(String[] args) {
        String[] array = {"Swarali", "Joglekar"};
        print(array);
        
        Integer[] array2 = {3, 4, 10};
        print(array2);
        
        processNumberClass(Integer.class); // Integer extends Number
    }
}

class UserService{
    
}

class ProductService{
    
}

class InitializationRegistry{
    private static final Map<Class<?>, Boolean> initializationFlags = new HashMap<>();
    
    public void setInitializationFlags(Class<?> serviceClass, boolean isInitialized){
        initializationFlags.put(serviceClass, isInitialized);
    }

    public static void main(String[] args) {
        InitializationRegistry initializationRegistry = new InitializationRegistry();
        initializationRegistry.setInitializationFlags(UserService.class, true);
        initializationRegistry.setInitializationFlags(ProductService.class, false);
    }
}

