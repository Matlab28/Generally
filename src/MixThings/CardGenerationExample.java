package MixThings;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CardGenerationExample {

    static Random random;

    public CardGenerationExample() {
        random = new Random();
    }


    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 1; i <= 7; i++) {
            System.out.println(i + ". card:");

            Set<Integer> uniqueNumbers = generateUniqueNumbers(random, 7);
            Set<String> uniqueCards = generateUniqueCards(random, 7);

            // Print the unique numbers and cards for the current iteration
            uniqueNumbers.forEach(number -> System.out.println(number));
            uniqueCards.forEach(card -> System.out.println(card));

            System.out.println();
        }
    }

    private static Set<Integer> generateUniqueNumbers(Random random, int count) {
        Set<Integer> uniqueNumbers = new HashSet<>();

        while (uniqueNumbers.size() < count) {
            uniqueNumbers.add(random.nextInt(50));  // Adjust the range as needed
        }

        return uniqueNumbers;
    }

    private static Set<String> generateUniqueCards(Random random, int count) {
        Set<String> uniqueCards = new HashSet<>();

        while (uniqueCards.size() < count) {
            String card = getRandomCard() + " : " + getRandomColor();
            uniqueCards.add(card);
        }

        return uniqueCards;
    }

    private static String getRandomCard() {
        String[] cards = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        return cards[random.nextInt(cards.length)];
    }

    private static String getRandomColor() {
        String[] colors = {"Hearts", "Diamonds", "Clubs", "Spades"};
        return colors[random.nextInt(colors.length)];
    }
}
