package lecture1to10;

// Hierarchical inheritance
class Grandparent{
    public void makeSound(){
        System.out.println("Grandparent sound");
    }
}

class Parent1 extends Grandparent{
    @Override
    public void makeSound(){
        System.out.println("Parent1 sound");
    }
}

class Parent2 extends Grandparent{
    @Override
    public void makeSound(){
        System.out.println("Parent2 sound");
    }
}

// how diamond problem appears
// Parent1 and parent2 with their different implementations of makeSound().
// So, Child is confused as to which method to call

// how to solve it with interfaces

interface Grand_Guardian{
    public void makeSound();
}

interface Guardian1 extends Grand_Guardian{
    default void makeSound(){
        System.out.println("Sound of Guardian1");
    }
}

interface Guardian2 extends Grand_Guardian{
    default void makeSound(){
        System.out.println("Sound of Guardian2");
    }
}



// interfaces with default methods

