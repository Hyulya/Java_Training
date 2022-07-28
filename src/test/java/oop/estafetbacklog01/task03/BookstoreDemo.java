package oop.estafetbacklog01.task03;
/*
Comment on the task:

You should add an additional class Book (with title, author, price, etc...) and add different books in the bookstore
in different quantities. So when you search for a book, if it's found, return the book info.
If you buy a book reduce the quantity of the given book, not the quantity of all books.
Think about additional checks - can you buy a book out of stock? etc...
 */
import java.util.List;

public class BookstoreDemo {
    public static void main(String[] args) {

        // Creating books
        Book book01 = new Book("SQL", "SQL Author", 10.5, 3);
        Book book02 = new Book("Java", "Java Author", 11.5, 2);
        Book book03 = new Book("Cucumber", "Cucumber Author", 15.5, 1);
        Book book04 = new Book("Selenium", "Selenium Author", 9.5, 5);

        // Add different books in the bookstore in different quantities
        Bookstore bookstore = new Bookstore(11, List.of(book01,book02,book03,book04), 97.5);
        System.out.println();

        // Check if the book exists in the bookstore
        bookstore.findByBookName("JDBC");
        System.out.println();

        // If you buy a book reduce the quantity of the given book
        bookstore.buyBook("Java",3);
        System.out.println();

        // Print all the info for the bookstore
        System.out.println(bookstore);
        System.out.println();

       // So when you search for a book, if it's found, return the book info.
        bookstore.returnByBookName("Fairytale");
        System.out.println();

    }
}
