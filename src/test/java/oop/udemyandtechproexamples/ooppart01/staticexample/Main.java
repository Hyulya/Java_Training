package oop.udemyandtechproexamples.ooppart01.staticexample;

public class Main {
    public static void main(String[] args) {
        Dog rex = new Dog("rex"); // creating instance rex
        Dog fluffy = new Dog("fluffy"); // creating instance fluffy
        rex.printName(); // fluffy is printed due to the variable being static - this is the last value assigned to it
        fluffy.printName(); // fluffy is printed
    }
}
