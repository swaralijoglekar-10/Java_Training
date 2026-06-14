package brandNewJavaLearning.multithreading;

import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.Semaphore;

public class WeightRoom{
    
    private final Semaphore slotCounter = new Semaphore(2);
    
    private final String filePath = "application_log.txt";
    
    public void writeLog(String message){
        try{
            slotCounter.acquire();

            System.out.println(Thread.currentThread().getName() + " is writing to the file...");
            
            try(FileWriter writer = new FileWriter(filePath, true)) {
                writer.write(Thread.currentThread().getName() + ": "+ message + "\n");
                Thread.sleep(1500);
            } catch (IOException e) {
                System.out.println("File error");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println(Thread.currentThread().getName()+" is done and leaving");
            slotCounter.release();
        }
    }
    
}