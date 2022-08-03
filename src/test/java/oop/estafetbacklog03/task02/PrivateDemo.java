package oop.estafetbacklog03.task02;
/*
Program using private access modifier:

Create a class and demonstrate proper encapsulation techniques. The class will be called Printer.
It will simulate a real Computer Printer. It should have fields for toner level, number of pages printed, and also
whether it's a duplex printer (capable of printing on both sides of the paper).
Add methods to fill up the toner (up to a maximum of 100%), another method to simulate printing a page
(which should increase the number of pages printed).
 */

public class PrivateDemo {
    public static void main(String[] args) {

        Printer printer = new Printer(20, false);
        System.out.println(printer.getTonerLevel());

        printer.fillUpToner(50);
        System.out.println(printer.getTonerLevel());

        printer.printingPages(100);
    }
}
