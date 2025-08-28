package lecture21to30.threads;

public class ThreadSync extends Thread{
    public void run(){
        System.out.println("Not synced");

        synchronized (ThreadSync.class){ // only this block will be synced
            for(int i=1; i<=10; i++){
                System.out.println(i);
            }
        }
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
