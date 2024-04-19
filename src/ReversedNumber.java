import java.util.Scanner;

public class ReversedNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter an integer: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed number is - " + reversedNumber);

        if (reversedNumber == originalNumber) {
            System.out.println("Your number is a palindrome: " + originalNumber);
        } else {
            System.out.println("Your number is not a palindrome: " + originalNumber);
        }
    }
}
