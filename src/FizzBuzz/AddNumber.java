package FizzBuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AddNumber {
    public static void main(String[] args) {
        AddNumber addNumber = new AddNumber();
        List<Integer> calculator = new ArrayList<>();
        Scanner scanner =new Scanner(System.in);
        System.out.print("Add number: ");
        int number = addNumber.number;
        number = scanner.nextInt();


        List<Integer> integerList = calculator
                .stream()
                .filter(n -> n % 3 == 0)
                .filter(m -> m % 5 == 0)
                .collect(Collectors.toList());

        System.out.println(integerList);



        for (int i = 0; i < number; i++) {
            if (number % 3 == 0) {
                System.out.println("Fizz");
            } else if (number % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(number);
            }

            calculator.add(number);

        }

    }

    int number;
    public void findNumber() {

    }
}
