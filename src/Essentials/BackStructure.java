package Essentials;

import java.util.Scanner;

public class BackStructure {
    private String name;
    private double balance;
    private double needs;

    public void essentials(Scanner scanner) {
        System.out.print("Before starting, please add your balance: ");
        setBalance(scanner.nextDouble());
        System.out.println("Alright " + getName() + ". You have '" + getBalance() + "' azn.");
        System.out.println("How much money do you need for this approximately for a month?");
        setNeeds(scanner.nextDouble());
        if (getNeeds() > getBalance()) {
            throw new RuntimeException("You can't set money higher than your balance...");
        }
        System.out.println("Alright. " + getName() + ". money set for your '");

    }

    public double getNeeds() {
        return needs;
    }

    public void setNeeds(double needs) {
        this.needs = needs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
