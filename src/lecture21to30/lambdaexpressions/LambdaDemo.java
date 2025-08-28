package lecture21to30.lambdaexpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class LambdaDemo {
    public void add(int a, int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        // normal OOP implementation
        LambdaDemo lambdaDemo = new LambdaDemo();
        lambdaDemo.add(10, 20);

        BiConsumer<Integer, Integer> biConsumer = (a, b)-> System.out.println(a+b);
        biConsumer.accept(10, 20);
        // BiConsumer does not return

        Function<Integer, Integer> function = i-> i*i;
        System.out.println(function.apply(4));
        // Function- returns

        List<String> names = Arrays.asList("Swarali", "Pallavi");
        names.forEach(name-> System.out.println(name));
    }
}
