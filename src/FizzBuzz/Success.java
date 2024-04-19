package FizzBuzz;

import java.util.Scanner;

public class Success {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("\nEnter the number: ");
            int counter = scanner.nextInt();
            int calcNumb = 0;

            if (counter == 0) {
                break;
            }

            for (int i = 1; i <= counter; i++) {
                calcNumb++;

                if (calcNumb % 3 == 0 && calcNumb % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (calcNumb % 3 == 0) {
                    System.out.println("Fizz");
                } else if (calcNumb % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(calcNumb);
                }
            }
        }

        System.out.print("Enter a integer: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed number is: " + reversedNumber);

        if (reversedNumber == originalNumber) {
            System.out.println("Your number is a palindrome number.");
        } else {
            System.out.println("You number is not a palindrome number.");
        }


    }
}
