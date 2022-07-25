package oop.udemyandtechproexamples.ooppart01;

public class Theory {
    /* Reference vs Object vs Instance vs Class

    We have a real life example here - let's say we're building a house, then:
    - Class will be the blueprint for the house (plan) - we cam build as many houses as we want
    - Instance - each house built will be the new object known as instance (we're instantiating using new operator in Java)
    - Reference - this will be the address of the house, maybe given on a piece of paper. So we can copy it as many times as
      we want but the house will be still one.
      We can pass references as parameters to constructors and methods
     */

    /* this vs super
    - super:
    1) used to access/call the parent class members (variables and methods)
    2) commonly used with method overriding, when we call a method with the same name from the parent class;
       without the super keyword, we wouldn't be able to call the one in the parent class, it would stick to the one in the subclass

    - this:
    1) used to call current class members (variables and methods). Required when we have a param with the same name
    as the instance variable (field)
    2) commonly used with constructors and setters, optionally in getters.

    NOTES:
    - we can use both super and this keywords anywhere in a class except for the static areas (static block or static method)

     */

    /* this() vs super() call

    - these are calls - even they look like methods
    - this() - calls the constructor from another overloaded constructor in the same class
             - this() call can be used only in constructors and must be the first statement there
             - this() call is used for constructor chaining - i.e. when a constructor calls another one
               to avoid repetition of code

    - super() - calls the parent constructor
              - the Java Compiler puts a default call to super() if we don't add it - it's the no args super
                (constructor without arguments)
              - super() call must be the first statement in each constructor

     Notes:   - abstract classes have constructors, even the fact that we can't instantiate an abstract class
                using the new keyword
              - an abstract class is still a super class, so its constructors run when someone makes an instance of
                a concrete subclass

     IMPORTANT
     NOTE     - a constructor can have a call to super() OR this() but never both

     */

    /* Method Overloading vs Method Overriding

    1) Method Overloading
       - Providing two or more separate methods in a class with the same name but different parameters
       - Return type can be different or not, that allows us to reuse the same method name
       - Overloading reduces duplicated code, and we don't have to remember multiple method names
       - Overloading is considered as Compile Time Polymorphism - the compiler decides which method to be used
         based on the method name, return type and argument list
       - We can overload static and instance methods
       - Overloading happens inside a single class - but also in a subclass of a superclass. The subclass inherits
         one version of the method from the parent class and then the subclass can have an overloaded version of the method.

RULES  * Same method names
       * Different parameters

       Following the rules we may or may not have:
       * different return types
       * different access modifiers
       * throw different checked or unchecked exceptions

    2) Method Overriding
       - Means defining a method in a child class that already exists in the parent class with same signature (same name & arguments)
       - By extending the parent class , the child class gets all the methods from there (derived methods)
       - Overriding is considered as Runtime Polymorphism and Dynamic Method Dispatch, because the method that is going to
         be called is decided by the JVM
       - @Override should be put above the method definition. This annotation is read by the compiler and will show us an error
         if we don't follow the overriding rules correctly.
       - We can't override static methods, only instance ones.

RULES  * same name and same arguments
       * return type can be a subclass of the return type in the parent class
       * can't have a lower access modifier (parent method = protected, child method = private, but can't be public)

     */
}
