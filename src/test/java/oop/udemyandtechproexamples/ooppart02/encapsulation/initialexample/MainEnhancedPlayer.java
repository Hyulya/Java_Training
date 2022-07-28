package oop.udemyandtechproexamples.ooppart02.encapsulation.initialexample;

public class MainEnhancedPlayer {
    public static void main(String[] args) {
        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Bob", 40,"Sword");
        System.out.println("Initial health is : "+enhancedPlayer.getHealth()); // we use a getter here as our access modifier is private
                                                  // we changed the name of the health field but the getter was the same - no problems
                                                  // it works fine, that's a benefit from the encapsulation
    }
}
