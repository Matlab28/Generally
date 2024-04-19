package FizzBuzz;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StillTrying {
    List<Integer> calculator;
    private int number;

    public StillTrying() {
        calculator = List.of(number);
    }

    public void calculating(Scanner scanner) {
        while (true) {
            System.out.print("Enter the number: ");
            setNumber(scanner.nextInt());
            int calcNumb = 0;

            for (int i = 1; i <= getNumber(); i++) {
                calcNumb++;
                if (calcNumb % 3 == 0 && calcNumb % 5 == 0) {
                    System.out.println("FuzzBuzz");
                } else if (calcNumb % 3 == 0) {
                    System.out.println("Fuzz");
                } else if (calcNumb % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(calcNumb);
                }
            }
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
