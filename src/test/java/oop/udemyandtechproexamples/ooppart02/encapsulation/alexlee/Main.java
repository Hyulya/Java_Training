package oop.udemyandtechproexamples.ooppart02.encapsulation.alexlee;

// Encapsulation's aim is to make using the object simpler for the user
// It's about creating our object class and having the fields private, then having getters and setters
// to be able to set the values and then get them and print them

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Suzie");
        s.setAge(24);
        System.out.println(s.getName());
        System.out.println(s.getAge());

    }
}
