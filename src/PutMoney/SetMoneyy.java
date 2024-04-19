package PutMoney;

import java.util.Scanner;

public class SetMoneyy {
    private double balance;
    private double putMoney;

    public void setMoney(Scanner scanner) {
        while (true) {
            SetMoneyy setMoneyy = new SetMoneyy();
            System.out.print("How much money do you have in your bank account? ");
            setMoneyy.setBalance(scanner.nextDouble());
            System.out.println("You have '" + setMoneyy.getBalance() + "' azn in your account." + "\n");
            System.out.println("How much money do you want to set?");
            try {
                setMoneyy.setPutMoney(scanner.nextDouble());
            } catch (Exception e) {
                throw new RuntimeException("You can only enter numbers.");
            }

            if (setMoneyy.getBalance() < setMoneyy.getPutMoney()) {
                throw new RuntimeException("Your amount cannot be higher than your balance");
            }

            System.out.println("In which term do you want to take money from bank?");
            System.out.print("Please select one of them (3/6/12 months later): ");
            int taking = scanner.nextInt();

            switch (taking) {
                case 3:
                    System.out.println("In this term, you'll have extra 3%.");
                    double takes3 = (setMoneyy.getPutMoney() * 103) / 100;
                    System.out.println("At the end of the 3 months, you'll have '" + takes3 + "' azn.");
                    break;
                case 6:
                    System.out.println("In this term, you'll have extra 6%.");
                    double takes6 = (setMoneyy.getPutMoney() * 106) / 100;
                    System.out.println("At the end of the 6 months, you'll have '" + takes6 + "' azn.");
                    break;
                case 12:
                    System.out.println("In this term, you'll have extra 12%.");
                    double takes12 = (setMoneyy.getPutMoney() * 112) / 100;
                    System.out.println("At the end of the 6 months, you'll have '" + takes12 + "' azn.");
                    break;
                default:
                    try {
                        System.out.println("Please enter only already set months:");
                    } catch (Exception e) {
                        throw new RuntimeException("Something went wrong...");
                    }
            }
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getPutMoney() {
        return putMoney;
    }

    public void setPutMoney(double putMoney) {
        this.putMoney = putMoney;
    }
}
