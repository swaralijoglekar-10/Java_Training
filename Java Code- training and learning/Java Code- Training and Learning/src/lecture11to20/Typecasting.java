package lecture11to20;

class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }


    public void walk() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    public void fetch() {
        System.out.println("Dog fetching");
    }

    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}


class Cat extends Animal {
    public void fetch() {
        System.out.println("Cat fetching");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Upcasting
        myDog.makeSound(); // Outputs: Bark

        Animal myCat = new Cat(); // Upcasting
        myCat.makeSound(); // Outputs: Meow


    }
}