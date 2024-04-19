package Bank.HealthAndWellnes;

import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AboutYou aboutYou = new AboutYou();
        System.out.println("Please enter your name: ");
        aboutYou.setName(scanner.next());
        System.out.println("Welcome " + aboutYou.getName() + "!");
        System.out.println();
        aboutYou.yourInfo(scanner);
    }
}
