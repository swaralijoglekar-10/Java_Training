public class Main {

    public static void main(String[] args) {

        int a = 10;
        int b = a;
        a++;
        System.out.println(b); //10 --- the change in a will not be reflected
        System.out.println(a); //11
        System.out.println("Hello world!");

        // Both reference variables pointing to same object. Change in the object was reflected in both reference variables.
        int[] array = {1, 3, 5};
        int[] array_copy = array;
        array[0] = 10;
        System.out.println(array_copy[0]);

    }

}