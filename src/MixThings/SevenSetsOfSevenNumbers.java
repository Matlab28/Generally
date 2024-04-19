package MixThings;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SevenSetsOfSevenNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        for (int setNumber = 1; setNumber <= 7; setNumber++) {
            Set<Integer> uniqueNumbers = new HashSet<>();

            System.out.println("Set " + setNumber + ":");

            // Generate 7 unique random numbers for each set
            while (uniqueNumbers.size() < 7) {
                int randomNumber = random.nextInt(100);  // Adjust the range as needed
                uniqueNumbers.add(randomNumber);
            }

            // Print the unique random numbers for the current set
            for (int number : uniqueNumbers) {
                System.out.print(number + " ");
            }

            System.out.println();  // Move to the next line for the next set
        }
    }
}

