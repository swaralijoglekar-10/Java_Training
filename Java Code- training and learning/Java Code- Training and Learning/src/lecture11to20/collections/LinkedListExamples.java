package lecture11to20.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExamples {
        public static void main(String[] args) {
            List<Integer> list1 = new LinkedList<>();
            long start = System.currentTimeMillis();
            for (int i = 0; i < 100000; i++) {
                list1.add(i);
            }
            long end = System.currentTimeMillis();
            System.out.println("Linked List Time : " + (end - start) + " ms");
        }
}
