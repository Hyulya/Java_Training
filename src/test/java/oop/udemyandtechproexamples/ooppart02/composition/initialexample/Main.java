package oop.udemyandtechproexamples.ooppart02.composition.initialexample;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5); // we created it as we needed it below
        Case theCase = new Case("220B","Dell", "240", dimensions); // the definition for case

                                                                                          // this time we didn't create a class:
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540,1440));
                                                                                          // if we don't need to create a variable
                                                                                          // and not gonna use it for anything else
                                                                                          // we only pass it to a method, that's the way

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus",4,6,"v2.44");

        // we created the PC class by passing the three objects
        PC thePc = new PC(theCase,theMonitor,theMotherboard);

        // How to access the method drawPixelAt(), loadProgramme(), pressPowerButton()?
        /*
         we're getting the class where the object was created, when we created the PC class
         so we are accessing it within the PC object and we're getting it to call the relevant method
         which is in that object, which is in the PC object we've created.
         */

        thePc.getMonitor().drawPixelAt(1500,2000,"red");
        thePc.getMotherboard().loadProgramme("Windows 1.0");
        thePc.getTheCase().pressPowerButton();

        // The difference between composition and inheritance:

        /* The composition here is the actual process of putting together a PC - so we created the objects from the base classes
         but accessing them via thePc object. We passed the elements needed to put together a computer to the constructor.
         The PC has a case, motherboard, and a monitor.
         This is how to decide whether to use inheritance or composition:
         IS-A relationship = inheritance (the computer is not a monitor/motherboard/case)
         HAS-A relationship = composition (the computer has a monitor/motherboard/case)
         */

        // Composition is like creating objects within objects

    }
}
