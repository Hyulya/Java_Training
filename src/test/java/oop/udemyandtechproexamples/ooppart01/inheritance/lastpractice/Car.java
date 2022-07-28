package oop.udemyandtechproexamples.ooppart01.inheritance.lastpractice;
/*
IS-A relationship - inheritance
 */
public class Car extends Vehicle {
    private int numberOfDoors;
    private int engineCapacity;

    public Car(String vehicleName, int numberOfDoors, int engineCapacity) {
        super(vehicleName);
        this.numberOfDoors = numberOfDoors;
        this.engineCapacity = engineCapacity;
    }
}
