

import java.io.*;

// Class that implements Serializable interface
class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods for name and age
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method to display person details
    public void displayPerson() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class SerializationExample {

    // Method to serialize object to a file
    public static void serializeObject(Person person, String fileName) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(person);
            System.out.println("Object serialized to file: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred during serialization.");
            e.printStackTrace();
        }
    }

    // Method to deserialize object from a file
    public static Person deserializeObject(String fileName) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            Person person = (Person) in.readObject();
            System.out.println("Object deserialized from file: " + fileName);
            return person;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An error occurred during deserialization.");
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        String fileName = "person.ser";

        // Create a Person object
        Person person1 = new Person("John Doe", 30);

        // Serialize the person object
        serializeObject(person1, fileName);

        // Deserialize the person object
        Person deserializedPerson = deserializeObject(fileName);

        // Display the deserialized object
        if (deserializedPerson != null) {
            deserializedPerson.displayPerson();
        }
    }
}
