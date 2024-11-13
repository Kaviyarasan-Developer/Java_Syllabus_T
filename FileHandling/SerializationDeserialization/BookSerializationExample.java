


import java.io.*;

// Class that implements Serializable interface
class Book implements Serializable {
    private String title;
    private String author;
    private int yearPublished;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    // Getter methods for book details
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    // Method to display book details
    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", Year Published: " + yearPublished);
    }
}

public class BookSerializationExample {

    // Method to serialize object to a file
    public static void serializeBook(Book book, String fileName) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(book);
            System.out.println("Book object serialized to file: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred during serialization.");
            e.printStackTrace();
        }
    }

    // Method to deserialize object from a file
    public static Book deserializeBook(String fileName) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            Book book = (Book) in.readObject();
            System.out.println("Book object deserialized from file: " + fileName);
            return book;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An error occurred during deserialization.");
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        String fileName = "book.ser";

        // Create a Book object
        Book book1 = new Book("Java Programming", "John Doe", 2023);

        // Serialize the book object
        serializeBook(book1, fileName);

        // Deserialize the book object
        Book deserializedBook = deserializeBook(fileName);

        // Display the deserialized object
        if (deserializedBook != null) {
            deserializedBook.displayBook();
        }
    }
}
