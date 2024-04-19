package FizzBuzz;

import java.util.Scanner;

public class Fizz_Buzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int count = scanner.nextInt();
        int number = 0;

        for (int i = 0; i < count; i++) {
            number++;
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (number % 3 == 0) {
                System.out.println("Fuzz");
            } else if (number % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(number);
            }
        }

        System.out.print("\nEnter an integer for reversing: ");
        int reversing = scanner.nextInt();

        int originalNumber= reversing;
        int reversedNumber = 0;

        while (reversing != 0) {
            int digit = reversing % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed number: " + reversedNumber);

        if (reversedNumber == originalNumber) {
            System.out.println("Your number is palindrome number.");
        } else {
            System.out.println("Your number is not a palindrome number.");
        }
    }
}
