package oop.udemyandtechproexamples.visibilitytopic.challengetask;

import java.util.Scanner;

public class X {

    private int x;

    // The optional extra - where the Scanner is also x:
        public X(Scanner x) {
            System.out.println("Please enter a number: ");
            this.x = x.nextInt();
    }

//    public X(int x) {
//        this.x = x;
//    }

    public void x() {
        for (int x=1; x<13; x++){
            System.out.println(x + " times " + this.x + " equals " + x * this.x);
        }
    }
}
