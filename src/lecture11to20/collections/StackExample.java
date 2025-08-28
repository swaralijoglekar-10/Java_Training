package lecture11to20.collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack stack1 = new Stack();
        stack1.push("1234");
        stack1.push(true);
        stack1.push(87);

        System.out.println(stack1);
        System.out.println("Using peek() method :"+stack1.peek());
        System.out.println(stack1.search(true));

    }
}
