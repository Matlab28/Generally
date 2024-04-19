package MixThings.NumberGuess;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
    Scanner scanner;
    Random random;
    public String number;

    public RandomNumbers() {
        random = new Random();
        scanner = new Scanner(System.in);
    }

    public void guessing() {
        while (true) {
            String numbers = ".*\\d+.*";
            random.nextInt(100);
            System.out.print("Guess the number: ");
            number = scanner.next();

            if (!number.matches(numbers)) {
                throw new RuntimeException("Invalid input...");
            }

            if (random.equals(Integer.parseInt(number))) {
                System.out.println("Your guess: " + number);
                System.out.println("My guess: " + random.toString());
                System.out.println("Congratulations! You guessed the right number!");
            } else {
                System.out.println("Your guess: " + number);
                System.out.println("My guess: " + random.toString());
                System.out.println("Unfortunately you guessed wrong...");
            }
        }
    }
}
