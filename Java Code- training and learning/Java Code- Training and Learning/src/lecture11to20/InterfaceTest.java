package lecture11to20;


interface MyInterface{
    int x = 10;
    public static final int y = 20; // no need to write public static final, it is already

    public abstract void display(); // no need to write public abstract, it is already
    void display2();

}

public class InterfaceTest implements MyInterface{
    public void display(){
        System.out.println("Hello");
    }

    public void display2(){
        System.out.println("Hello2");
    }

    public static void main(String[] args) {
        MyInterface myInterface = new InterfaceTest();

    }
}
