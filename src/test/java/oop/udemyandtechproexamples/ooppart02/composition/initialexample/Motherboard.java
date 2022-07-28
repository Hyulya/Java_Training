package oop.udemyandtechproexamples.ooppart02.composition.initialexample;

/*
IS-A relationship - inheritance
HAS-A relationship - composition
 */

public class Motherboard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int carSlots;
    private String bios;

    public Motherboard(String model, String manufacturer, int ramSlots, int carSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.carSlots = carSlots;
        this.bios = bios;
    }

    public void loadProgramme(String programmeName){
        System.out.println("Program " + programmeName+ " is loading...");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCarSlots() {
        return carSlots;
    }

    public String getBios() {
        return bios;
    }
}
