package arrays;

import java.util.Arrays;

public class Arrays01 {
    /* 1. What is an Array?:
       - an object containing a fixed number of values of the same type.
       - elements in the arrays are indexed

       2. What is the size of the Array? (can we increase the size of the Array?)
       - it's fixed and pre-defined - we can't increase the size of the array

       3. What is an Array element and how to access a specific element?
       - array elements are accessed through the index
    */

    public static void main(String[] args) {

        // Create an empty array with a size of 2 - add elements.

        int arr1[]=new int[2];
        arr1[0]=11;
        arr1[1]=22;
        System.out.println(Arrays.toString(arr1));

        // Create an array with values added during the initialization ({value0, value1, ...}).

        int arr2[]={111,222};
        System.out.println(Arrays.toString(arr2));

        // Read an array from the console and find the numbers that are a multiple of 3 from the array.

        int arr3[]={10,66,12,417,5};
        for (int element : arr3) {
            if ((element % 3 == 0)) {
                System.out.print(element + " ");
            }
        }
}}
