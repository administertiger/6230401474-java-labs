/*
Author: Surapat Pongsuwan
ID: 623040147-4
Sec: 2
Date: December 23, 2019
*/

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {

        System.out.println("Welcome to a number guessing game!");


        //random number
        Random number = new Random();
        int randomNumber = number.nextInt(10)+1; //receiever


        //Scanner of number
        Scanner input = new Scanner(System.in);


        int count = 0;


        //get in loop
        for (int i=0; i<5; i++) {
            System.out.print("Enter an integer between 1 and 10:");
            int guess = input.nextInt();
            count++;

            if (guess == randomNumber) {
                System.out.println("Congretulation!");
                System.out.println("You have tried " + count + " times.");
                System.exit(0);
            }
            else if (guess > randomNumber) {
                System.out.println("Try a lower number!");
            }
            else if (guess < randomNumber) {
                System.out.println("Try a higher number!");
            }
        }


        if (count == 5) {
            System.out.println("You have tried " + count + " times. You ran out of guesses");
        }

        else {
            System.out.println("You have tried " + count + " times");
        }
        
        System.out.println("The Answer is " + randomNumber);
    }
}