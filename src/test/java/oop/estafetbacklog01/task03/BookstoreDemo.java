package oop.estafetbacklog01.task03;

import java.util.List;

public class BookstoreDemo {
    public static void main(String[] args) {

        // Running the methods from Bookstore

        Bookstore bookstore = new Bookstore(3, List.of("Java", "SQL"), 50.5);

        bookstore.checkAvailableBooks();

        bookstore.findByBookName("Java");

        bookstore.buyBook();

        System.out.println(bookstore);
    }
}
