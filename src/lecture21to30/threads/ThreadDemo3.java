package lecture21to30.threads;

public class ThreadDemo3 extends Thread{

    public void run(){
        System.out.println(Thread.currentThread().getName()+"is running");
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());

        ThreadDemo3 thread1 = new ThreadDemo3(); //Thread-0
        ThreadDemo3 thread2 = new ThreadDemo3(); //Thread1-1
        System.out.println(thread1.getName()+" "+thread2.getName());
        thread1.setPriority(MIN_PRIORITY);
        thread2.setPriority(MAX_PRIORITY);

        thread1.start();
        thread2.start();
    }
}
