import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {

        System.out.println("Welcome to a number guessing game!");

        //random number
        Random number = new Random();
        int randomNumber = number.nextInt(11); //receiever

        //Scanner of number
        Scanner input = new Scanner(System.in);

        int count = 0;

        for (int i=0; i<5; i++) {
            System.out.print("Enter an integer between 1 and 10:");
            int guess = input.nextInt();
            count++;

            if (guess == randomNumber) {
                System.out.println("Congretulation!");
                break;
            }
            else if (guess < randomNumber) {
                System.out.println("Try a lower number!");
            }
            else if (guess > randomNumber) {
                System.out.println("Try a higher number!");
            }
            
        }

        System.out.println("Yoy have tried " + count + " times");
        System.out.println("The Answer is " + randomNumber);
    }
}