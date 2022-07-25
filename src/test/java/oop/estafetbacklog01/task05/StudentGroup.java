package oop.estafetbacklog01.task05;

import java.util.Arrays;

public class StudentGroup {

    private String groupSubject;
    private Student[] students;
    private int freePlaces;

     /*
      Default constructor that creates places for 5 students in the group
     (initializes the students field with a new array of 5 elements)
     and sets a value 5 on the freePlaces field.
     */

    public StudentGroup() {
        this.students = new Student[5];
        this.freePlaces = 5;
        this.groupSubject = "No subject yet";
    }

    /*
     Constructor StudentGroup(String subject) which first calls the default constructor
     and sets a value to the groupSubject field
     */

    public StudentGroup(String groupSubject) {
        this();
        this.groupSubject = groupSubject;
    }

    // Methods

    /*
    Method void addStudent(Student s) which adds a student to the group(add it to the array at the next empty position)
    if the specialty of the student matches that of the group, and if there are free places.
    After adding a student to the group, reduce the available seats in the group.
     */

    public void addStudent(Student s) {
        if (groupSubject.equals(s.getSubject()) && freePlaces > 0) {
            students[students.length - freePlaces] = s;
            freePlaces--;
        } else {
            System.out.println("The student couldn't be added.");
        }
    }

    /*
    Method void emptyGroup() which frees all seats in the group (set a new empty array for the students field)
    and assigns a value of 5 to the field freePlaces.
     */

    public void emptyGroup() {
        this.students = new Student[5];
        this.freePlaces = 5;
        System.out.println(Arrays.toString(students));
    }

    /*
    Method theBestStudent() - returns the name of the student with the highest grade in the group.
    */

    public String theBestStudent() {

        double highest = Double.MIN_VALUE;
        String name = null;
        for (Student eachStudent : students) {
            if (eachStudent.getGrade() > highest) {
                highest = eachStudent.getGrade();
                name = eachStudent.getName();
            }
        }
        return name;

    }

    /*
    Method printStudentsInGroup() - prints information (name, grade, ...) about all students in the course.
     */
    public void printStudentsInGroup() {

        for (Student eachStudent : students) {

            System.out.println(eachStudent);
        }
    }
    // creating toString() method and getters and setters

    public String getGroupSubject() {
        return groupSubject;
    }

    public void setGroupSubject(String groupSubject) {
        this.groupSubject = groupSubject;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getFreePlaces() {
        return freePlaces;
    }

    public void setFreePlaces(int freePlaces) {
        this.freePlaces = freePlaces;
    }

    @Override
    public String toString() {
        return "StudentGroup:" +
                "groupSubject='" + groupSubject + '\'' +
                ", students=" + Arrays.toString(students) +
                ", freePlaces=" + freePlaces;
    }
}