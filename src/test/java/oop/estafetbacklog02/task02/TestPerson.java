package oop.estafetbacklog02.task02;

public class TestPerson {
    public static void main(String[] args) {

        // call the static variable from Person class and assign it to a local variable and print the value in the console
        String personName = Person.name;
        System.out.println(personName);

        // create final method in Person class that prints the age
        Person firstPerson = new Person(32);
        firstPerson.printAge();

        // extend the Person class and override the final method
        ParentPerson parentPerson = new ParentPerson();
        parentPerson.printAge();

        //NOTE: Final methods cannot be overridden!
    }
}
