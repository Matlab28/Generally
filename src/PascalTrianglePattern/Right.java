package PascalTrianglePattern;

import java.util.Scanner;

public class Right {
    public static void main(String[] args) {
        int i, j, rows;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();
        for (i = 0; i <= rows; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
        for (i = rows - 1; i >= 0; i--) {
            for (j = 0; j <= i - 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
    }
}
