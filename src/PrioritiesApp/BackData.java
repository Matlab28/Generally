//package PrioritiesApp;
//
//import java.util.Scanner;
//
//public class BackData {
//    private String name;
//    private String category;
//    private double balance;
//    private double addMoney;
//    private String allEach;
//
//    public void generally(Scanner scanner) {
//        System.out.print("Welcome " + getName() + ", how many categories do you want to add? ");
//        String[] categories = new String[0];
//
//        double totalAmount = 0.0; // Initialize total amount
//        double[] categoryAmounts = new double[categories.length];
//
//
//        try {
//            categories = new String[scanner.nextInt()];
//        } catch (Exception e) {
//            throw new RuntimeException("Please enter only integers...");
//        }
//        int count = 1;
//        int result = 1;
//        int eachOne = 1;
//        int randomCreation = 2;
//        System.out.println("Please select the category ( or categories):");
//        System.out.println("Coffee shop, book shop, market, clothing, or just for saving? ");
//        for (int i = 0; i < categories.length; i++)
//            System.out.print("Add " + count++ + ". category: ");
//            try {
//                categories[i] = setCategory(scanner.next());
//            } catch (Exception e) {
//                throw new RuntimeException("You can only enter strings...");
//            }
//        }
//        System.out.println("\n" + "Your category list:");
//        for (String list : categories) {
//            System.out.println(result++ + ") category: " + list);
//        }
//
//        System.out.print("\n" + "How much money do you have in your balance? ");
//        try {
//            setBalance(scanner.nextDouble());
//        } catch (Exception e) {
//            throw new RuntimeException("You can only enter numbers...");
//        }
//
//        System.out.println("How much money do you want to set for your categories?");
//        System.out.println("By the way, do you want to 1st set, then separate your money, or set for each of them separately?");
//        System.out.print("Please answer 'all' or 'separate': ");
//        String allSeparate = null;
//        try {
//            allSeparate = scanner.next();
//        } catch (Exception e) {
//            throw new RuntimeException("You can only enter strings...");
//        }
//
//        if (allSeparate.equalsIgnoreCase("separate")) {
////            double totalAmount = 0.0;
//            System.out.println("Please set money for each category one-by-one.");
//            System.out.print("Enter for 1. ");
//            for (String each : categories) {
//                try {
//                    setAllEach(scanner.next());
//                    double amount = Double.parseDouble(getAllEach());
//                    totalAmount += Double.parseDouble(getAllEach());
//                    System.out.println("'" + (getAllEach()) + "' azn set for '" + each + "'");
//                    System.out.print("Enter for " + randomCreation++ + ". ");
//                } catch (Exception e) {
//                    throw new RuntimeException("Enter only money for categories...");
//                }
//            }
//
//            System.out.println("You have total: " + Double.parseDouble(getAllEach()) + " azn for categories");
//            if (totalAmount > getBalance()) {
//                throw new RuntimeException("Your added '" + totalAmount + "' azn, and your balance is '" + getBalance() + "' azn" +
//                        ". You can't set money for category, which is higher than balance...");
//            }
//
//
//
//            System.out.println("\nTotal amount set for categories: " + totalAmount + " azn");
//            double left = getBalance() - totalAmount;
//            System.out.println("And '" + left + "' azn left in your account.");
//
//            if (totalAmount > getBalance()) {
//                throw new RuntimeException("Total amount for categories cannot exceed the balance...");
//            }
//
//
////            System.out.println();
////            System.out.println("Your list:");
////
////            for (String lastList : categories) {
////                System.out.println(lastList);
////            }
//        }
//
////        double[] categoryAmounts2 = new double[categories.length];
////        if (allSeparate.equalsIgnoreCase("all")) {
////
////            int randomCreation2 = 1;
////
////            for (int i = 0; i < categories.length; i++) {
////                try {
////                    setAllEach(scanner.next()); // Assuming setAllEach sets the amount for the current category
////                    categoryAmounts2[i] = Double.parseDouble(getAllEach());
////
////                    System.out.println("'" + getAllEach() + "' azn set for '" + categories[i] + "'");
////                    System.out.print("Enter for " + randomCreation++ + ". ");
////                } catch (Exception e) {
////                    throw new RuntimeException("Enter only money for categories...");
////                }
////            }
////
////            // Display amounts for each category in another foreach loop
////            for (int i = 0; i < categories.length; i++) {
////                System.out.println("You set '" + categoryAmounts2[i] + "' azn for " + categories[i]);
////            }
////        }
//    }
//
//    public String getAllEach() {
//        return allEach;
//    }
//
//    public String setAllEach(String allEach) {
//        this.allEach = allEach;
//        return allEach;
//    }
//
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getCategory() {
//        return category;
//    }
//
//    public String setCategory(String category) {
//        this.category = category;
//        return category;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }
//
//    public double getAddMoney() {
//        return addMoney;
//    }
//
//    public void setAddMoney(double addMoney) {
//        this.addMoney = addMoney;
//    }
//}
