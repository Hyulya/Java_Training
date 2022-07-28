package oop.udemyandtechproexamples.ooppart02.composition.initialexample;
/*
The case has got a model - has dimensions.
So again we have composition - we're creating something, an object that is part oof the case
 */
public class Case {
    private String model;
    private String manfacturer;
    private String powerSupply;
    private Dimensions dimensions;

    public Case(String model, String manfacturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manfacturer = manfacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManfacturer() {
        return manfacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
