package OurBank;

import java.util.Scanner;

public class OurBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GeneralSystem generally = new GeneralSystem();
        System.out.print("Please enter the username: ");
        generally.setUsername(scanner.next());
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        generally.askPassword(scanner);
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        generally.confirmation(scanner);
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        generally.addBalance(scanner);
        System.out.println("\n" + "Do you want to set some deposit?");

        while (true) {
            System.out.print("Please confirm with yes or no: ");
            String deposit = scanner.next();

            if (deposit.equalsIgnoreCase("yes")) {
                generally.addDeposit(scanner);
                break;
            } else if (deposit.equalsIgnoreCase("no")) {
                System.out.println("Alright");
                break;
            } else {
                System.out.println("Please write only yes or no: ");
            }
        }

        System.out.println("\n" + "Do you want to transfer money to someone?");

        while (true) {
            System.out.print("Please confirm with yes or no: ");
            String transfer = scanner.next();

            if (transfer.equalsIgnoreCase("yes")) {
                generally.confirmation(scanner);
                generally.sendMoney(scanner);
                break;
            } else if (transfer.equalsIgnoreCase("no")) {
                System.out.println("Alright " + generally.getUsername() + ", thank you for using OurBank!");
                break;
            } else {
                System.out.println("Please write only yes or no: ");
            }
        }
    }
}
