package Basic;
// Example of Non-Primitive Data Types in Java
public class NonPrimitiveDataTypes {

    public static void main(String[] args) {
        // 1. String (Non-Primitive)
        String name = "John Doe";
        System.out.println("Name: " + name);

        // 2. Array (Non-Primitive)
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Array values:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // 3. Custom Class (Non-Primitive)
        Person person = new Person("Alice", 25);
        System.out.println("Person Name: " + person.getName());
        System.out.println("Person Age: " + person.getAge());
    }
}

// Custom Class (Non-Primitive)
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
