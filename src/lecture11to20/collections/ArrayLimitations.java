package lecture11to20.collections;

class Student{}

class Customer{}

public class ArrayLimitations {
    public static void main(String[] args) {

        //1. Array is not heterogeneous
        Student[] s= new Student[100];
        s[0] = new Student();
        //ERROR  s[1] = new Customer();

        //2.
        Object[] objects = new Object[100];
        objects[0] = new Student();
        objects[1] = new Customer();
        // Array is not heterogeneous, Object is the superclass of all classes
        // So, object array could have heterogeneous elements here

    }
}
