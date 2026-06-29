
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
     Random  random = new Random();
     //  Ask user to enter the range

     System.out.println("--- Welcome to the  number guessing game guess my number ---");
     System.out.println("Enter the range (Eg :- 10,50,100)");
     int range = sc.nextInt();

     // Generate random number  
     int randomNumber = random.nextInt(range+1);
    int yourAnswer;
     int attempt=0;
     // take do while loop 
     do{
        // Ask user to enter guess
        System.out.print("Enter your number lets see if you guess it or not :-  ");
        yourAnswer = sc.nextInt();

        // count attempts
        attempt++;
        if(yourAnswer==randomNumber){
            System.out.println(" Congratulations! your guess it and you take "+attempt+" attempts");
        }
        else if (yourAnswer>randomNumber) {
            System.out.println("your guess is too high [Try again] ");
        }
        else if (yourAnswer<randomNumber) {
            System.out.println("your answer is too low [Try again]");
        }      
     }while(yourAnswer!=randomNumber);



    }
}