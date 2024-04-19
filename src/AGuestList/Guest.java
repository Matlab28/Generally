package AGuestList;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Guest {
    Scanner scanner;
    Map<Integer, String> list;
    private String name;
    private int id;

    public Guest() {
        scanner = new Scanner(System.in);
        list = new HashMap<>();
    }

    public void addList() {
        while (true) {
            int count1 = 1;
            int count2 = 1;
            try {
                System.out.print("Add " + (count1++) + ". name: ");
                setName(scanner.next());

                if (getName().equalsIgnoreCase("done")) {
                    System.out.println("\nList:\n");
                    display();
                    break;
                }

                System.out.print("Add " + (count2++) + ". ID: ");
                setId(scanner.nextInt());
            } catch (Exception e) {
                throw new RuntimeException("Invalid input...");
            }

            list.put(id, name);
        }
    }

    public void display() {
        int count3 = 1;
        int count4 = 1;
        for (Map.Entry<Integer, String> items : list.entrySet()) {
            System.out.println("The " + (count3++) + ". guest name: " + items.getValue());
            System.out.println("The " + (count4++) + ". guest ID: " + items.getKey());
        }
    }

    public void update() {
        System.out.print("Do you want to add someone? - ");
        String addOrNot = scanner.next();

        if (addOrNot.equalsIgnoreCase("yes")) {
            addList();
        } else {
            System.out.print("Do you want to remove someone? - ");
            String removeOrNot = scanner.next();

            if (removeOrNot.equalsIgnoreCase("yes")) {
                System.out.println("Enter the name or ID of person, who do you want to remove: ");
                String removing = scanner.next();

                if (removing.equals(name) || Integer.parseInt(removing) == id) {
                    System.out.println("'" + removing + "' removed list of guests.\n");
                    list.remove(Integer.parseInt(removing));
                    list.replace(null, removing);
                    display();
                } else {
                    throw new RuntimeException("Invalid input...");
                }
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guest guest = (Guest) o;
        return id == guest.id && Objects.equals(scanner, guest.scanner) && Objects.equals(list, guest.list) && Objects.equals(name, guest.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scanner, list, name, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
