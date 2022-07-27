package oop.udemyandtechproexamples.ooppart01.classesandconstructors;

import oop.estafetbacklog01.task01.Person;

import java.util.Arrays;

public class EstafetFriends {
    private Person[] friends;

    public EstafetFriends(Person[] friends) {
        this.friends = friends;
    }

    public Person[] getFriends() {
        return friends;
    }

    public void setFriends(Person[] friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Friends{" +
                "friends=" + Arrays.toString(friends) +
                '}';
    }
}
