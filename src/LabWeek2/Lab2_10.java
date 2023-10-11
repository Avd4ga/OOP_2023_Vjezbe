package LabWeek2;

import java.util.Random;
import java.util.Scanner;

public class Lab2_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int targetNumber = drawNumber(random);
        int numberOfGuesses = 0;

        while (true) {
            System.out.print("Guess the number: ");
            int userGuess = scanner.nextInt();
            numberOfGuesses++;

            if (userGuess < targetNumber) {
                System.out.println("Moree!!");
            } else if (userGuess > targetNumber) {
                System.out.println("Less!!");
            } else {
                System.out.println("The guess is correct!");
                System.out.println("You guessed the number in " + numberOfGuesses );
                break;
            }
        }

        scanner.close();
    }


    public static int drawNumber(Random random) {
        return random.nextInt(101);
    }


    }

