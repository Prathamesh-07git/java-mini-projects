
/**
 * NumberGuessingGame
 */
//Import Required Classes
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        // Create Scanner and Random Object

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        // Ask user to enter the range

        System.out.println("--- Welcome to the  number guessing game guess my number ---");
        System.out.println("Enter the range (Eg :- 10,50,100)");
        int range = sc.nextInt();

        if (range <= 0) {
            System.out.println("Range must be greater than 0.\n");

        } else {
            // Generate random number
            int secretNumber = random.nextInt(range)+1;
            int userGuess;
            int attempt = 0;
            // take do while loop
            do {
                // Ask user to enter guess
                System.out.print("Enter your number lets see if you guess it or not :-  ");
                userGuess = sc.nextInt();

                if (userGuess > range) {
                    System.out.println("Please enter a number between 1 and " + range);
                }
                // count attempts
                attempt++;
                if (userGuess == secretNumber) {
                    // System.out.println(" Congratulations! your guess it and you take " + attempt
                    // + " attempts");

                    System.out.println(" ==============================\r\n" +
                            "Congratulations!\r\n" +
                            "You guessed the correct number.\r\n" +
                            "\r\n" +
                            "Secret Number : " + secretNumber + "\r\n" +
                            "Attempts : " + attempt + "\r\n" +
                            "==============================");

                } else if (userGuess > secretNumber) {
                    System.out.println("your guess is too high [Try again] ");
                } else if (userGuess < secretNumber) {
                    System.out.println("your answer is too low [Try again]");
                }
            } while (userGuess != secretNumber);
        }

        sc.close();

    }
}