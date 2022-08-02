package oop.estafetbacklog03.task01.classes.scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        ScannerDevice scannerDevice = new ScannerDevice();
        scannerDevice.scan("Protected access modifier test in the same package");
        System.out.println(scannerDevice.content);
    }
}