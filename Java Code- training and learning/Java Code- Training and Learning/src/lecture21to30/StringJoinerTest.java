package lecture21to30;

import java.util.StringJoiner;

public class StringJoinerTest {
    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner(", ", "[", "]");
        stringJoiner.add("Swarali");
        stringJoiner.add("Prerana");
        stringJoiner.add("Pallavi");

        System.out.println(stringJoiner);

    }
}
