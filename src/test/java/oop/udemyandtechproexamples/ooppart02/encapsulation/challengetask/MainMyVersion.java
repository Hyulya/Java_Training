package oop.udemyandtechproexamples.ooppart02.encapsulation.challengetask;

/*
Create a class and demonstrate proper encapsulation techniques. The class will be called Printer.
It will simulate a real Computer Printer. It should have fields for toner level, number of pages printed, and also
whether it;s a duplex printer (capable of printing on both sides of the paper).
Add methods to fill up the toner (up to a maximum of 100%), another method to simulate printing a page
(which should increase the number of pages printed).
Decide on the scope, whether to use constructors, and anything else you think is needed.
 */

public class MainMyVersion {
    public static void main(String[] args) {

        PrinterMyVersion printer = new PrinterMyVersion(20, 33, true);
        System.out.println(printer.getTonerLevel()); // 20

        printer.fillUpToner(90);
        System.out.println(printer.getTonerLevel());

        printer.printingPages(100);
    }
}
