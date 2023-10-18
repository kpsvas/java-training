package com.java.training;

public class ArraysDemo {

    public static void main(String[] args) {

        // declares an Array of integers.
        int[] arr;

        // allocating memory for 5 integers.
        arr = new int[5];

        // initialize the elements of the array
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("index " + i + " : " + arr[i]);
        }

      /*  // Print all the array elements using for-each
        System.out.println("Print using foreach loop");
        for (int element: arr) {
            System.out.println(element);
        }
        // we can use any data type to create arrays. for example.
        String stringArray[] = new String[3];

        int ar[] = {4, 6, 1, 8, 3, 9, 7, 4, 2};
        // To print the elements in one line
        System.out.println(Arrays.toString(ar));

        //creating two matrices
        int a[][]={{1,3,4},{3,4,5}};
        int b[][]={{1,3,4},{3,4,6}};

        //creating another matrix to store the sum of two matrices
        int c[][] = new int[2][3];

        //adding and printing addition of 2 matrices
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println(); //new line
        }
        */

    }
}
