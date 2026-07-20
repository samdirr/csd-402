/*
 * Sam Dirr
 * CSD 402 Assignment 9.2
 * July 19, 2026
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class SamDataFile {
    public static void main(String[] args) {
        File dataFile = new File("data.file");
        Random random = new Random();

        try {
            // FileWriter creates data.file when needed and appends when it exists.
            try (PrintWriter output = new PrintWriter(new FileWriter(dataFile, true))) {
                for (int i = 0; i < 10; i++) {
                    output.print(random.nextInt(100) + 1);
                    output.print(" ");
                }
            }

            // Reopen the file, read all its data, and display each integer.
            System.out.println("Numbers stored in data.file:");

            try (Scanner fileInput = new Scanner(dataFile)) {
                while (fileInput.hasNextInt()) {
                    System.out.print(fileInput.nextInt() + " ");
                }
            }

            System.out.println();
        } catch (IOException exception) {
            System.out.println("An error occurred while working with data.file.");
            System.out.println(exception.getMessage());
        }
    }
}
