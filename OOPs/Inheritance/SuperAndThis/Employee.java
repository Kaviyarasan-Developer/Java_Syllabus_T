package OOPs.Inheritance.SuperAndThis;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, String department) {
        super(name); // Call the superclass constructor
        this.department = department;
    }

    void display() {
        System.out.println("Manager Name: " + super.name); // Access superclass variable
        System.out.println("Department: " + department);
    }
}

 class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("John", "Sales");
        manager.display();
    }
}
