package basic.java_cursor.education;

import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.sort;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //Create an array of random numbers
        //Sorting an array of integers in ascending order:
        int[] arr = new int[25];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + "  ");
        }
        System.out.print("\nSorted: \n");
        //Sorting the array
        sort(arr);
        //We output the sorted array to the console.
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        // Sorting an array of integers in descending order:

        Integer[] arr2 = new Integer[25];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int) (Math.random() * 100);
            System.out.print(arr2[i] + "  ");
        }
        System.out.print("\nSorted: \n");
        //Sorting the array
        Arrays.sort(arr2, Collections.reverseOrder());
        //Sorting an array of integers in descending order:
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "  ");
        }
    }
}
