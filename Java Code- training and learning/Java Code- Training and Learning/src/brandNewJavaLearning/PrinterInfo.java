package brandNewJavaLearning.generics;


class Animal{
    String name; 
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("Eat food");
    }
}

class Cow extends Animal{
    public Cow(String name, int age) {
        super(name, age);
        //System.out.println("moo");
    }

    @Override
    public void eat(){
        System.out.println("Eats grass");
    }
}

class Deer extends Animal{
    public Deer(String name, int age) {
        super(name, age);
        //System.out.println("urrrpp");
    }

    @Override
    public void eat(){
        System.out.println("Eats berries");
    }
}

// bounded generic
public class PrintInfo <T extends Animal>{
    T animalToPrint; 
    
    public PrintInfo(T t){
        this.animalToPrint = t; 
    }
    
    public void printDetails(){
        System.out.println(animalToPrint.name+" Age:"+animalToPrint.age);
        animalToPrint.eat();
    }
}

class Main{
    public static void main(String[] args) {
        Cow cow1 = new Cow("Kamala", 20);
        Deer deer1 = new Deer("Heera", 15); 
        
        PrintInfo<Cow> printInfo = new PrintInfo<>(cow1);
        PrintInfo<Deer> printInfo1 = new PrintInfo<>(deer1); 
        printInfo.printDetails();
        printInfo1.printDetails();
    }
}

// class name first and then interface name
// public class PrintInfo <T extends Animal & Serializable> 
// class extends Animal class and implements Serializable interface
// there can be only one class here as java doesn't support multiple inheritance
