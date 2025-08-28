package lecture1to10;

public class StaticTest {

    int a = 20;
    static int b; //has default value

    public void show() {
        System.out.println("Instance variable-" + a + "\n Static variable-" + b);
    }

    public void change() {
        a++;
        b++;
    }

    void print(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();

        st1.show(); // 20, default value of static variable- 0
        st2.show(); // 20, 0
        st1.change(); // static variable value- 1
        st2.change(); // static variable value- 2
        st1.show(); // 21, 2
        st2.show(); // 21, 2

    }
}

class Typecasting{
    public static void main(String[] args) {
        int  i = 10;
        long l = 60L;
        float f = 5.6F;
        double n = 67.459;

        long l1 = i; // Widening
        System.out.println(l1);

        // Long is wrapper class. long is data type
        // Java does not automatically convert between primitive types and their corresponding wrapper classes

        //Narrowing
        // double to int: Data loss will be there
        int x = (int) n;
        System.out.println(x);

        // Char type casting
        char c = 'A'; //ascii value is 65
        int ascii = c;
        System.out.println(ascii);

        char reconverted = (char)(ascii + 1);
        System.out.println(reconverted); // 65+1 = 66 ascii value at 66 is B

    }

}
