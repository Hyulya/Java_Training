package oop.estafetbacklog02.task01;
/*
Create a class ‘ParentClass’ and declare an instance varable of type int.
Create another class ‘ChildClass’ and declare same varable of type int
wtih the same name but with different value. Inherite the ParentClass in the ChildClass.

 */
public class ParentClass {
    private int number;

    //Constructor
    public ParentClass(int numberValue) {
        this.number = numberValue;
    }

    public int getNumber() {
        return number;
    }
}
