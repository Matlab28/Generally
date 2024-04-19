package MixThings.GroceryList;

import java.util.Scanner;

public class AddList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many products are you going to add? - ");
        String[] array = new String[0];
        try {
            array = new String[scanner.nextInt()];
        } catch (Exception e) {
            throw new RuntimeException("Please enter only integers...");
        }
        int count = 1;
        int result = 1;

        for (int i = 0; i < array.length; i++) {
            System.out.print(count++ + ". Add the product: ");
            array[i] = scanner.next();
        }

        System.out.println("\n" + "Your grocery list:");
        for (String list : array) {
            System.out.println(result++ + ". product: " + list);
        }

        System.out.println("\n" + "Do you want to set money for grocery shop?");
        while (true) {
            System.out.print("Please answer with yes or no: ");
            String yesOrNo = scanner.next();

            if (yesOrNo.equalsIgnoreCase("yes")) {
                System.out.print("Alright then, please enter your balance: ");
                double balance = scanner.nextDouble();
                System.out.print("How much money do you want to spend total? - ");
                double spendTotal = scanner.nextDouble();
                if (spendTotal > balance) {
                    throw new RuntimeException("It can't be higher than balance...");
                }
                System.out.println("Alright, '" + (balance - spendTotal) + "' set for grocery shop");
                System.out.println("Have a great shop! ☺️");
                break;
            } else if (yesOrNo.equalsIgnoreCase("no")) {
                System.out.println("Alright, but be careful, do not waste your money 😉 ");
                break;
            } else {
            }
        }
    }
}
