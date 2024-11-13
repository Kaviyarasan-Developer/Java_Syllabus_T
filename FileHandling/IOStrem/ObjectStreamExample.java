

import java.io.*;

class Person implements Serializable {
    String name;
    int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ObjectStreamExample {
    public static void main(String[] args) {
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        
        try {
            // Writing an object to the file
            oos = new ObjectOutputStream(new FileOutputStream("person.dat"));
            Person person = new Person("John Doe", 30);
            oos.writeObject(person);
            System.out.println("Object written to file.");
            
            // Reading an object from the file
            ois = new ObjectInputStream(new FileInputStream("person.dat"));
            Person readPerson = (Person) ois.readObject();
            
            System.out.println("Object read from file:");
            System.out.println("Name: " + readPerson.name);
            System.out.println("Age: " + readPerson.age);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            // Close the streams
            try {
                if (oos != null) oos.close();
                if (ois != null) ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
