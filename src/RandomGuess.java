import java.util.Random;
import java.util.Scanner;

public class RandomGuess {
    Scanner scanner;
    Random random;
    private String number;

    public RandomGuess() {
        random = new Random();
        scanner = new Scanner(System.in);
    }

    public void guessTime() {
        while (true) {
            String numbers = ".*\\d+.*";
            int a = random.nextInt(100);
            System.out.println("Guess the number: ");
            number = scanner.next();

            if (number.equalsIgnoreCase("done")) {
                break;
            }

            if (!number.matches(numbers)) {
                throw new RuntimeException("Invalid input...");
            }

            if (random.equals(Integer.parseInt(number))) {
                System.out.println("Your guess: " + number);
                System.out.println("Mine is: " + a);
                System.out.println("Congratulations! you guessed right!\n");
            } else {
                System.out.println("Your guess: " + number);
                System.out.println("Mine is: " + a);
                System.out.println("Unfortunately you guessed wrong...\n");
            }
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    public static void main(String[] args) {
        RandomGuess guess = new RandomGuess();
        guess.guessTime();
    }
}
