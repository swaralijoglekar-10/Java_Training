package lecture11to20.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet obj=new LinkedHashSet();
        obj.add("A");
        obj.add("Z");
        obj.add("E");
        obj.add("B");
        obj.add("B");
        obj.add(null);
        obj.add(10);
        //obj.add("Z");
        System.out.println(obj);
        System.out.println(obj.add("Z"));
        Iterator itr=obj.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
