package oop.udemyandtechproexamples.ooppart01.inheritance.javatpoint;

class Bike{
    final int speedlimit=90;//final variable
//    void run(){
//        speedlimit=400; //--> we can't do that as the speedlimit is final, the variable can't be changed!
//    }
    public static void main(String args[]){
        Bike obj=new  Bike();
//        obj.run();
    }
}

/* FINAL keyword:
   - a final variable is a constant - can't be changed
   - a final method can't be overridden
   - a final class can't be extended
   - final methods can be inherited but can't be overridden
   - blank final variable = not initialized at the time of declaration
   - blank variables can be initialized in constructors
   -
 */