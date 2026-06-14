package lecture21to30.threads;

public class ThreadSync extends Thread{
    public void run(){
        System.out.println("Not synced"); // this statement can be accessed by multiple threads simultaneously

        synchronized (ThreadSync.class){ // only this block will be synced
            for(int i=1; i<=10; i++){
                System.out.println(i);
            }
        }

        //synchronized block ensures that only one thread at a time can execute the block synchronized on ThreadSync.class.
        // Non-synchronized statements (like System.out.println("Not synced");) can still be executed by other threads concurrently
        
    }
}

class SyncTest{
    public static void main(String[] args) {
        ThreadSync threadSync1 = new ThreadSync();
        threadSync1.start();

        ThreadSync threadSync2 = new ThreadSync();
        threadSync2.start();
    }
}
