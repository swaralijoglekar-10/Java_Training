package brandNewJavaLearning;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<String> companies = new ArrayList<>();
        companies.add("Microsoft");
        companies.add("Amazon");
        companies.add("Google");
        companies.add("Apple");

        Collections.sort(companies);
        for(String company: companies)
            System.out.println(company);

    }

}
