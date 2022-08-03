package oop.estafetbacklog03.task01.demo;

/*
Program using protected access modifier.
 */

import oop.estafetbacklog03.task01.classes.printer.MultimediaPrinter;
import oop.estafetbacklog03.task01.classes.scanner.ScannerDevice;

public class ProtectedDemo {
    public static void main(String[] args) {
        MultimediaPrinter multimediaPrinter = new MultimediaPrinter(100,true);
        multimediaPrinter.scanAndPrint("This is the scanned and printed text.");
//        multimediaPrinter.content;
        ScannerDevice scannerDevice = new ScannerDevice();
//        scannerDevice.content;
    }
}
