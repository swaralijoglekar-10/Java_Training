package brandNewJavaLearning.QuestionsSolved;

import java.util.HashMap;

public class UniqueElement {
        // a ^ b = (not a * b ) + ( a * not b)

    public static void main(String[] args) {

        // Question- Find unique element in array of integers where all the integers occur twice except one unique integer

        int arr[] = {4, 3, 4, 5, 3};
        int len = arr.length;

        // Optimal method with O(n)
        int unique = 0;
        for(int i=0; i<len; i++){
            unique ^= arr[i];  // xor with itself is 0. xor with 0 gives the same number
        }

        System.out.println(unique);

        // ----------------------------
        // O(n*n) - not optimal method
        HashMap<Integer, Integer> mapCount = new HashMap<>();
        int element = 0;
        int counter;
        for(int i=0; i<len; i++){
            element = arr[i];
            counter = 1;

            if(mapCount.containsKey(element))
                continue;

            for(int j=i+1; j<len && i!=len-1; j++){
                if((element ^ arr[j]) == 0)
                    counter++;
            }
            if(!mapCount.containsKey(element)) // only if key doesn't exist, then put the count in the map
                mapCount.put(element, counter);
        }

        for(int num: mapCount.keySet()){
            if(mapCount.get(num) == 1)
                System.out.println(num);
        }


//        int x = 4;
//        int y = 4;
//        int z = 5;
//        System.out.println((x ^ y) + " "+ ( y ^ z));  // 0  1



    }
}
