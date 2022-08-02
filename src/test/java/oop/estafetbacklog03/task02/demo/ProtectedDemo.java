package oop.estafetbacklog03.task02.demo;

import oop.estafetbacklog03.task02.classes.printer.MultimediaPrinter;

public class ProtectedDemo {
    public static void main(String[] args) {
        String someText = "random text";
        MultimediaPrinter multimediaPrinter = new MultimediaPrinter(100,true);
        multimediaPrinter.scanAndPrint("some text");
//        multimediaPrinter.content;
    }
}
