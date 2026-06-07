/*
Sam Dirr
CSD 402 Assignment 1.3
June 07, 2026
 */

import java.util.Scanner;

public class WaterHeatingEnergy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();

        System.out.print("Enter the initial temperature in Celsius: ");
        double initialTemperature = input.nextDouble();

        System.out.print("Enter the final temperature in Celsius: ");
        double finalTemperature = input.nextDouble();

        double energy = waterMass * (finalTemperature - initialTemperature) * 4184;

        System.out.printf("The energy needed is %.2f joules.%n", energy);

        input.close();
    }
}
