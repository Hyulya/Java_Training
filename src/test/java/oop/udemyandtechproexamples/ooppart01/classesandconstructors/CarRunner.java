package oop.udemyandtechproexamples.ooppart01.classesandconstructors;

public class CarRunner {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
//        System.out.println("Model is "+porsche.getModel()); // model is null
        porsche.setModel("911");
        System.out.println("Model is "+porsche.getModel()); // model is Carrera
    }
}
