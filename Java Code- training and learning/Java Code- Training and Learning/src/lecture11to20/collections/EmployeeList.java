package lecture11to20.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class Person{
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

public class EmployeeList {
    public static void main(String[] args) {
        //1.
        Collection<String> employees = new ArrayList<>();

        employees.add("Rohit");
        employees.add("Virat");
        employees.add("Rahul");
        employees.add("Raj");

        Iterator<String> itr=employees.iterator();

        System.out.println("Employees List : ");
        while (itr.hasNext()) {
            String emp = itr.next();
            if(emp.endsWith("l"))
                itr.remove();
        }
        System.out.println(employees);
        // Iterator allows removal of elements during iteration using remove() method.

        //2.
        Collection<Person> persons = new ArrayList<>();
        persons.add(new Person(12, "Krishna"));
        persons.add(new Person(14, "Balram"));

        Iterator<Person> it = persons.iterator();
        while(it.hasNext()){
            Person p = it.next();
            System.out.println(p.age+ " "+p.name);
        }

    }
}
