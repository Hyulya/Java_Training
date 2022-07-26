package oop.estafetbacklog02.task01;
/*Create TestClass with main method and inside of it:
        - Create an object of class ChildClass and call the instance variable and print it in the console.
        - Declare a superclass reference that is equal to the child class object and call the instance
          variable and print it in the console.
 */
public class TestClass {
    public static void main(String[] args) {

        // Create an object of class ChildClass and call the instance variable and print it in the console.
        ChildClass childClass = new ChildClass(10);
        System.out.println(childClass.getNumber());

        // Declare a superclass reference that is equal to the child class object and call the instance
        // variable and print it in the console.
        ParentClass parentClass = new ParentClass(10);
        System.out.println(parentClass.getNumber());
    }
}
