package MixThings;

import java.util.LinkedList;

public class Linked2DListExample {
    public static void main(String[] args) {
        // Create a linked 2D list
        LinkedList<LinkedList<Integer>> linked2DList = new LinkedList<>();

        // Add rows to the 2D list
        linked2DList.add(new LinkedList<>()); // Row 0
        linked2DList.add(new LinkedList<>()); // Row 1
        linked2DList.add(new LinkedList<>()); // Row 2

        // Add elements to the rows
        linked2DList.get(0).add(1);
        linked2DList.get(0).add(2);
        linked2DList.get(0).add(3);

        linked2DList.get(1).add(4);
        linked2DList.get(1).add(5);
        linked2DList.get(1).add(6);

        linked2DList.get(2).add(7);
        linked2DList.get(2).add(8);
        linked2DList.get(2).add(9);

        // Access elements in the 2D list
        int element = linked2DList.get(1).get(2);
        System.out.println("Element at row 1, column 2: " + element);

        // Print the 2D list
        System.out.println("Linked 2D List:");
        for (LinkedList<Integer> row : linked2DList) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

