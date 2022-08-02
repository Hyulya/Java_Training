package oop.estafetbacklog03.task02.classes.printer;

import oop.estafetbacklog03.task02.classes.scanner.ScannerDevice;

public class MultimediaPrinter extends ScannerDevice {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplexPrinter;


    public MultimediaPrinter(int tonerLevel, boolean duplexPrinter) {
        validateToner(tonerLevel);
        this.duplexPrinter = duplexPrinter;
        this.pagesPrinted=0;
    }

    public MultimediaPrinter(int tonerLevel, int pagesPrinted, boolean duplexPrinter) {
        validateToner(tonerLevel);
        this.pagesPrinted = pagesPrinted;
        this.duplexPrinter = duplexPrinter;
    }

    private void validateToner(int tonerLevel){
        if(tonerLevel>=0 && tonerLevel <=100) {
            this.tonerLevel = tonerLevel;
        } else {
            System.out.println("Toner error.");
        }
    }

    public void fillUpToner(int fillingQuantity) {
        if (fillingQuantity+tonerLevel<=100){
            this.tonerLevel+=fillingQuantity;
            System.out.println("Toner filled successfully and current quantity is : " + (tonerLevel));
        } else {
            System.out.println("You're trying to fill the toner on the top of its capacity.");
        }
    }

    public void printingPages(int pagesToBePrinted) {
        if(!duplexPrinter) {
            pagesPrinted+=pagesToBePrinted;
        } else {
            pagesPrinted=((pagesPrinted+pagesToBePrinted)/2)+((pagesPrinted+pagesToBePrinted)%2);
        }
    }

    public void scanAndPrint(String text){
        System.out.println("Scanning pages");
        scan(text);
        System.out.println("Printing pages");
        System.out.println(content);
        printingPages(1);
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }


}
