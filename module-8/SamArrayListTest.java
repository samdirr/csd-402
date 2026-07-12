/*
 * Sam Dirr
 * CSD 402 Assignment 8.2
 * July 12, 2026
 */

import java.util.ArrayList;
import java.util.Scanner;

public class SamArrayListTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        System.out.println("Enter integers. Enter 0 to stop.");

        int value;

        do {
            System.out.print("Enter an integer: ");
            value = input.nextInt();
            numbers.add(value);
        } while (value != 0);

        Integer largestValue = max(numbers);

        System.out.println("The largest value in the ArrayList is " + largestValue + ".");
    }

    public static Integer max(ArrayList list) {
        if (list.isEmpty()) {
            return 0;
        }

        Integer largest = (Integer) list.get(0);

        for (int i = 1; i < list.size(); i++) {
            Integer currentValue = (Integer) list.get(i);

            if (currentValue > largest) {
                largest = currentValue;
            }
        }

        return largest;
    }
}