package oop.udemyandtechproexamples.ooppart02.encapsulation.challengetask;

public class PrinterTeachersVersion {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplexPrinter;

    public PrinterTeachersVersion(int tonerLevel, boolean duplexPrinter) {
        validateToner(tonerLevel);
        this.duplexPrinter = duplexPrinter;
        this.pagesPrinted = 0;
    }

    private void validateToner(int tonerLevel){
        if(tonerLevel>-1 && tonerLevel <=100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel=-1;
        }
    }

    public int addToner(int tonerAmount) {
        if(tonerAmount>0 && tonerAmount<=100) {
            if (this.tonerLevel+tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel+=tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(this.duplexPrinter) {
            pagesToPrint = (pages/2) +(pages%2); // this is because we need to make sure that the odd number division is correct
                                                 // from the modulus operator we get the remainder and add it to get the right amount
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted+=pagesToPrint;
        return pagesPrinted;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
