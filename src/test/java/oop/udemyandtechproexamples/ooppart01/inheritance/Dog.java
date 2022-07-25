package oop.udemyandtechproexamples.ooppart01.inheritance;

public class Dog extends Animal{

    // We create fields that are unique for Dog's class - relating to a dog.
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // We need to generate a constructor - "super" keyword is calling teh constructor of the class that we are extending from.
    // The super class is the Animal class
    // Then we added manually the unique fields of the Dog class, also initialized the body and brain with 1
    public Dog(String name,int size, int weight,int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes=eyes;
        this.legs=legs;
        this.tail=tail;
        this.teeth=teeth;
        this.coat=coat;
    }

    // The methods from Animal are available here too (they are public) - we used the eat() method from the Animal class

    // But we can override the eat() with another method that is unique to the dog itself - chew()
    private void chew(){
        System.out.println("Dog.chew() is called");
    }

    // We can create override methods from the generator in IDE - we've chosen the eat() method and
    // added the println to show that this method is also called plus added the specific chew() to it
    // then we called the eat() from the super class (Animal) with the keyword "super"
    @Override
    public void eat() {
        System.out.println("Dog.eat() is called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() is called");
        super.move(5); // this means - don't try to execute the move() in the Override method but automatically go and
                             // search for the method in the super class (that's the meaning of the keyword "super" here
    }

    public void run(){
        System.out.println("Dog.run() is called");
        move(10); // this means - go and find the method in this class - it's in the Override method so it runs whatever
                        // is inside the method
    }
    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() is called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.moveLegs() is called");
        moveLegs(speed);
        super.move(speed);
    }
}
