package oop.udemyandtechproexamples.ooppart01.classesandconstructors;

public class PersonRunner {

    public static void main(String[] args) {
        PersonUdemy mommy = new PersonUdemy();
        mommy.setFirstName("Leman");
        mommy.setLastName("Aptish");
        mommy.setAge(55);
        System.out.println("My mommy's details:");
        System.out.println("First name: "+ mommy.getFirstName());
        System.out.println("Last name: "+mommy.getLastName());
        System.out.println("Full name: " + mommy.getFullName());
        System.out.println("Age: " + mommy.getAge());
    }
}
