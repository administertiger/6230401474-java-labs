package pongsuwan.surapat.lab3;

/*
Author: Surapat Pongsuwan
ID: 623040147-4
Section: 2
Date: December 28,2019
*/

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingConfigurableGame {
    public static void main(String[] args) {
        configure();
        genAnswer();
        playGame();
    }


    //Scanner for every part
    static Scanner input = new Scanner(System.in);


    //Various values
    static int max;
    static int min;
    static int tries;
    

    //The answer of the game
    static int answer;

    

    static void configure() 
    {
        //minimum value
        System.out.print("Enter the min value: ");
        min = input.nextInt();
        
        //maximum value
        System.out.print("Enter the max value: ");
        max = input.nextInt();

        //number of tries
        System.out.print("Enter the maximum number of tries: ");
        tries = input.nextInt();
    }

    
    static void genAnswer() 
    {
        Random random = new Random();
        answer = random.nextInt(max - min + 1) + min;
    }

    
    static void playGame() 
    { 
        boolean continueGame = true;  //the flag of boolean to check that you want to restart or not

        while (continueGame == true) 
        {
            System.out.println("Welcome to a number guessing game!");

            boolean win = false; //while worong guessing, win == false

            int count = 0;

            while (win == false) 
            {
                System.out.print("Enter number between " + min + " and " + max + ": ");
                

                int guess = input.nextInt();

                if (count == tries) {
                    System.out.println("You have tried " + count + " times. You ran out of guesses");
                    System.out.println("The answer is " + answer);
                    break;
                }

                if (guess < min || guess > max) {
                    System.out.println("The number must be between " + min + " and " + max);
                }

                else {
                    if (guess < answer) {
                        System.out.println("Try a higher numer!");
                        count++;

                    }
                    else if (guess > answer) {
                        System.out.println("Try a lower number!");
                        count++;

                    }
                    else {
                        count++;
                        System.out.println("Congratulation!");
                        System.out.println("You have tried " + count + " times. You ran out of guesses");
                        System.out.println("The answer is " + answer);
                        win = true;  
                    }
                }
            }
            
            System.out.println("Want to plat again? (Y or y)");
            String restart = input.next().toLowerCase();

            if (restart.equals("y")) {
                win = false;
            }

            else {
                continueGame = false;
                System.out.println("Thank you for playing our games. Bye!");
            }
        }   
    }
}