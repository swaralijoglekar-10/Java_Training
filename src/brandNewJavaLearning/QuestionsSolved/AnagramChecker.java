package brandNewJavaLearning.QuestionsSolved;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next().toLowerCase();
        String b = sc.next().toLowerCase();

        char[] charArray1 = a.toCharArray();
        char[] charArray2 = b.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        a = new String(charArray1);
        b = new String(charArray2);

        if(a.equals(b))
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");

    }

}
