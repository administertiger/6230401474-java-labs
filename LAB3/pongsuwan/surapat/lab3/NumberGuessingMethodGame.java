/*
Author: Surapat Pongsuwan
ID: 623040147-4
Sec: 2
Date: December 23, 2019
*/

package pongsuwan.surapat.lab3;

import java.util.Scanner;


public class NumberGuessingMethodGame {
    static int answer;

    public static void main(String[] args) 
    {
        genAnswer();
        playGame();
    }

    static void genAnswer() 
    {
        int min = 1;
        int max = 10;

        //random number
        answer = min + (int)(Math.random()*(max-min)+1);
    }

    static void playGame() 
    {
        System.out.println("Welcome to a number guessing game!");

        //Scanner of guess
        Scanner input = new Scanner(System.in);

        int count = 0;

        //get in loop
        for (int i=0; i<5; i++) {
            System.out.print("Enter an integer between 1 and 10:");
            
            int guess = input.nextInt();
            count++;

            if (guess == answer) {
                System.out.println("Congretulation!");
                System.out.println("You have tried " + count + " times.");
                System.exit(0);
            }
            else if (guess > answer) {
                System.out.println("Try a lower number!");
            }
            else if (guess < answer) {
                System.out.println("Try a higher number!");
            }
            
        }

        if (count == 5) {
            System.out.println("You have tried " + count + " times. You ran out of guesses");
        }
        else {
            System.out.println("You have tried " + count + " times");
        }
        
        System.out.println("The Answer is " + answer);
    }
    
}