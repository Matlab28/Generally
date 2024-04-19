package GuestOrganization;

import java.util.LinkedList;
import java.util.Scanner;

public class Guests {
    private String names;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Guests guests = new Guests();
        guests.addGuest(scanner);
    }

    public void addGuest(Scanner scanner) {
        while (true) {
            System.out.println("How many guests do you want to add?");
            LinkedList<String> numbers = new LinkedList<>();
            numbers.add(scanner.next());
            int count = 1;

            for (int i = 0; i < numbers.size(); i++) {
                System.out.println("Add " + count++ + ". guest: " + numbers.get(scanner.nextInt()));
            }
        }
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }
}

