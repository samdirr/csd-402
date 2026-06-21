/*
Sam Dirr
CSD 402 Assignment 4.2
June 21, 2026
*/

import java.util.Arrays;

public class SamArrayAverage {

    public static void main(String[] args) {

        // Create four arrays of different data types and sizes
        short[] shortArray = {10, 20, 30};
        int[] intArray = {15, 25, 35, 45};
        long[] longArray = {100L, 200L, 300L, 400L, 500L};
        double[] doubleArray = {2.5, 4.5, 6.5, 8.5, 10.5, 12.5};

        // Display each original array and its average
        System.out.println("ARRAY AVERAGE RESULTS");
        System.out.println("---------------------");

        System.out.println("Short array:   " + Arrays.toString(shortArray));
        System.out.println("Average:       " + average(shortArray));
        System.out.println();

        System.out.println("Integer array: " + Arrays.toString(intArray));
        System.out.println("Average:       " + average(intArray));
        System.out.println();

        System.out.println("Long array:    " + Arrays.toString(longArray));
        System.out.println("Average:       " + average(longArray));
        System.out.println();

        System.out.println("Double array:  " + Arrays.toString(doubleArray));
        System.out.println("Average:       " + average(doubleArray));
    }

    // Calculate the average of a short array
    public static short average(short[] array) {
        int sum = 0;

        for (short value : array) {
            sum += value;
        }

        return (short) (sum / array.length);
    }

    // Calculate the average of an int array
    public static int average(int[] array) {
        int sum = 0;

        for (int value : array) {
            sum += value;
        }

        return sum / array.length;
    }

    // Calculate the average of a long array
    public static long average(long[] array) {
        long sum = 0;

        for (long value : array) {
            sum += value;
        }

        return sum / array.length;
    }

    // Calculate the average of a double array
    public static double average(double[] array) {
        double sum = 0.0;

        for (double value : array) {
            sum += value;
        }

        return sum / array.length;
    }
}