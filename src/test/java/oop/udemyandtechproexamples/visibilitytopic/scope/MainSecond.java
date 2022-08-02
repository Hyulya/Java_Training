package oop.udemyandtechproexamples.visibilitytopic.scope;

public class MainSecond {
    public static void main(String[] args) {
        String varFour = "this is private to main()";
        ScopeCheckSecond scopeInstance = new ScopeCheckSecond();
        System.out.println("scopeInstance varOne is "+ scopeInstance.getVarOne());
        System.out.println(varFour); // so it's in the scope of the class , i.e. in main

        scopeInstance.timesTwo(); // privateVar=2 , the scope is in the method, the scope makes sure that the narrowest one/most local one is used
        System.out.println("********");
        ScopeCheckSecond.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();
    }
}
