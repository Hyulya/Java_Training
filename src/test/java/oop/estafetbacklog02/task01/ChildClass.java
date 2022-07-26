package oop.estafetbacklog02.task01;

public class ChildClass extends ParentClass {
    private int number;

    //Constructor
    public ChildClass(int numberValue) {
        super(numberValue);
        this.number=numberValue;
    }

    public int getNumber() {
        return number;
    }
}
