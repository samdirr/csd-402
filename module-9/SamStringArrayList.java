/*
 * Sam Dirr
 * CSD 402 Assignment 9.2
 * July 19, 2026
 */

import java.util.ArrayList;
import java.util.Scanner;

public class SamStringArrayList {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<String>();

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        animals.add("Rabbit");
        animals.add("Turtle");
        animals.add("Hamster");
        animals.add("Parrot");
        animals.add("Goldfish");
        animals.add("Lizard");
        animals.add("Guinea pig");

        System.out.println("Animals in the ArrayList:");

        // A for-each loop prints every String in the collection.
        for (String animal : animals) {
            System.out.println(animal);
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the element number you would like to see again (1-10): ");

        // The user's response is first stored as a String.
        String userInput = input.nextLine();

        try {
            // Convert the String to an int, then autobox the int as an Integer.
            int parsedElement = Integer.parseInt(userInput);
            Integer selectedElement = parsedElement;

            // The Integer is automatically converted to an int (auto-unboxing).
            int index = selectedElement - 1;
            System.out.println("You selected: " + animals.get(index));
        } catch (NumberFormatException | IndexOutOfBoundsException exception) {
            System.out.println("An Exception has been thrown: Out of Bounds");
        }

        input.close();
    }
}
