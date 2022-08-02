package oop.estafetbacklog03.task02.demo;

/*
Program using protected access modifier:

It's just an extension of the previous task - ScannerDevice class created, and it's a superclass of the
MultimediaPrinter class. They're both in different packages to show the usage and way of working of the
protected access modifier.
 */

import oop.estafetbacklog03.task02.classes.printer.MultimediaPrinter;

public class ProtectedDemo {
    public static void main(String[] args) {
        String someText = "random text";
        MultimediaPrinter multimediaPrinter = new MultimediaPrinter(100,true);
        multimediaPrinter.scanAndPrint("some text");
//        multimediaPrinter.content; // to show that we can't access the field "content" - the ProtectedDemo
    }
}
