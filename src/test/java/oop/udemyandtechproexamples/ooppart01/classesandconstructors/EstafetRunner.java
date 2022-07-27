package oop.udemyandtechproexamples.ooppart01.classesandconstructors;

import oop.estafetbacklog01.task01.Person;

public class EstafetRunner {
    public static void main(String[] args) {

        // Creating some friends from the Person class

        Person bestFriend = new Person("Bilyana", "Vencheva", 32, 1.60, 45, "female");
        Person justFriend = new Person("Ivan", "Ivanov", 35, 1.90, 90, "male");

        Person[] persons = {bestFriend, justFriend};
        EstafetFriends friends = new EstafetFriends(persons);
        System.out.println("Friends: " + friends);

        // Creating some family members from the Person class

        Person mom = new Person("Leman", "Aptish", 56, 1.60, 70, "female");
        Person dad = new Person("Ertan", "Aptish", 56, 1.80, 80, "male");

        Person[] familyPersons = {mom, dad};
        EstafetFamily family = new EstafetFamily(familyPersons);
        System.out.println("Family: " + family);
    }
}
