package oop.udemyandtechproexamples.ooppart01.staticexample;

public class Dog {
    private static String name;

    public Dog(String dogName) {
        Dog.name=dogName;
    }
    public void printName(){
        System.out.println("Dog's name = "+name);
    }

}
