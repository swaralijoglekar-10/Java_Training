package brandNewJavaLearning.QuestionsSolved;

import java.util.*;

class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int k = sc.nextInt();
        sc.close();

        // Print smallest and largest substring of length k

        String smallest = str.substring(0, k);
        String largest = str.substring(0, k);

        for(int i=1; i<=str.length()-k; i++){
            String subStr = str.substring(i, i+k);

            // smallest substring of length k
            if(subStr.compareTo(smallest) < 0){
                smallest = subStr;
            }

            //largest substring of length k
            if(subStr.compareTo(largest) > 0){
                largest = subStr;
            }

        }

        System.out.print(smallest+"\n"+largest);


    }
}
