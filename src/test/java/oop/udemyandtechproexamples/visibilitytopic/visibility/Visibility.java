package oop.udemyandtechproexamples.visibilitytopic.visibility;
/*
Contained class (as the previous example with Inner Class and the ScopeCheck Class - the containing class can access all fields and
methods of the contained class even they are private (and vice versa)
 */
public class Visibility {
    public int publicVar = 0;
    private int varOne = 1;

    public Visibility() {
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

    // Stuff added in the Visibility class:
    public void useInner(){
        InnerClass innerClass = new InnerClass();
        System.out.println("varThree from the outer class: " + innerClass.varThree);
    }

    public class InnerClass {
        private int varThree = 3;

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
