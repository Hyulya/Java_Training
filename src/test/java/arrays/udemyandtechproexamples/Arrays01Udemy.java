package arrays.udemyandtechproexamples;

public class Arrays01Udemy {
    public static void main(String[] args) {

        // 1. way to initialize the array
        int[] myIntArray = new int[10];
        myIntArray[0]=45;
        myIntArray[1]=476;
        myIntArray[5]=50;

        double[] myDoubleArray = new double[10];
        System.out.println(myIntArray[5]);

        // 2. way to initialize the array
        int [] mySecondIntArray={1,2,3,4,5,6,7,8,9,10};
        System.out.println(mySecondIntArray[0]);
        System.out.println(mySecondIntArray[6]);
        System.out.println(mySecondIntArray[9]);

        // 3. way to initialize the array - with a loop

//        int [] myThirdIntArray = new int[10];
//        for (int i=0;i<10;i++) {
//            myThirdIntArray[i]=i*10;
//        }
//        for (int i=0; i<10; i++) {
//            System.out.println("Element " + i + ", value is " + myThirdIntArray[i]);
//        }

        // using .length makes the code dynamic - so we replace the 10 with .length

        int [] myThirdIntArray = new int[10];
        for (int i=0;i< myThirdIntArray.length;i++) {
            myThirdIntArray[i]=i*10;
        }
        printArray(myThirdIntArray); // calling the method

//        for (int i=0; i< myThirdIntArray.length; i++) {
//            System.out.println("Element " + i + ", value is " + myThirdIntArray[i]);
//        }
    }
    // now we can create a method and call the print loop
    public static void printArray(int[] array) {
        for (int i=0; i< array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }
}
