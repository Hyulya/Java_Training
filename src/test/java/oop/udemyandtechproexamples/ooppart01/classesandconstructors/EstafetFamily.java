package oop.udemyandtechproexamples.ooppart01.classesandconstructors;

import oop.estafetbacklog01.task01.Person;

import java.util.Arrays;

public class EstafetFamily {

    private Person[] family;

    public EstafetFamily(Person[] family) {
        this.family = family;
    }

    public Person[] getFamily() {
        return family;
    }

    public void setFamily(Person[] family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "Family{" +
                "family=" + Arrays.toString(family) +
                '}';
    }
}
