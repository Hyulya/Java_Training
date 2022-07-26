package oop.estafetbacklog01.task02;

public class Main {
    public static void main(String[] args) {
        CurrentDate myDate = new CurrentDate();
        CurrentDatePrint datePrint = new CurrentDatePrint();
        datePrint.printDate(myDate.getCurrentDate());
    }
}
