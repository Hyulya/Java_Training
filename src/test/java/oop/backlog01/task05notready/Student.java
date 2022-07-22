package oop.backlog01.task05notready;

public class Student {

    // Fields:
    private String name;
    private String subject;
    private double grade;
    private int yearInCollege;
    private int age;
    private boolean isDegree;
    private double scholarshipMoney;


    // Default constructor that sets the following values to fields:
    // grade = 4.0, yearInCollege = 1, isDegree = false, money = 0
    public Student() {
        this.grade = 4;
        this.yearInCollege = 1;
        this.isDegree = false;
        this.scholarshipMoney = 0;
    }

    // Constructor with parameters that calls the default constructor and
    // initializes(sets initial values)the remaining fields of the class
    public Student(String name, String subject, int age) {
        this();
        this.name = name;
        this.subject = subject;
        this.age = age;
        System.out.println("Second constructor.");
    }

    @Override
    public String toString() {
        return "Student: " +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", grade=" + grade +
                ", yearInCollege=" + yearInCollege +
                ", age=" + age +
                ", isDegree=" + isDegree +
                ", scholarshipMoney=" + scholarshipMoney;
    }

    // Methods

    /*
     void upYear() method that increments the college year by one if the student has not graduated.
     If the student has graduated print an appropriate message. If after incrementing the year becomes 4,
     sets true to the isDegree field.
     */

    public void upYear() {
        if (!isDegree) {
            yearInCollege++;
            if (yearInCollege==4) {
                isDegree=true;
            }
        } else {
            System.out.println("The student has already graduated.");
        }


    /*
    Method double receiveScholarship(double min, double amount) – adds the amount the money of the student -
    only if his success rate is higher or equal to the minimum success passed as a parameter (min) and if
    his age is under 30 years old. The method returns the current money to the student (after their eventual raise)
     */

//    public double receiveScholarship(double min, double amount) {
//        return
//    }
    }
}

