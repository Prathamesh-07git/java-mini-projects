/**
 * NumberGuessingGame
 */
//Import Required Classes
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        
Random random = new Random();
Scanner sc = new Scanner(System.in);

System.out.println("This is an number guessing game So guess my number 😏😏😏");

System.out.println("Enter the range [Eg :- 10,50 ,100.....");
int range = sc.nextInt();

System.out.println("enter the number :- ");
int yourAnswer = sc.nextInt();
int randomNumber = random.nextInt(range);
int attempt = 0;
int i = 0;
while (yourAnswer!=randomNumber) {
    if(yourAnswer==randomNumber){
        System.out.println("you guess the number its "+randomNumber+"and you took "+attempt+" attempt");
    }
    else if (yourAnswer>randomNumber) {
        System.out.println("your guess is too high");
    }
    // else if (yourAnswer<randomNumber){
    //     System.out.println("your guess is too low");
    // }
    else{
System.out.println("your guess is too low");
    }
    i++;
    attempt++;

}

// System.out.println(randomNumber);


    }
}