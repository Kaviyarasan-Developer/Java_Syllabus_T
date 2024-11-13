

class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class GenericClassExample {
    public static void main(String[] args) {
        // Box for Integer
        Box<Integer> intBox = new Box<>();
        intBox.setItem(10);
        System.out.println("Integer Box: " + intBox.getItem());

        // Box for String
        Box<String> strBox = new Box<>();
        strBox.setItem("Hello Generics");
        System.out.println("String Box: " + strBox.getItem());
    }
}
