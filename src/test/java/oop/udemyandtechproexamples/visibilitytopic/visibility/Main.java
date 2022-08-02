package oop.udemyandtechproexamples.visibilitytopic.visibility;


public class Main {
    public static void main(String[] args) {
        String varFour = "this is private to main()";

        Visibility visibility = new Visibility();
        visibility.useInner();
        Visibility.InnerClass innerClass = visibility.new InnerClass();
//        System.out.println("varThree is not accessible here "+innerClass.varThree);// varThree has now private access and has no
                                                                                   // visibility outside its class or a containing class
                                                                                   // of its class
//        System.out.println("scopeInstance varOne is "+ visibility.getVarOne());
//        System.out.println(varFour); // so it's in the scope of the class , i.e. in main
//
//        visibility.timesTwo(); // privateVar=2 , the scope is in the method, the scope makes sure that the narrowest one/most local one is used
//        System.out.println("********");
//        Visibility.InnerClass innerClass = visibility.new InnerClass();
//        innerClass.timesTwo();
    }
}
