package oop.udemyandtechproexamples.ooppart02.encapsulation.challengetask;

public class PrinterMyVersion {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplexPrinter;

    public PrinterMyVersion(int tonerLevel, int pagesPrinted, boolean duplexPrinter) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.duplexPrinter = duplexPrinter;
    }

    public void fillUpToner(int fillingQuantity) {
        if(tonerLevel<100 && tonerLevel>=0) {
            if (fillingQuantity+tonerLevel<=100){
                System.out.println("Toner filled successfully and current quantity is : " + (fillingQuantity+tonerLevel));
            } else {
                System.out.println("You're trying to fill the toner on the top of its capacity.");
            }
        } else {
            System.out.println("Toner already filled.");
        }
    }

    public void printingPages(int pagesToBePrinted) {
        if(!duplexPrinter) {
            pagesPrinted+=pagesToBePrinted;
            System.out.println("The total number of printed pages with single page printing is: "+pagesPrinted);
        } else {
            pagesPrinted=((pagesPrinted+pagesToBePrinted)/2)+((pagesPrinted+pagesToBePrinted)%2) ;
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
