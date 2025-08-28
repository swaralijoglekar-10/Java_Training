package lecture21to30;

public class CompareToExample {
    public static void main(String[] args) {
        System.out.println("A".compareTo("Z")); // -25

        System.out.println("Z".compareTo("A")); // 25
        //positive value when object 1 comes after object 2

        System.out.println("A".compareTo("A")); // 0
    }
}
