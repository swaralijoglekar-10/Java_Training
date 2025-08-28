package lecture21to30.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(20);
        al.add(37);
        al.add(99);
        al.add(64);

        List<Integer> l1= al.stream().filter(i-> i%2==0).collect(Collectors.toList());
        System.out.println(l1);

        List<String> names= Arrays.asList("Swarali", "Prerana", "Mrunalini");

        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("S"))
                .collect(Collectors.toList());
        filteredNames.forEach(System.out::println);



    }
}
