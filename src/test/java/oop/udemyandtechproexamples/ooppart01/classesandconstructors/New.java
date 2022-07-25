package oop.udemyandtechproexamples.ooppart01.classesandconstructors;

public class New {
        public static void main(String[] args) {


            String arr[] = new String[5];
            System.out.println(arr.length);
            arr[0]="random";
            arr[1]="random2";
            System.out.println(arr[1]);
            int count=0;
            for(int i =0; i<arr.length; i++) {
                if(arr[i]!=null) {
                    count++;
                }
            }
            System.out.println("First free index is: "+(count));
        }
    }

