package oop.estafetbacklog03.task02;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        validateToner(tonerLevel);
        this.duplexPrinter = duplexPrinter;
        this.pagesPrinted = 0;
    }

    public Printer(int tonerLevel, int pagesPrinted, boolean duplexPrinter) {
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
            System.out.println("The total number of printed pages with single page printing is: "+pagesPrinted);
        } else {
            pagesPrinted=((pagesPrinted+pagesToBePrinted)/2)+((pagesPrinted+pagesToBePrinted)%2);
            System.out.println("The total number of printed pages with duplex page printing is: "+pagesPrinted);
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }


}