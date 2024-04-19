package AGuestList;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Guest2 {
    Scanner scanner;
    ArrayList<String> guestList;
    private String name;
    private int a, b = 1;

    public Guest2() {
        scanner = new Scanner(System.in);
        guestList = new ArrayList<>();
    }

    public void manageGuest() {
        while (true) {
            String letters = ".*[A-Za-z].*";
            System.out.print("Add " + (a += 1) + ". guest: ");
            try {
                setName(scanner.next());
            } catch (Exception e) {
                throw new RuntimeException("Enter the right value...");
            }

            if (!getName().matches(letters)) {
                throw new RuntimeException("Invalid input...");
            }

            if (getName().equalsIgnoreCase("done")) {
                System.out.println("Do you want to add or remove anyone?");
                String addRemove = scanner.next();

                if (addRemove.equalsIgnoreCase("add")) {
                    continue;
                } else if (addRemove.equalsIgnoreCase("remove")) {
                    removeGuest();
                } else {
                    display();
                    break;
                }
            }

            guestList.add(name);
        }
    }

    public void removeGuest() {
        while (true) {
            System.out.print("\nEnter the name of guest you want to remove: ");
            String removable = scanner.next();
            try {
                guestList.remove(removable);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

            if (removable.equalsIgnoreCase("done")) {
                break;
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guest2 guest2 = (Guest2) o;
        return a == guest2.a && b == guest2.b && Objects.equals(scanner, guest2.scanner) && Objects.equals(guestList, guest2.guestList) && Objects.equals(name, guest2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scanner, guestList, name, a, b);
    }

    public void display() {
        for (String list : guestList) {
            System.out.println(b++ + ". guest: " + list);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
