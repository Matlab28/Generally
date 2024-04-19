package Restaurant;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BackData {

    public void mainMenu(Scanner scanner) {
        Map<String, Integer> menu = new HashMap<>();
        menu.put("Steak", 56);
        menu.put("Pizza", 23);
        menu.put("Cola", 2);
        menu.put("French Fries", 4);
        menu.put("Fried chicken", 7);

        System.out.println("Meal and its price:");
        for (Map.Entry<String, Integer> order : menu.entrySet()) {
            System.out.println(order.getKey() + " - " + order.getValue());
        }

        System.out.println("\nWhat do you want to order?");
        System.out.println("Enter the names and a number of food.");
        System.out.println("Enter the name of food :");
        String food = scanner.next();

        boolean b = menu.containsKey(food);
        String customerSays = Boolean.toString(b);

        System.out.print("How much do you want to order this? - ");
        int number = scanner.nextInt();

        System.out.println("You've ordered " + number + " '" + customerSays + "'.");

    }

    public void timer() {
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BackData backData = new BackData();
        backData.mainMenu(scanner);
    }
}
