package lecture11to20.exceptionHandling;

public class ExceptionTest2 {
    public static void main(String[] args) {
        try{
            int[] a= {10, 20, 30};
            System.out.println(a[3]);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
