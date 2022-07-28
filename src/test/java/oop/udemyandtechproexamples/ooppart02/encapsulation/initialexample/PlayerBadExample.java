package oop.udemyandtechproexamples.ooppart02.encapsulation.initialexample;

public class PlayerBadExample {

    // we usually use private, but here there's a reason for using public
    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health=this.health-damage;
        if (this.health<=0){
            System.out.println("Player knocked out");
            //Reduce number of lives remaining for the player
        }
    }

    public int healthRemaining(){
        return this.health;
    }
}
