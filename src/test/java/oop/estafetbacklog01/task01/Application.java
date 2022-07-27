package oop.estafetbacklog01.task01;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        // Creating some friends from the Person class

        Person bestFriend = new Person("Bilyana", "Vencheva", 32, 1.60, 45, "female");
        Person justFriend = new Person("Ivan", "Ivanov", 35, 1.90, 90, "male");

        Person[] persons = {bestFriend, justFriend};

        // Creating some family members from the Person class

        Person mom = new Person("Leman", "Aptish", 56, 1.60, 70, "female");
        Person dad = new Person("Ertan", "Aptish", 56, 1.80, 80, "male");

        Person[] familyPersons = {mom, dad};

        // Creating a person and assigning a family or friends to him/her - i.e. creating the relationship between them
        // (using array of objects)
        Person myself = new Person("Hyulya","Gyuler",32,1.60,75,"female");

        myself.setFamily(familyPersons);
        myself.setFriends(persons);

        System.out.println(Arrays.toString(myself.getFamily()));
        System.out.println(Arrays.toString(myself.getFriends()));

        // Creating a person and assigning a family or friends to him/her - i.e. creating the relationship between them
        // (using single objects)

        myself.setDad(dad);
        myself.setMom(mom);

        System.out.println(myself.getDad());
        System.out.println(myself.getMom());

    }
}