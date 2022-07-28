package oop.udemyandtechproexamples.ooppart02.composition.initialexample;
/*
This is composition again - we created a new class PC.
It has a case -> theCase, has a monitor -> monitor, had a motherboard -> motherboard.

Here we can see that when we extend (inherit) we can do that from one class at a time,
like we can extend from only one class.
But here the PC comprises from the three other classes - has the three objects we created.
 */
public class PC {
    private Case theCase; // we use theCase because just case is a reserved keyword in Java!
    private Monitor monitor;
    private Motherboard motherboard;

    // here's our constructor that's going to create 3 different objects
    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
