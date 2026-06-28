/*
Sam Dirr
CSD 402 Assignment 5
June 27, 2026
*/

import java.util.Arrays;

public class SamLocateArray {

    public static void main(String[] args) {
        int[][] intArray = {
                {12, 4, 8},
                {3, 22, 7},
                {14, 6, 1}
        };

        double[][] doubleArray = {
                {2.5, 4.8, 1.2},
                {9.4, 3.3, 6.7},
                {5.1, 0.9, 8.6}
        };

        System.out.println("INTEGER ARRAY");
        displayArray(intArray);
        System.out.println("Largest location:  " + Arrays.toString(locateLargest(intArray)));
        System.out.println("Smallest location: " + Arrays.toString(locateSmallest(intArray)));
        System.out.println();

        System.out.println("DOUBLE ARRAY");
        displayArray(doubleArray);
        System.out.println("Largest location:  " + Arrays.toString(locateLargest(doubleArray)));
        System.out.println("Smallest location: " + Arrays.toString(locateSmallest(doubleArray)));
    }

    // Return the row and column location of the largest double value.
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = {0, 0};
        double largest = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {
                if (arrayParam[row][column] > largest) {
                    largest = arrayParam[row][column];
                    location[0] = row;
                    location[1] = column;
                }
            }
        }

        return location;
    }

    // Return the row and column location of the largest integer value.
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = {0, 0};
        int largest = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {
                if (arrayParam[row][column] > largest) {
                    largest = arrayParam[row][column];
                    location[0] = row;
                    location[1] = column;
                }
            }
        }

        return location;
    }

    // Return the row and column location of the smallest double value.
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = {0, 0};
        double smallest = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {
                if (arrayParam[row][column] < smallest) {
                    smallest = arrayParam[row][column];
                    location[0] = row;
                    location[1] = column;
                }
            }
        }

        return location;
    }

    // Return the row and column location of the smallest integer value.
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = {0, 0};
        int smallest = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {
                if (arrayParam[row][column] < smallest) {
                    smallest = arrayParam[row][column];
                    location[0] = row;
                    location[1] = column;
                }
            }
        }

        return location;
    }

    // Display the values in an integer two-dimensional array.
    public static void displayArray(int[][] arrayParam) {
        for (int[] row : arrayParam) {
            System.out.println(Arrays.toString(row));
        }
    }

    // Display the values in a double two-dimensional array.
    public static void displayArray(double[][] arrayParam) {
        for (double[] row : arrayParam) {
            System.out.println(Arrays.toString(row));
        }
    }
}
