package oop.udemyandtechproexamples.visibilitytopic.scope;

public class Main {
    public static void main(String[] args) {
        String privateVar = "this is private to main()";
        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("scopeInstance privateVar is "+ scopeInstance.getPrivateVar());
        System.out.println(privateVar); // so it's in the scope of the class , i.e. in main

        scopeInstance.timesTwo(); // privateVar=2 , the scope is in the method, the scope makes sure that the narrowest one/most local one is used
        System.out.println("********");
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();

    }
}
