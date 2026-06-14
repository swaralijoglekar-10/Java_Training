package lecture11to20;

public class GarbageCollector {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total memory: "+ runtime.totalMemory());
        System.out.println("Free memory: "+ runtime.freeMemory());

        for(int i=0; i<100; i++){
            new Object();
        }

        System.out.println("Before gc() Free memory: "+ runtime.freeMemory());

        System.gc();

        System.out.println("After gc() Free memory: "+ runtime.freeMemory());
    }
    
}
