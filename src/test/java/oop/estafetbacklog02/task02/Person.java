package oop.estafetbacklog02.task02;
/*
Create a class Person with variables:
- name - type String and declare that variable to be static
- age - type Int
Declare values to the created variables. Create another class TestPerson with main method inside of it
and execute the following:
- call the static variable from Person class and assign it to a local variable and print the value in the console
- create final method in Person class that prints the age
- extend the Person class and override the final method
 */


public class Person extends ParentPerson {

    static String name;
    int age;

    public Person(int personAge) {
        this.age = personAge;
    }

    public static String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public final void printAge(){
        System.out.printf("Age is %s%n", this.age);
    }
}
