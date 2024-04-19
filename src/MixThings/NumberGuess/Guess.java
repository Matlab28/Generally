package MixThings.NumberGuess;

public class Guess {
    public static void main(String[] args) {
        RandomNumbers numbers = new RandomNumbers();
        System.out.println("Guess number 0-100:\n");
        numbers.guessing();
    }
}
