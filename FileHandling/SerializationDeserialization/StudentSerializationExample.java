

import java.io.*;

// Class that implements Serializable interface
class Student implements Serializable {
    private int id;
    private String name;
    private String course;

    public Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    // Getter methods for student details
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    // Method to display student details
    public void displayStudent() {
        System.out.println("Student ID: " + id + ", Name: " + name + ", Course: " + course);
    }
}

public class StudentSerializationExample {

    // Method to serialize object to a file
    public static void serializeStudent(Student student, String fileName) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(student);
            System.out.println("Student object serialized to file: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred during serialization.");
            e.printStackTrace();
        }
    }

    // Method to deserialize object from a file
    public static Student deserializeStudent(String fileName) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            Student student = (Student) in.readObject();
            System.out.println("Student object deserialized from file: " + fileName);
            return student;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An error occurred during deserialization.");
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        String fileName = "student.ser";

        // Create a Student object
        Student student1 = new Student(101, "Alice", "Computer Science");

        // Serialize the student object
        serializeStudent(student1, fileName);

        // Deserialize the student object
        Student deserializedStudent = deserializeStudent(fileName);

        // Display the deserialized object
        if (deserializedStudent != null) {
            deserializedStudent.displayStudent();
        }
    }
}
