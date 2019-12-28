package pongsuwan.surapat.lab3;

/*
Author: Surapat Pongsuwan
ID: 623040147-4
Sec: 2
Date: December 23, 2019
*/


import java.util.Scanner;
import java.util.Random;


public class NumberGuessingMethodGame {
    public static void main(String[] args) 
    {
        genAnswer();
        playGame();
    }

    //Answer of the game
    static int answer;

    static void genAnswer() 
    {
        int min = 1;
        int max = 10;

        Random random = new Random();
        answer = random.nextInt(max - min + 1) + 1;
    }

    static void playGame() 
    {
        System.out.println("Welcome to a number guessing game!");

        Scanner input = new Scanner(System.in);

        int count = 0;

        for (int i=0; i<5; i++) 
        {
            System.out.print("Enter an integer between 1 and 10:");
            
            int guess = input.nextInt();
            count++;

            if (guess == answer) {
                System.out.println("Congretulation!");
                break;
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