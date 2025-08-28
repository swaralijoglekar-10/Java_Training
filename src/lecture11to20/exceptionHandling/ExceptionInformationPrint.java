package lecture11to20.exceptionHandling;

public class ExceptionInformationPrint {

    void m1(){
        m2();
    }

    void m2(){
        try{
            System.out.println(10/0);
        }
        catch(Exception e){
            System.out.println(e.toString() + "\n"+ e.getMessage()+ "\n");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ExceptionInformationPrint exceptionInformationPrint = new ExceptionInformationPrint();
        exceptionInformationPrint.m1();
    }
}
