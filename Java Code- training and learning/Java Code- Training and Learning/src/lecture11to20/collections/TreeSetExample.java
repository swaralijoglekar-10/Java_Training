package lecture11to20.collections;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet t=new TreeSet(Collections.reverseOrder());
        t.add(90);
        t.add(20);
        t.add(60);
        t.add(10);
        t.add(75);
        //t.add("jay"); //Exception in thread
        //t.add(null); //NPE
        System.out.println(t);

        System.out.println(t);
        TreeSet<String> students = new TreeSet<>();
        students.add("Uditi");
        students.add("Suraj");
        students.add("Rameshwar");
        students.add("Pratiksha");
        students.add("Suraj"); //Duplicate Ignored
        System.out.println("Sorted Students : "+students);
    }
}
