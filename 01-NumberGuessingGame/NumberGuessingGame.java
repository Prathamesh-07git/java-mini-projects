/**
 * NumberGuessingGame
 */

import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        
Random random = new Random();

int numbers = random.nextInt(10);
System.out.println(numbers);
    }
}