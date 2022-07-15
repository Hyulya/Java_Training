package arrays.udemyandtechproexamples;

public class FindLargestFindSmallestInAnArray {

    public static void main(String[] args) {
        int large, small, i;
        int[] a = new int[]{10, 66, 12, 417, 5};
        int n = a.length;
        large = small = a[0];
        for (i = 1; i < n; ++i) {
            if (a[i] > large)
                large = a[i];

            if (a[i] < small)
                small = a[i];
        }

        System.out.print("The smallest element is " + small);
        System.out.print("The largest element is " + large);
    }
}

