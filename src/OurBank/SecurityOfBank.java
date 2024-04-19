package OurBank;

import java.util.Scanner;

public class SecurityOfBank {
    private String username;
    private String password;

    public void askPassword(Scanner scanner) {
        while (true) {
            SecurityOfBank security = new SecurityOfBank();
            String numbers = ".*\\d+.*";
            String uppers = ".*[A-Z].*";
            String lowers = ".*[a-z].*";
            System.out.print("Please enter the password: ");
            security.setPassword(scanner.next());

            if (!security.getPassword().matches(numbers)) {
                System.out.println("*** Password must contain at least 1 number ***");
                continue;
            }
            if (!security.getPassword().matches(uppers)) {
                System.out.println("*** Password must contain at least 1 upper letter ***");
                continue;
            }
            if (!security.getPassword().matches(lowers)) {
                System.out.println("*** Password must contain at least 1 lower letter ***");
                continue;
            }
            if (security.getPassword().contains("!@#$%^&*()-=+><?/")) {
                System.out.println("*** Password can't contain any symbols ***");
                continue;
            }
            if (security.getPassword().length() != 8) {
                System.out.println("*** Password's length must be 8 characters ***");
                continue;
            }

            System.out.print("Please confirm the password: ");
            String confirmation = scanner.next();

            if (security.getPassword().equals(confirmation)) {
                System.out.println("\n" + "Welcome to OurBank " + getUsername() + ", nice to see you.");
                break;
            } else {
                System.out.println("-----------------------------------------------");
                System.out.println("Please try again.");
            }
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
