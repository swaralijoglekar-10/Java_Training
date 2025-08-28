package lecture21to30.threads;

public class ThreadDemo extends Thread{

    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Value of "+i + " "+ Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        ThreadDemo threadDemo = new ThreadDemo(); // new thread created
        threadDemo.start();
    }
}
