package CreditSystem;

import java.util.Scanner;

public class LoanMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BackData backData = new BackData();
        System.out.print("Please enter the username: ");
        backData.setUsernameForCredit(scanner.next());
        System.out.println("Welcome to OurBank " + backData.getUsernameForCredit() + "!");
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        backData.workingTime(scanner);
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        backData.salaryConfirm(scanner);
    }
}
