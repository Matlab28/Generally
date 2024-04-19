package RegistirationSytem;

import java.util.*;

public class SignIn {
    Scanner scanner;
    Random random;
    private String username, password, email;
    private Map<String, String> info;
    private ArrayList<String> generally;

    public SignIn() {
        info = new HashMap<>();
        scanner = new Scanner(System.in);
        random = new Random();
    }

    public void addPassword() {
        while (true) {
            String uppers = ".*[A-Z].*";
            String lowers = ".*[a-z].*";
            String numbers = ".*\\d+.*";
            System.out.print("\nSet password: ");
            setPassword(scanner.next());

            if (!getPassword().matches(uppers)) {
                System.out.println("*** Password must contain at least an upper case ***");
                continue;
            }
            if (!getPassword().matches(lowers)) {
                System.out.println("*** Password must contain at least a lower case ***");
                continue;
            }
            if (!getPassword().matches(numbers)) {
                System.out.println("*** Password must contain at least a number ***");
                continue;
            }
            if (getPassword().length() != 8) {
                System.out.println("*** Password length must be 8 characters ***");
                continue;
            }

            System.out.println("Please confirm the password: ");
            confirmation();
            break;

        }
    }

    public void confirmation() {
        while (true) {
            String confirm = scanner.next();

            if (confirm.equals(getPassword())) {
                System.out.println("Welcome to system " + getUsername() + "!");
                info.put(getPassword(), getUsername());
                break;
            } else {
                System.out.println("\n-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
                System.out.println("Please try again...");
                System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\n");
            }
        }
    }

    public void addEmail() {
        System.out.print("Enter the username: ");
        setUsername(scanner.next());
        while (true) {
            String gmailRegex = "^[a-zA-Z0-9_]+(\\.[a-zA-Z0-9_]+)*@gmail\\.com$";
            System.out.print("Enter the email address: ");
            setEmail(scanner.next());

            if (!getEmail().matches(gmailRegex)) {
                System.out.println("Invalid email address...");
                continue;
            }
            System.out.println("We sent OTP code to '" + getEmail().toLowerCase() + "' address.");
            System.out.println("Please confirm it.");

            emailApproving();
            addPassword();
            break;

        }
    }

    public void emailApproving() {
        while (true) {
            String numbers = ".*\\d+.*";
            int min = 1000;
            int max = 9999;
            int digit = random.nextInt((max - min + 1) + min);
            System.out.println("OTP code: " + digit);
            System.out.print("Confirm it: ");
            String approve = null;
            try {
                approve = scanner.next();
            } catch (Exception e) {
                throw new RuntimeException("Enter only integers...");
            }

            if (!approve.matches(numbers)) {
                throw new RuntimeException("Enter only integers...");
            }

            if (digit == Integer.parseInt(approve)) {
                System.out.println("Welcome to the system " + getUsername().toUpperCase() + "!");
                break;
            } else {
                System.out.println("Invalid input...Try again.");
            }
            generally.add(getEmail());
        }
    }


    public ArrayList<String> getGenerally() {
        return generally;
    }

    public void setGenerally(ArrayList<String> generally) {
        this.generally = generally;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Map<String, String> getInfo() {
        return info;
    }

    public void setInfo(Map<String, String> info) {
        this.info = info;
    }
}
