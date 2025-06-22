import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Book[] books = {
            new Book(101, "Java Basics", "James"),
            new Book(102, "Data Structures", "Mark"),
            new Book(103, "Algorithms", "Sara"),
            new Book(104, "Database Systems", "Anna")
        };

        Arrays.sort(books, Comparator.comparing(book -> book.title));

       
        System.out.println("Linear Search Result:");
        Book foundLinear = BookSearch.linearSearchByTitle(books, "Data Structures");
        System.out.println(foundLinear != null ? foundLinear : "Book not found");

        
        System.out.println("\nBinary Search Result:");
        Book foundBinary = BookSearch.binarySearchByTitle(books, "Algorithms");
        System.out.println(foundBinary != null ? foundBinary : "Book not found");
    }
}
