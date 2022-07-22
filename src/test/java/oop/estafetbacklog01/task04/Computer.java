package oop.estafetbacklog01.task04;

public class Computer {

    private final boolean isNotebook;
    private int year;
    private double price;
    private double hardDiskMemory;
    private double freeMemory;
    private String operationSystem;

    // Default constructor which initializes the field isNotebook with a value of false,
    // and the operationSystem field with "Win XP".
    public Computer() {
        this.isNotebook = false;
        this.operationSystem = "Win XP";
    }

    // constructor with parameters Computer(int year, double price, double hardDiskMemory, double freeMemory)
    // which first calls the default constructor and then initializes the rest of the fields
    // with the values submitted as arguments.
    public Computer(int year, double price, double hardDiskMemory, double freeMemory) {
        this();
        this.year = year;
        this.price = price;
        this.hardDiskMemory = hardDiskMemory;
        this.freeMemory = freeMemory;
    }

    // Constructor with parameters which initializes all fields
    public Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory, String operationSystem) {
        this.year = year;
        this.price = price;
        this.isNotebook = isNotebook;
        this.hardDiskMemory = hardDiskMemory;
        this.freeMemory = freeMemory;
        this.operationSystem = operationSystem;
    }

    // Methods

    /*
    Method void changeOperationSystem(String newOperationSystem) that changes the value of the operationSystem field
    with the value passed as parameter.
     */
    public void changeOperationSystem(String newOperationSystem) {
        operationSystem = newOperationSystem;
        System.out.println("The new operation system is: " + newOperationSystem);
    }

    /*
    method void useMemory(double memory) which decrements free memory (freeMemory) with the value passed as an argument.
    If the value of the argument is greater than the free memory, print the message "Not enough free memory!"
     */
    public void useMemory(double memory) {
        if (freeMemory > memory) {
            freeMemory -= memory;
            System.out.println("There's enough memory and the free memory is : " + freeMemory);
        } else {
            System.out.println("Not enough free memory.");
        }
    }

    public double getPrice() {
        return this.price;
    }

    /*
    Method int comparePrice(Computer c) which compares the prices of 2 computers.
    If the price of the first computer (the one for which the method is called) is higher
    than that of the computer passed as an argument, the method returns -1. If the price
    of the computer passed as an argument is higher return 1, and if they are equal the method returns a value of 0.
     */

    public double comparePrice(Computer c) {
        if (price > c.getPrice()) {
            // this > c the return will be -1
            return -1;
        } else if (price < c.getPrice()) {
            // this < c the return will be 1
            return 1;
        } else {
            // this == c the return 0
            return 0;
        }
    }

    // getters and setters


    // toString() method in order to be able to display all fields for the computers

    @Override
    public String toString() {
        return "Computer{" +
                "year=" + year +
                ", price=" + price +
                ", isNotebook=" + isNotebook +
                ", hardDiskMemory=" + hardDiskMemory +
                ", freeMemory=" + freeMemory +
                ", operationSystem='" + operationSystem + '\'' +
                '}';
    }
}