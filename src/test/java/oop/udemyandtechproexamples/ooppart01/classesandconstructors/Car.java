package oop.udemyandtechproexamples.ooppart01.classesandconstructors;

/*
fields = variables
*/

import java.util.Locale;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    // we create a method to update the model
    public void setModel (String model){
        String validModel=model.toLowerCase();
        if (validModel.equals("carrera")|| validModel.equals("commodore")) {
        this.model=model; //update the variable model with the content of the parameter model
            } else  {
            this.model="Unknown";
        }
    }

    public String getModel(){
        return this.model; //this is to e able to print the model in the Main class
    }
}
