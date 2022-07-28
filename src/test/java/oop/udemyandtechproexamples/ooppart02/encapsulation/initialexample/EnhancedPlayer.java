package oop.udemyandtechproexamples.ooppart02.encapsulation.initialexample;

public class EnhancedPlayer {
// What we did here is encapsulation - we made our fields private, our class is not accessible or fields within the class
// are not accessible to any classes that are outside.
    private String fullName;
    private int hitPoints=100;
    private String weapon;
    public EnhancedPlayer(String fullName, int hitPoints, String weapon) {
        this.fullName = fullName;
        if (hitPoints <0 && hitPoints <=100) { //that's the validation
            this.hitPoints = hitPoints;
        }
        this.weapon = weapon;
    }

    public int getHealth() {
        return hitPoints;
    }
}
