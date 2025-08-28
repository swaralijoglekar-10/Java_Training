package lecture1to10;

/** java doc comment */

class Parent{
    void display(){
        System.out.println("method in parent");
    }
}

class Child extends Parent{
    @Override
    void display(){
        System.out.println("Method in child class");
    }

    void childSpecificMethod(){
        System.out.println("child class specific method");
    }

}
public class Casting {
    public static void main(String[] args) {
        // Upcasting
        Parent parent = new Child();
        parent.display(); // Method in child class
        // If there would be no display() method in Child class, then display() method in parent class will be called

        //Downcasting
        if(parent instanceof Child){
            Child child = (Child) parent;
            child.display(); //Method in child class
            child.childSpecificMethod(); // child class specific method
            // If there would be no display() method in child class, then display() method in parent class will be called
        }


        //Autoboxing
        int x = 10;
        Integer integer = x;


        //Auto unboxing- automatic conversion
        // int a = new Integer(100); //Integer(int)' is deprecated since version 9 and marked for removal
        Integer integer2 = 100;
        int i = integer2;

        //Integer to String
        String str = integer2.toString(); // "100"

        //String to integer
        i = Integer.parseInt(str);

    }
}
