package OOPs.Encapsulation.GetterSetter;

 class Person {
    // Private fields
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age cannot be negative.");
        } else {
            this.age = age;
        }
    }
}

public class GetterSetterDemo {
    public static void main(String[] args) {
        Person person = new Person();
        
        // Using setters to set values
        person.setName("Alice");
        person.setAge(30);
        
        // Using getters to retrieve values
        System.out.println("Name: " + person.getName()); // Outputs: Name: Alice
        System.out.println("Age: " + person.getAge());   // Outputs: Age: 30
        
        // Trying to set an invalid age
        person.setAge(-5); // Outputs: Age cannot be negative.
    }
}
