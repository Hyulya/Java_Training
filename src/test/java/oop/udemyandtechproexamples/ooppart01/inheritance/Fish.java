package oop.udemyandtechproexamples.ooppart01.inheritance;

public class Fish extends Animal{

    private int gills;
    private int eyes;
    private int fins;

    // If we extend the class fter adding the fields, when generating teh constructor we can add the additional fields easily
    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {

        super(name, 1,1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    // Unique methods for fish
    private void rest(){

    }
    private void moveMuscles(){

    }
    private void moveBackFin(){

    }
    private void swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}
