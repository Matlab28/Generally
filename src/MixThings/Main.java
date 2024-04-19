package MixThings;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name for your LinkedList: ");
        String listName = scanner.nextLine();

        LinkedList<String> linkedList = new LinkedList<>();

        System.out.println("LinkedList \"" + listName + "\" created.");

        // Now you can add elements to this LinkedList
        // For example, let's add elements until the user types "quit"
        while (true) {
            System.out.print("Enter an element to add (type 'quit' to stop): ");
            String element = scanner.nextLine();

            if (element.equals("quit")) {
                break;
            }

            linkedList.add(element);
        }

        // Display the contents of the LinkedList
        System.out.println("Contents of LinkedList \"" + listName + "\":");
        for (String item : linkedList) {
            System.out.println(item);
        }

        scanner.close();
    }
}

