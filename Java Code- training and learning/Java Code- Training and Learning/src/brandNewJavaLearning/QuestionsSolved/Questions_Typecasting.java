package brandNewJavaLearning.QuestionsSolved;

// 1.
//Here are coding questions based on the requested Java topics, designed to test understanding and practical application:
//
//Topic 1: Typecasting - Upcasting, Downcasting, Widening, Narrowing, Autoboxing, Autounboxing
//Question 1: Understanding Upcasting and Downcasting with Polymorphism
//
//Scenario:
//You are building a simple animal simulation. You have a base Animal class and two subclasses: Dog and Cat. Each class has a makeSound() method. The Dog class also has a fetch() method, and the Cat class has a scratch() method.
//
//        Task:
//
//Create the Animal class with a makeSound() method.
//Create the Dog class extending Animal, overriding makeSound(), and adding a fetch() method.
//Create the Cat class extending Animal, overriding makeSound(), and adding a scratch() method.
//In your main method:
//Create an Animal array and populate it with Dog and Cat objects.
//Iterate through the array. For each Animal object:
//Call its makeSound() method.
//Demonstrate Downcasting: If the animal is a Dog, call its fetch() method. If it's a Cat, call its scratch() method. Handle ClassCastException if downcasting is attempted incorrectly (though in this specific scenario, it should be safe with instanceof).
//Demonstrate Upcasting: Create a Dog object and upcast it to an Animal reference. Try to call the fetch() method using the Animal reference (explain why it fails).
//Expected Output:
//The output should demonstrate the correct sound for each animal and the execution of fetch() or scratch() methods after successful downcasting. It should also include a comment or print statement explaining why fetch() cannot be called on an Animal reference that was originally a Dog.


import java.util.ArrayList;

class Animal{
    public void makeSound(){
        System.out.println("Animal class makeSound");
    }
}

class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Dog class makeSound");
    }

    public void fetch(){
        System.out.println("Dog class scratch");
    }

}

class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Cat class makeSound");
    }

    public void scratch(){
        System.out.println("Cat class scratch");
    }

}

public class Questions_Typecasting {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();

        for(Animal animal: animals){
            animal.makeSound();
        }

        if(animals[0] instanceof Dog){
            //Downcasting:-
            Dog dog1 = (Dog) animals[0];
            dog1.fetch();
        }

        if(animals[1] instanceof Cat){
            //Downcasting:-
            Cat cat = (Cat) animals[1];
            cat.scratch();
        }

        //Upcasting
        Dog dog2 = new Dog();
        Animal animal = dog2;
        animal.makeSound();
        //Error- animal.fetch();


    }
}

// 2.
//Task:
//
//Widening Conversion (Implicit):
//Declare an int variable and assign it a value.
//        Assign this int value to a long variable.
//Assign this long value to a float variable.
//Assign this float value to a double variable.
//Print all values and their types.
//Narrowing Conversion (Explicit):
//Declare a double variable with a decimal value.
//Narrow this double to a float, then to a long, then to an int, and finally to a byte.
//Print each converted value and observe any data loss or changes.
//Declare an int variable with a large value (e.g., 200). Narrow it to a byte and explain the result (overflow).
//Expected Output:
//Clear print statements showing the values at each conversion step, with explanations for data loss or overflow where applicable.

class Widening_Narrowing{
    public static void main(String[] args) {

        // Widening-Implicit
        int a = 1000;
        long b = a;
        float c = b;
        double d = c;

        // Widening:- long to float
        // Java allows implicit conversion from long to float
        // because the range of float can accommodate the values of long, but precision may be lost.
        long l = Long.MAX_VALUE; // 9223372036854775807
        float f = l;
        System.out.println(f);

        long l2 = 3456L;
        float f2 = l2;

        // float to long
        float f3 = 567.4F;
        long l3 = (long) f3;

    }

    //3. Auto-boxing, Auto-unboxing

    class Autoboxing_AutoUnboxing{
        public static void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<>();
            int x = 10;
            numbers.add(x);  // I have assigned primitive int value converted to Integer object -- Auto-boxing
            Integer y = 20;  // Auto-boxing
            numbers.add(y);

            int z = numbers.get(0); // Auto-unboxing
        }

    }
}


