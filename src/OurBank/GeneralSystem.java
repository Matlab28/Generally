package OurBank;

import java.util.Scanner;

public class GeneralSystem extends SecurityOfBank {
    private static boolean methodWasCalled = false;
    private String accountNumber;
    private double balance;
    private double deposit;
    private double transferAmount;

    public double depositLeft() {
        return getBalance() - getDeposit();
    }

    public double afterDepositTransfer() {
        return depositLeft() - getTransferAmount();
    }

    public double transferLeft() {
        return getBalance() - getTransferAmount();
    }


    public void confirmation(Scanner scanner) {
        while (true) {
            StringBuilder builder = new StringBuilder();
            System.out.println("Please enter the account number:");
            setAccountNumber(scanner.next());

            String uppers = ".*[A-Z].*";
            String lowers = ".*[a-z].*";

            if (getAccountNumber().matches(uppers) || getAccountNumber().matches(lowers)) {
                throw new ArithmeticException("It can't contain any letters.");
            }
            if (getAccountNumber().length() != 16) {
                System.out.println("Account number's length must be 16 characters.");
                continue;
            }

            for (int i = 0; i < getAccountNumber().length(); i += 4) {
                int endIndex = Math.min(i + 4, getAccountNumber().length());
                String substring = getAccountNumber().substring(i, endIndex);
                builder.append(substring);

                if (endIndex < getAccountNumber().length()) {
                    builder.append(" ");
                }
            }

            System.out.println("Is '" + (builder.toString()) + "' the right account number?");

            System.out.print("Please confirm with yes or no: ");
            String yesNo = scanner.next();

            if (yesNo.equalsIgnoreCase("yes")) {
                System.out.println("Thank you " + getUsername() + "!");
                break;
            } else if (yesNo.equalsIgnoreCase("no")) {
            }
        }
    }

    public double addBalance(Scanner scanner) {
        while (true) {
            System.out.print("How much money do you have in your account? - ");
            setBalance(scanner.nextDouble());

            if (getBalance() <= 0) {
                throw new RuntimeException("You can't have balance lower or equal to zero.");
            }

            System.out.println("You have '" + getBalance() + "' azn in your account");
            break;
        }
        return this.getBalance();
    }

    public void addDeposit(Scanner scanner) {
        while (true) {
            methodWasCalled = true;
            System.out.print("How much money do you want set as a deposit? - ");
            setDeposit(scanner.nextDouble());

            if (getDeposit() > getBalance()) {
                System.out.println("It can't be higher than balance");
            } else {
                System.out.println("'" + getDeposit() + "' azn set as a deposit.");
                System.out.println("'" + depositLeft() + "' azn left in your account");
                break;
            }
        }
    }

    public void sendMoney(Scanner scanner) {
        while (true) {
            System.out.println("How much money do you want to send?");
            try {
                setTransferAmount(scanner.nextDouble());
            } catch (Exception e) {
                throw new RuntimeException("Something went wrong...");
            }

            if (getTransferAmount() > getBalance()) {
                System.out.println("Transfer amount cannot be higher than balance");
                continue;
            }
            if (getTransferAmount() < 0) {
                throw new ArithmeticException("It can't be lower than 0.");
            }
            System.out.println("'" + getTransferAmount() + "' transferred successfully.");

            if (methodWasCalled == false) {
                System.out.println("'" + transferLeft() + "' azn left in your account");
            } else {
                System.out.println("'" + afterDepositTransfer() + "' azn left in your account");
            }

            System.out.println("Thank you " + getUsername() + ", for using OurBank!");
            break;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTransferAmount() {
        return transferAmount;
    }

    public void setTransferAmount(double transferAmount) {
        this.transferAmount = transferAmount;
    }
}

