package PutMoney;

import java.util.Scanner;

public class ConfirmSetMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SetMoneyy setMoneyy = new SetMoneyy();
        System.out.print("Hello, please enter your name: ");
        String name = scanner.next();
        System.out.println("Welcome to OurBank " + name + "!" + "\n");

        while (true) {
            System.out.println("Do you want to put some money to the bank?");
            System.out.print("Please confirm with yes or no: ");
            String yesOrNo = scanner.next();

            if (yesOrNo.equalsIgnoreCase("yes")) {
                setMoneyy.setMoney(scanner);
                break;
            } else if (yesOrNo.equalsIgnoreCase("no")) {
                System.out.println("Alright " + name + ", thank you for using OurBank.");
                break;
            } else {
                System.out.println("Please enter only yes or no:");
            }
        }
    }
}
