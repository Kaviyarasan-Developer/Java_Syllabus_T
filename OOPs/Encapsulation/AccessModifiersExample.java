package OOPs.Encapsulation;


public class AccessModifiersExample {
    public int publicVar = 1;
    private int privateVar = 2;
    protected int protectedVar = 3;
    int defaultVar = 4; // default access

    public void display() {
        System.out.println("Public Variable: " + publicVar);
        System.out.println("Private Variable: " + privateVar);
        System.out.println("Protected Variable: " + protectedVar);
        System.out.println("Default Variable: " + defaultVar);
    }
}




 class PublicClass {
    public void display() {
        System.out.println("Public Method");
    }
}


 class PrivateClass {
    private int secretNumber = 42;

    private void showSecret() {
        System.out.println("Secret Number: " + secretNumber);
    }

    public void reveal() {
        showSecret(); // Can access private method
    }
}



class ProtectedClass {
    protected void display() {
        System.out.println("Protected Method");
    }
}

class SubClass extends ProtectedClass {
    public void callProtected() {
        display(); // Accessing protected method from subclass
    }
}



class DefaultClass {
    void display() {
        System.out.println("Default Method");
    }
}


class TestAccess {
    public static void main(String[] args) {
        AccessModifiersExample example = new AccessModifiersExample();
        example.display(); // Accessible

        // Accessing members directly
        System.out.println("Accessing from TestAccess:");
        System.out.println("Public: " + example.publicVar);
        // System.out.println("Private: " + example.privateVar); // Not accessible
        System.out.println("Protected: " + example.protectedVar);
        System.out.println("Default: " + example.defaultVar); // Accessible since in the same package
    }
}
