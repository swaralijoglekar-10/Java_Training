package brandNewJavaLearning.QuestionsSolved;

import java.util.*;
// Searching algorithms

class SearchingAlgorithms{

    public static void linearSearch(int arraySize, int[] intArray, int key){
        for(int i=0; i<arraySize; i++){
            if(intArray[i] == key){
                System.out.println("The element is present at index: "+ i);
                break;
            }
        }
    }

    public static void binarySearch(int arraySize, int[] intArray, int key){

        Arrays.sort(intArray);

        int left_Index = 0;
        int right_index = arraySize-1;
        int mid_Index;
        boolean keyFound = false;

        while(left_Index <= arraySize-1 && right_index >=0 && left_Index<=right_index){
            mid_Index = (left_Index + right_index)/2;

            if(intArray[mid_Index] == key){
                System.out.println("Key is present in the array");
                keyFound = true;
                break;
            }
            else if(key > intArray[mid_Index]){
                if(left_Index <= arraySize-1){
                   left_Index = mid_Index + 1;
                }
            }
            else{
                if(right_index >= 0){
                    right_index = mid_Index -1;
                }
            }
        }

        if(keyFound == false)
            System.out.println("Key not found");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer array size");
        int arraySize = sc.nextInt();
        int[] intArray = new int[arraySize];

        System.out.println("Enter the elements");
        for(int i=0; i<arraySize; i++){
            intArray[i] = sc.nextInt();
        }
        System.out.println("Enter the element that is to be searched");
        int key = sc.nextInt();

        linearSearch(arraySize, intArray, key);
        binarySearch(arraySize, intArray, key);


    }
}

