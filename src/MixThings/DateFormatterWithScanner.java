package MixThings;

import java.util.Scanner;

public class DateFormatterWithScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the date (MMDD): ");
        String input = scanner.nextLine();
        String formattedDate = formatDate(input);
        System.out.println("Formatted date: " + formattedDate);
        scanner.close();
    }

    public static String formatDate(String input) {
        // Check if input has at least 4 characters
        if (input.length() < 4) {
            return "Invalid input";
        }

        // Extract month and day from input string
        String month = input.substring(0, 2);
        String day = input.substring(2);

        // Format the date as MM/dd
        return month + "/" + day;
    }
}

