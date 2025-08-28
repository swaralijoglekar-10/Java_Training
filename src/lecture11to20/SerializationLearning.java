package lecture11to20;

import java.io.*;

class Employee2 implements Serializable {

    private String name;
    private String age;

    private transient String password; // this field will not be serialized

    public Employee2(String name, String age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

public class SerializationLearning {
    public static void main(String[] args) throws FileNotFoundException {
        Employee2 employee = new Employee2("Swarali", "23", "Radha#Krishna");

        // Serialization- object to byte stream
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Employee2.ser"))){
            objectOutputStream.writeObject(employee);
            System.out.println("Serialized "+employee);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        // The data in .ser file here will be in one line only.
        //If you modify it, then it will be corrupt and deserialization won't happen.

        // Deserialization- byte stream to object
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("Employee2.ser"))){
            Employee2  deserializedEmp = (Employee2) in.readObject();
            System.out.println("Deserialized "+deserializedEmp);
        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // If I use this code, I won't be able to deserialize because I am using toString() in writeObject
        // not byte stream
        // writeObject with employee.toString() passed inside
        Employee2 employeeNew = new Employee2("Pallavi", "47", "Gaurangi#Govinda");

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Employee2.txt"))){
            objectOutputStream.writeObject(employeeNew.toString());
            System.out.println("Serialized "+employeeNew);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
