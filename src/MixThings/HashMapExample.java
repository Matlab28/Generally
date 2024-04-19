package MixThings;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> studentScores = new HashMap<>();

        // Adding key-value pairs
        studentScores.put("Alice", 95);
        studentScores.put("Bob", 87);
        studentScores.put("Charlie", 92);
        studentScores.put("David", 78);

        // Retrieving values
        System.out.println("Bob's score: " + studentScores.get("Bob"));

        // Iterating through the entries
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Checking if a key exists
        if (studentScores.containsKey("Alice")) {
            System.out.println("Alice's score exists.");
        }

        // Removing a key-value pair
        studentScores.remove("David");
        System.out.println("HashMap after removing David: " + studentScores);
    }
}
