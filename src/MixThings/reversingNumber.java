package MixThings;

import java.util.Scanner;

public class reversingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 567;
        System.out.println("The original number: " + number);

        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed number: " + reversedNumber);

        if (originalNumber == reversedNumber) {
            System.out.println("\nYour number '" + originalNumber + "' is a palindrome number.");
        } else {
            System.out.println("\nYour number '" + originalNumber + "' is NOT a palindrome number.");
        }
    }
}
