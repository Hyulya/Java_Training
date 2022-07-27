package oop.estafetbacklog01.task05;
/*
Create a College class (with main method) and demonstrate the usage of the Student and StudentGroup classes
(create several students, add scholarship to some of them, and transfer some of them to a higher year.
Create several groups of students, add students to them, get the name of the best student from one of the groups...)
 */
public class College {
    public static void main(String[] args) {

        // Creating students
        Student student01 = new Student("Sarah Brown", "Maths", 17);
        student01.setGrade(3.8);

        Student student02 = new Student("Jim Tylor", "Maths", 17);
        student02.setGrade(3.5);

        Student student03 = new Student("Jenny Green", "Maths", 17);
        student03.setGrade(3);

        Student student04 = new Student("Glenn Elliot", "Maths", 18);

        Student student05 = new Student("Doug Butler", "Maths", 45);

        // Adding scholarship
        System.out.println("Scholarship status: " + student01.receiveScholarship(3, 100));
        System.out.println("Scholarship status: " + student05.receiveScholarship(2, 50));
        System.out.println();

        // Transferring to a higher year
        student02.upYear();
        System.out.println("Student's updated year: " + student02.getYearInCollege());
        student03.setDegree(true);
        student03.upYear();
        System.out.println();

        // Creating a student group
        StudentGroup studentGroup01 = new StudentGroup("Maths");

        // Adding students to the group
        studentGroup01.addStudent(student01);
        studentGroup01.addStudent(student02);
        studentGroup01.addStudent(student03);

        for (Student s : studentGroup01.getStudents()) {
            if (s != null)
                System.out.println(s);
        }
        System.out.println("Group subject is: " +studentGroup01.getGroupSubject());
        System.out.println();

        // Empty group
        System.out.println("The empty group: ");
        studentGroup01.emptyGroup();
        System.out.println();

        // Best student method
        Student[] students = {student01, student02, student03, student04};

        StudentGroup studentGroup02 = new StudentGroup();

        studentGroup02.setStudents(students);

        System.out.println("Best student's name: " +studentGroup02.theBestStudent());
        System.out.println();

        // Printing all students in the group
        System.out.println("All students in the group: ");
        studentGroup02.printStudentsInGroup();


    }
}
