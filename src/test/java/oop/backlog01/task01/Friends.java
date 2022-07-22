package oop.backlog01.task01;

import java.util.Arrays;

public class Friends {

    private Person[] friends;

    public Friends(Person[] friends) {
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
