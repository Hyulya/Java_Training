package oop.udemyandtechproexamples.ooppart02.encapsulation.challengetask;

public class MainTeachersVersion {
    public static void main(String[] args) {

        // we are using encapsulation with our constructor and getter here - we're not accessing the field directly
        // which is a correct encapsulation technique
        PrinterTeachersVersion printer = new PrinterTeachersVersion(50, false);
        System.out.println("Initial page count is: " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was "+ pagesPrinted+ " new total print count for printer = "+printer.getPagesPrinted());
        pagesPrinted=printer.printPages(2);
        System.out.println("Pages printed was "+ pagesPrinted+ " new total print count for printer = "+printer.getPagesPrinted());

    }
}