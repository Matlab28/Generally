package Essentials;

import java.util.Scanner;


/*  This system allows you to keep money. For instance, you must go market, and you'll need approximately 50 azn. in this
   case how can you keep this money? Accidentally you can spend it and as above mentioned, you must do this. It's your
   priority. That's why I've created this system. You can keep your money for some purposes. Let's say you must buy coffee
   every day, and you need 6 azn for this. For a month, it's 180 azn. You have 450 azn in your account and you can keep 180
   azn for coffee. You can spend this money only in coffee shops. If you can't spend all money end of term, then your money
   will return your balance automatically. You can set this weekly and monthly. And you can set several categories simultaneously.
   You are able to create the category. It's 100% up to you. Or maybe you don't need to set any categories, you need only keep
   money let's say for next week. In this case you can keep your money for weekly (i.e. 50 azn), and you can reach your money only
   7 days later. You can't get them as a cash until its deadline. We can call this system "Essentials" or "Priorities". Of course
   these are my preferences. You can give it a name, whichever you want.
 */

public class FindOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BackStructure structure = new BackStructure();
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-");
        System.out.println("You can set money and keep it here. You can only pay with card and only for its category.");
        System.out.println("For instance: if your essential is coffee and if you set '50 azn' buying coffee for this month,");
        System.out.println("you can spend this money only in  coffee shops.");
        System.out.println("Or it might be for restaurants or markets. Maybe you have to buy something from market end of the month,");
        System.out.println("but accidentally you spent that money. That's why we have this system.");
        System.out.println("If you can't spend all money until end of the month, it will return your balance automatically.");
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-" + "\n");

        System.out.print("Please enter your name: ");
        structure.setName(scanner.next());
        System.out.println("\n" + "Welcome " + structure.getName());
        System.out.println("What do you want to organize or keep money?");
        System.out.println("Hobby, restaurant, market, coffee shop, clothing store, or birthday gift?");
        System.out.print("Please add how many categories you'll add: ");

        String[] array = new String[scanner.nextInt()];
        int count = 1;
        int result = 1;
        int last = 1;
        System.out.println("Alright " + structure.getName() + ", please add them:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(count++ + ") ");
            array[i] = scanner.next();
        }
        System.out.println("\n" + "Your list:");
        for (String list : array) {
            System.out.println(result++ + ") " + list);
        }
        System.out.println();
        structure.essentials(scanner);

        System.out.println("Please set money for each of them");
        for (String setMoney : array) {
            System.out.println(("Add for " + last++ + ") add for - " + scanner.nextDouble()));
            System.out.print(" added for " + setMoney);
        }


    }
}
