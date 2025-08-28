package lecture11to20.collections;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        // Adding elements
        vector.add(10);
        vector.add(20);
        vector.add(30);

        // Accessing elements
        System.out.println("Element at index 1: " + vector.get(1)); // Output: 20

        // Iterating through the vector
        for (int num : vector) {
            System.out.print(num + " "); // Output: 10 20 30
        }
        System.out.println();

        // Removing an element
        vector.remove(1); // Remove the element at index 1
        System.out.println("Vector after removal: " + vector); //Output: [10, 30]

        //Checking size.
        System.out.println("Vector size: " + vector.size()); //Output: 2

        //Checking capacity
        System.out.println("Vector capacity: " + vector.capacity()); //Output: 10, or whatever the initial capacity was.

        //Adding more elements to show capacity increase.
        for(int i = 0; i < 9; i++){
            vector.add(i);
        }
        System.out.println("Vector capacity after adding more: " + vector.capacity()); //Output: 20
    }
}