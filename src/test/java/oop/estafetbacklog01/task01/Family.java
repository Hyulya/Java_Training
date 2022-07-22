package oop.estafetbacklog01.task01;

import java.util.Arrays;

public class Family {

    private Person[] family;

    public Family(Person[] family) {
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