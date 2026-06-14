package brandNewJavaLearning.multithreading;

import java.util.Scanner;

class Processor extends Thread {
    // volatile ensures that the change made by the Main thread 
    // is immediately visible to this Processor thread.
    private volatile boolean running = true;

//    What would happen without volatile?
//     If the Processor thread has its own local cache where it has cached the value as true, 
//     then it will never check the value updated by Main thread in the RAM
//    
//     So, by using volatile a variable's value may be changed by multiple threads simultaneously
//    
    public void run() {
        // This block is executed by the "Thread-0" (proc1)
        while (running) {
            System.out.println("Hello");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public void shutdown() {
        // Although this is in the Processor class, 
        // it is called by the Main thread in this program.
        running = false;
    }
}

public class VolatileKeyword {

    public static void main(String[] args) {
        // Executed by the Main Thread
        Processor proc1 = new Processor();
        proc1.start(); // Spawns the second thread

        System.out.println("Press return to stop ...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); // Main thread pauses here

        // Main thread resumes after Enter is pressed and calls this:
        proc1.shutdown();
    }
}