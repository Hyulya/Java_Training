package oop.estafetbacklog01.task01;

public class Application {
    public static void main(String[] args) {

        // Creating some friends from the Person class

        Person bestFriend = new Person("Bilyana", "Vencheva", 32, 1.60, 45, "female");
        Person justFriend = new Person("Ivan", "Ivanov", 35, 1.90, 90, "male");

        Person[] persons = {bestFriend, justFriend};
        Friends friends = new Friends(persons);
        System.out.println("Friends: " + friends);

        Person mom = new Person("Leman", "Aptish", 56, 1.60, 70, "female");
        Person dad = new Person("Ertan", "Aptish", 56, 1.80, 80, "male");

        Person[] familyPersons = {mom, dad};
        Family family = new Family(familyPersons);
        System.out.println("Family: " + family);
    }
}