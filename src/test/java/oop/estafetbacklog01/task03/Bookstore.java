package oop.estafetbacklog01.task03;

/*
Let's make a model of a Bookstore. A bookstore can sell books, show the available books, and show the price of those books.
Write classes that express the following behaviour:
▪ Make it possible to check the available books in this bookstore and
the number of copies from a given book (print them in the console)
▪ Make it possible to find a book using its name
▪ Let it be possible to buy a book and reduce the number of the given book in this bookstore (availability).
▪ You must write your classes in such a way that they can be used by another class that another programmer wrote.
  That means that you should have only one main method (you can call it BookstoreDemo) where you should call other classes.
  All other classes should not have main methods, but normal methods to perform the specified functionality.
 */

import java.util.List;

public class Bookstore {
    int quantityAllBooks;
    List<Book> books;
    double priceAllBooks;

    // Constructor

    public Bookstore(int quantity, List<Book> books, double price) {
        this.quantityAllBooks = quantity;
        this.books = books;
        this.priceAllBooks = price;
    }

    // Methods

    public void findByBookName(String bookName) {
        boolean isFound = false;
        for (Book book : books) {
            String title = book.getTitle();
            if (title.equalsIgnoreCase(bookName)) {
                isFound = true;
                break;
            }
        }
        if (isFound) {
            System.out.println("The book exists in this store");
        } else {
            System.out.println("The book doesn't exist in this store");
        }
    }

    public Book returnByBookName(String bookName){
        for (Book book : books) {
            String bookTitle = book.getTitle();
            if(bookTitle.equals(bookName)){
                System.out.println(book.toString());
                return book;
            }
        }
        System.out.println("The book is not available");
        return null;
    }

    public void buyBook(String boughtBook,int boughtQuantity) {
        Book book = returnByBookName(boughtBook);
        int availableQuantity = book.getAvailableQuantity();
        if (availableQuantity < boughtQuantity) {
            System.out.println("The quantity you want to buy is not available.");
        } else {
            int newQuantity = availableQuantity - boughtQuantity;
            book.setAvailableQuantity(newQuantity);
            quantityAllBooks = quantityAllBooks - boughtQuantity;
            System.out.println(boughtBook + " quantity is " + newQuantity);
            System.out.println("The current available books quantity is " + quantityAllBooks);
        }
    }

    // getter and setters, toString();

    public int getQuantityAllBooks() {
        return quantityAllBooks;
    }

    public void setQuantityAllBooks(int quantityAllBooks) {
        this.quantityAllBooks = quantityAllBooks;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public double getPriceAllBooks() {
        return priceAllBooks;
    }

    public void setPriceAllBooks(double priceAllBooks) {
        this.priceAllBooks = priceAllBooks;
    }

    @Override
    public String toString() {
        return "Bookstore{" +
                "quantity=" + quantityAllBooks +
                ", bookNames=" + books +
                ", price=" + priceAllBooks +
                '}';
    }
}