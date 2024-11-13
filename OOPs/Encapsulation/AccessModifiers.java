package OOPs.Encapsulation;

class AccessModifiers {
    private int privateVar = 10;
    protected int protectedVar = 20;
    public int publicVar = 30;

    public void display() {
        System.out.println("Private Variable: " + privateVar);
        System.out.println("Protected Variable: " + protectedVar);
        System.out.println("Public Variable: " + publicVar);
    }
}

class TestAccess {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        obj.display();
        // obj.privateVar = 5; // Error: privateVar has private access in AccessModifiers
    }
}
