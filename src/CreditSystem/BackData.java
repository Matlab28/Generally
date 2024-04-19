package CreditSystem;

import java.util.Scanner;

public class BackData {
    private String usernameForCredit;
    private double loanMoney;
    private int months;
    private int salary;

    public void workingTime(Scanner scanner) {
        while (true) {
            System.out.println(getUsernameForCredit() + ", are you working?");
            System.out.print("Please confirm with yes or no: ");
            String workOrNot = scanner.next();

            if (workOrNot.equalsIgnoreCase("yes")) {
                System.out.print("How long you have been working? - ");
                setMonths(scanner.nextInt());

                if (getMonths() < 6) {
                    System.out.println("For getting loan, you should work at least 6 months.");
                    break;
                } else {
                    System.out.println(getUsernameForCredit() + ", you can loan money from OurBank!");
                    break;
                }

            } else if (workOrNot.equalsIgnoreCase("no")) {
                System.out.println("Unfortunately, you should work for getting loan.");
                break;
            } else {
                System.out.println("Please enter only yes or no:");
            }
        }
    }

    public void salaryConfirm(Scanner scanner) {
        System.out.print("How much is your salary? - ");
        setSalary(scanner.nextInt());
        System.out.println("Your salary is '" + getSalary() + "'.");
//        calculateCreditAmount();
        int creditAmount = getSalary() * 8;
        System.out.println("In this case, we can give you utmost '" + creditAmount + "' azn." + "\n");

        returning(scanner);
    }

    public void returning(Scanner scanner) {
        System.out.println("In which term do you want to pay back?");
        System.out.print("Chose one of them (3/6/12/18/24/30/36 months): ");
        int selectMonth = 0;
        try {
            selectMonth = scanner.nextInt();
        } catch (Exception e) {
            throw new RuntimeException("Please enter only integers.");
        }

        switch (selectMonth) {
            case 3:
                System.out.println("In this term you'll pay extra 7% of the loan.");
                double returnMoney = ((getSalary() * 8) * 107) / 100;
                System.out.println("You should pay '" + returnMoney + "' azn");
                break;
            case 6:
                System.out.println("In this term you'll pay extra 9% of the loan.");
                double returnMoney1 = ((getSalary() * 8) * 109) / 100;
                System.out.println("You should pay " + returnMoney1 + "' azn");
                break;
            case 12:
                System.out.println("In this term you'll pay extra 12% of the loan.");
                double returnMoney2 = ((getSalary() * 8) * 112) / 100;
                System.out.println("You should pay '" + returnMoney2 + "' azn");
                break;
            case 18:
                System.out.println("In this term you'll pay extra 14% of the loan.");
                double returnMoney3 = ((getSalary() * 8) * 114) / 100;
                System.out.println("You should pay '" + returnMoney3 + "' azn");
                break;
            case 24:
                System.out.println("In this term you'll pay extra 16% of the loan.");
                double returnMoney4 = ((getSalary() * 8) * 116) / 100;
                System.out.println("You should pay '" + returnMoney4 + "' azn");
                break;
            case 30:
                System.out.println("In this term you'll pay extra 18% of the loan.");
                double returnMoney5 = ((getSalary() * 8) * 118) / 100;
                System.out.println("You should pay '" + returnMoney5 + "' azn");
                break;
            case 36:
                System.out.println("In this term you'll pay extra 20% of the loan.");
                double returnMoney6 = ((getSalary() * 8) * 120) / 100;
                System.out.println("You should pay '" + returnMoney6 + "' azn");
                break;
            default:
                System.out.println("Please, choose only one of them:");
                returning(scanner);
        }
    }

    public String getUsernameForCredit() {
        return usernameForCredit;
    }

    public void setUsernameForCredit(String usernameForCredit) {
        this.usernameForCredit = usernameForCredit;
    }

    public double getLoanMoney() {
        return loanMoney;
    }

    public void setLoanMoney(double loanMoney) {
        this.loanMoney = loanMoney;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
