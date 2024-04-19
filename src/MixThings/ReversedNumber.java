package MixThings;

import java.util.Scanner;

public class ReversedNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int number = 0;
        try {
            number = scanner.nextInt();
        } catch (Exception e) {
            throw new RuntimeException("Enter only integer...");
        }

        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed number is - " + reversedNumber);

        if (reversedNumber == originalNumber) {
            System.out.println("Your number '" + originalNumber + "' is a palindrome number.");
        } else {
            System.out.println("Your number '" + originalNumber + "' is not a palindrome number.");
        }
    }
}
