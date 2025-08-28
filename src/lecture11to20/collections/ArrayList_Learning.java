package lecture11to20.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Learning {
    public static void main(String[] args) {

        //1.
        List<String> users = new ArrayList<>();
        users.add("abc");
        users.add("def");
        System.out.println(users); // [abc, def]
        users.clear();
        System.out.println(users); // []

        //2. Without generic
        List names = new ArrayList();
        names.add(123);  // Object as parameter
        names.add("rfuh3rf");
        names.add(false);

        System.out.println(names.size()); // 3
        System.out.println(names.isEmpty()); // false

        // 3. Without generic
        ArrayList arr1 = new ArrayList();

        Integer i = 3;
        Character c = 'a';
        Double d = 34.5;

        arr1.add(i);
        arr1.add(c);
        arr1.add(d);

    }
}
