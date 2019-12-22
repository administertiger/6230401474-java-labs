import java.util.Scanner;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        
        Random number = new Random();
        int randomnumber = number.nextInt(11);
        
        Scanner input = new Scanner(System.in);

        boolean win = false;

        while (win == false) {
            int count = 0;
            System.out.println("Type a number: ");
            int guess = input.nextInt();

            if (guess == randomnumber) {
                win = true;
                
            }
            else if (guess > randomnumber) {
                System.out.println("TOO HIGH!");
                count += 1;
            }
            else if (guess < randomnumber) {
                System.out.println("TOO LOW!");
                count += 1;
            }
            if (count == 5) {
                System.out.println("Out of chance!!");
                System.exit(0);
            }
            
        }
        System.out.println("YOU WIN!!");
        
     
            
    }
}