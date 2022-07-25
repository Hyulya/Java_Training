package oop.estafetbacklog01.task03;

import java.util.List;

public class Bookstore {
    int quantity;
    List<String> bookNames;
    double price;

    // Constructor

    public Bookstore(int quantity, List<String> bookNames, double price) {
        this.quantity = quantity;
        this.bookNames = bookNames;
        this.price = price;
    }

    // Methods

    public int checkAvailableBooks() {
        System.out.println(quantity);
        return quantity;
    }

    public void findByBookName(String bookName) {
        boolean isFound = false;
        for (String name : bookNames) {
            if (name.equalsIgnoreCase(bookName)) {
                isFound = true;
                break;
            }
        }
        if (isFound = true) {
            System.out.println("The book exists in this store");
        } else {
            System.out.println("The book doesn't exist in this store");
        }
    }

    public void buyBook() {
        quantity = quantity - 1;
        System.out.println("Book quantity is " + quantity);
    }

    // getter and setters, toString();

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public List<String> getBookNames() {
        return bookNames;
    }

    public void setBookNames(List<String> bookNames) {
        this.bookNames = bookNames;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bookstore{" +
                "quantity=" + quantity +
                ", bookNames=" + bookNames +
                ", price=" + price +
                '}';
    }
}