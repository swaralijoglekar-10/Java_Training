package lecture21to30;

class RunnableDemo implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<10; i++){
            System.out.println("Value of "+i + "\t"+ Thread.currentThread().getName());
        }
    }
}

class ThreadDemo2{

    public static void main(String[] args) {
        RunnableDemo runnableDemo = new RunnableDemo();
        Thread thread = new Thread(runnableDemo);
        thread.start();


    }
}
