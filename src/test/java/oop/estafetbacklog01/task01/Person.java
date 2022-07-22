package oop.estafetbacklog01.task01;

/*
 Task 1 - Create a class to model a person. Let's assume that a person has a first name,
 last name, age, height (in centimetres), weight (in kilograms as a decimal fraction),
 and sex. Let this person have a family and a list of friends.
 Think about how you will express:
 person -> family
 person -> relationship friends
  */

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private double height;
    private double weight;
    private String sex;

    public Person(String firstName, String lastName, int age, double height, double weight, String sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.sex = sex;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", sex='" + sex + '\'' +
                '}';
    }
}
