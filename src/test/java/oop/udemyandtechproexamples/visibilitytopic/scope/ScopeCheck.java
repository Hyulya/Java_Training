package oop.udemyandtechproexamples.visibilitytopic.scope;

public class ScopeCheck {
    public int publicVar = 0;
    private int privateVar = 1;

    public ScopeCheck(){
        System.out.println("ScopeCheck created, publicVar = "+publicVar+ ": privateVar = "+privateVar);
    }

    public int getPrivateVar() {
        return privateVar;
    }

    public void timesTwo() {
        int privateVar = 2; // this privateVar is in the scope
        for (int i =0; i <10; i++ ) {
            System.out.println(i + " time two is " + i * privateVar); // with this keyword we can specify that we want the field
        }
        System.out.println("Value of i is..."); // the i is not in teh scope
    }

    public class InnerClass {
//        public int privateVar = 3;

        public InnerClass(){
            System.out.println("InnerClass created, privateVar is "+ privateVar);
        }
        public void timesTwo() {
            //we can call the method timeTwo() from the ScopeCheck class too:
            ScopeCheck.this.timesTwo();
            for (int i =0; i <10; i++ ) {
                System.out.println(i + " time three is " + i * privateVar); // with ScopeCheck.this.privateVar keyword we can specify that we want the field from the ScopeCheck
            }
        }
    }
}
