package oop.udemyandtechproexamples.visibilitytopic.scope;

public class ScopeCheckSecond {
    public int publicVar = 0;
    private int varOne = 1;

    public ScopeCheckSecond() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ": varOne = " + varOne);
    }

    public int getVarOne() {
        return varOne;
    }

    public void timesTwo() {
        int varTwo = 2; // this privateVar is in the scope
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " time two is " + i * varTwo); // with this keyword we can specify that we want the field
        }
        System.out.println("Value of i is..."); // the i is not in teh scope
    }

    public class InnerClass {
        public int varThree = 3;

        public InnerClass() {
            System.out.println("InnerClass created, varOne is " + varOne+ " and varThree is " + varThree);
        }

        public void timesTwo() {
            System.out.println("varOne is still available here " +varOne);
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " time three is " + varThree); // with ScopeCheck.this.privateVar keyword we can specify that we want the field from the ScopeCheck
            }
        }
    }
}
