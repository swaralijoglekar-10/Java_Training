package brandNewJavaLearning.QuestionsSolved;

public class SortingAlgorithms {

    public static void bubbleSort(int[] arr){
        // i - steps
        // j - iterations in the steps

        //Optimized bubble sort- check already sorted array using flag

        boolean sorted= true;
        for(int i=0; i<=arr.length-2; i++){   // we need length-1 no. of steps
            for(int j=0; j<=arr.length-2-i; j++){  // reduce the las index after every iteration and we can't go beyond len-2 because we are already comparing j and j=1
                if(arr[j]> arr[j+1]){
                    sorted = false;
                    swap(arr, j, j+1);
                }
            }

            if(sorted == true)
                break;
        }

        printArray(arr);
    }

    public static void selectionSort(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int currentIndexOfSmallest = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[currentIndexOfSmallest]) {
                    currentIndexOfSmallest = j;
                }
            }

           swap(arr, i, currentIndexOfSmallest);
        }

        printArray(arr);
    }

    public static void insertionSort(int[] arr){
        int n = arr.length;

        if(n == 1)
            printArray(arr);

        for(int firstIndexOfUnsortedArray=1 ; firstIndexOfUnsortedArray<n; firstIndexOfUnsortedArray++){
            int lastIndexOfSortedArray = firstIndexOfUnsortedArray-1;

            for(int i=lastIndexOfSortedArray; i >= 0; i--){
                if(arr[i+1] < arr[i]){
                    swap(arr, i+1, i);
                }
            }

        }

        printArray(arr);
    }

    public static void swap(int[] arr, int index1, int index2){
        int temp;
        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void printArray(int[] arr){
        for(int element: arr)
            System.out.println(element);
    }

    public static void main(String[] args) {
            int[] arr = {23, 9, 53, 1, 5};
            int[] arr2 = {0, -4, -56, 45, 1, 9};

            bubbleSort(arr);
            bubbleSort(arr2);

            selectionSort(arr2);

            insertionSort(arr2);
    }
}
