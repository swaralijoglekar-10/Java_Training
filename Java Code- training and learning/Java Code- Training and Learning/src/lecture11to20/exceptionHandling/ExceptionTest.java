package lecture11to20.exceptionHandling;

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            int z = x / y;
        }
        catch (ArithmeticException e){ // write child exception class first
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Always executes");
        }
    }
}


