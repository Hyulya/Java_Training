package oop.estafetbacklog01.task02;

import java.time.LocalDate;

/*
Create a class that has a method displaying the current date.
Let this method return a value (you can use Java Date and Time from the "Useful resources"
section in the story). The result returned from the method to be used by another class which
displays it in the console.
 */
public class CurrentDate {

    public LocalDate getCurrentDate() {
        LocalDate myDateObject = LocalDate.now();
        return myDateObject;
    }
}
