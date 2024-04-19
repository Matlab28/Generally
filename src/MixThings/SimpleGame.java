package MixThings;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleGame {

    public void structure(Scanner scanner) {
        while (true) {
            System.out.print("Enter 'W, A, S, D' for playing: ");
            char console = scanner.next().charAt(0);
            int random = (int) (Math.random() * 10) + 1;

            ArrayList<ArrayList<Integer>> numbers = new ArrayList<>();

            numbers.add(new ArrayList<>());

            switch (console) {
                case 'W':
                    System.out.println(random);
            }
        }
    }
}
