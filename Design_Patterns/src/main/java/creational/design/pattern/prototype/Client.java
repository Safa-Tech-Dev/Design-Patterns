package creational.design.pattern.prototype;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {

        Book book = new Book("Design Patterns" , "GoF");

        // Clone the object
        Book copyBook = null;
        try {
            copyBook = book.clone();
        } catch (CloneNotSupportedException e) {
            throw new CloneNotSupportedException("Clone Not Supported ");
        }
        System.out.println("Original Book: " + book);
        System.out.println("Copy Book: " + copyBook);
    }
}
