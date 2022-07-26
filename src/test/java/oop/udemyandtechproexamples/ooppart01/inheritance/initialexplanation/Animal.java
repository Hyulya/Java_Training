package oop.udemyandtechproexamples.ooppart01.inheritance.initialexplanation;
/*
Inheritance - Animal is the parent class, Dog is the inherited class. We use the keyword "extends"
 */
public class Animal {

    // These are the fields that are generic and valid for all animals
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    // Constructor
    public Animal(String name,int brain, int body, int size, int weight){
        this.name=name;
        this.brain=brain;
        this.body=body;
        this.size=size;
        this.weight=weight;
    }

    // We can introduce some methods as well
    public void eat(){
        System.out.println("Animal.eat() is called");
    }

    public void move(int speed) {
        System.out.println("Animal.move() is called. Animal is moving at: "+speed);
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
