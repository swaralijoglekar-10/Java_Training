package lecture11to20.exceptionHandling;

public class ExceptionTest6 {
    void studentDetails() throws InterruptedException{
        System.out.println("Xyz is sleeping");
        Thread.sleep(3000);
        System.out.println("do not disturb");
    }
    void hod() throws InterruptedException{
        studentDetails();
    }
    void principal(){
        try{
            hod();
        }catch (InterruptedException ie){
            System.out.println(ie);
        }
    }
    void officeBoy(){
        principal();
    }

    public static void main(String[] args) {
        ExceptionTest6 obj=new ExceptionTest6();
        obj.officeBoy();
    }
}
