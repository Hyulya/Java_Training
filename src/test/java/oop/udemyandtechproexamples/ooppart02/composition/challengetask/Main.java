package oop.udemyandtechproexamples.ooppart02.composition.challengetask;
/*
Create a single room of a house using composition.
Think about the things that should be included in the room.
Maybe physical parts of the house but furniture as well.
Add at least one method to access an object via getter and
then add objects public method as you saw in the previous video.
Then add at least one method to hide the object e.g. not using getter,
but to access the object used in composition within the main class,
like in the last video.
 */

public class Main {

    public static void main(String[] args) {

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(200, "white");
        Bed bed = new Bed("Modern", 4, 3, 2, 1);
        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedRoom = new Bedroom("Tims", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedRoom.makeBed();

        bedRoom.getLamp().turnOn();
    }
}
