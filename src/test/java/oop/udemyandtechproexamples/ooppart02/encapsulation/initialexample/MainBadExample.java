package oop.udemyandtechproexamples.ooppart02.encapsulation.initialexample;

/*
Encapsulation is the mechanism that allows you to restrict access to certain components in the objects that we're creating.
So we're able to protect the members of a class from external access in order to really guard against unauthorized access.
Kind of hiding the inner working from an outside class - that way, we're able to change code in the inner class without breaking
any codes elsewhere.
 */

public class MainBadExample {
    public static void main(String[] args) {
        PlayerBadExample player = new PlayerBadExample();
        // we don't have a constructor, that's why this is the way we initialize those fields
        // and also - the scope that we set is "public" in the other class, that's why we can access the fields here in this class
        player.fullName ="Tim";
        player.health=20;
        player.weapon="Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health is "+ player.healthRemaining());

        damage=11;
        player.health=200; // this is something we added later, to show that these fields are accessible directly and
                           // potentially someone can access the class and we might not want to give them that access :)
        player.loseHealth(damage);
        System.out.println("Remaining health is "+ player.healthRemaining());

        /* Potential problems without having encapsulation:
        - in the class that we're calling the methods, we can change the fields directly
        - changing field names - if we need to change them, we need to do it on both classes (if we don't use refactor :) )
        - we might forget to assign values to the fields in the main class - where we run the code
         */


    }
}