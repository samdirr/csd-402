/*
Sam Dirr
CSD 402 Assignment 2
June 14, 2026
 */

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int computerSelection = (int) (Math.random() * 3) + 1;

        System.out.println("Rock-Paper-Scissors");
        System.out.println("1 = Rock, 2 = Paper, 3 = Scissors");
        System.out.print("Enter your selection: ");
        int userSelection = input.nextInt();

        while (userSelection < 1 || userSelection > 3) {
            System.out.print("Invalid selection. Enter 1, 2, or 3: ");
            userSelection = input.nextInt();
        }

        String computerChoice = "";
        String userChoice = "";

        switch (computerSelection) {
            case 1:
                computerChoice = "Rock";
                break;
            case 2:
                computerChoice = "Paper";
                break;
            case 3:
                computerChoice = "Scissors";
                break;
        }

        switch (userSelection) {
            case 1:
                userChoice = "Rock";
                break;
            case 2:
                userChoice = "Paper";
                break;
            case 3:
                userChoice = "Scissors";
                break;
        }
        System.out.println("Computer selected: " + computerChoice);
        System.out.println("You selected: " + userChoice);

        if (computerSelection == userSelection) {
            System.out.println("Result: It is a tie!");
        } else if (
                (userSelection == 1 && computerSelection == 3) ||
                        (userSelection == 2 && computerSelection == 1) ||
                        (userSelection == 3 && computerSelection == 2)
        ) {
            System.out.println("Result: You win!");
        } else {
            System.out.println("Result: Computer wins!");
        }

        input.close();
    }
}