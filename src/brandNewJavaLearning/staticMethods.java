package brandNewJavaLearning;

class A {
    static void print() {
        System.out.println("A");
    }
}

class B extends A {
    static void print() {
        System.out.println("B");
    }
}

class Test {
    public static void main(String[] args) {
        A obj = new B();
        obj.print(); // A

        A obj2=null;
        obj2.print(); // A

//        static methods are not subject to runtime polymorphism.
//                Here, the method call is resolved at compile time based on the reference type.
    }
}

class D{
    public D(){}
    public D(int x){}
}

class E extends D{

}

