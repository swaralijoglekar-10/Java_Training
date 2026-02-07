package brandNewJavaLearning.multithreading;

import java.util.Scanner;

// Way 1
public class ThreadBasics{
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for(int i=0; i<10; i++){
                            System.out.println(i);
                        }
                    }
                }
        );
        
        Thread.sleep(3000);
        t1.run();
    }
}

// Way 2
class Test implements Runnable{

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Test());
        t1.start();
    }
}

// Synchronized
class App {
    private int count = 0; 
    
    public synchronized void increment(){
        count++;
    }
    
    public void doWork(){
        Thread t1 = new Thread(
                ()->{
                    for(int i=1; i<=9999; i++){
                        increment();
                    }
                    System.out.println(count);
                }
        );
        
        Thread t2 = new Thread(
                ()->{
                    for(int i=1; i<=9999; i++){
                        increment();
                    }
                    System.out.println(count);
                }
        );
        
        t1.start();
        t2.start();
    }

    public static void main(String[] args) {
        App app = new App();
        app.doWork();
        Scanner sc = new Scanner(System.in);
        sc.nextLine();// I want to pause the main thread
        
        // If I won't stop the main thread, this print statement would be executed
        // and 0 value of count would be printed before the threads have even started their first increment
        System.out.println(app.count);
    }
    
}


