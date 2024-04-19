package FizzBuzz;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FromZero {
    List<Integer> calculator;
    StringBuilder builder;

    private int number;

    public FromZero() {
        calculator = Arrays.asList(number);
        builder = new StringBuilder();
    }

    public void calculating(Scanner scanner) {
        while (true) {
            System.out.print("Enter the number: ");
            setNumber(scanner.nextInt());
            int kjk = 1;

//            calculator.add(getNumber());

            for (int i = 0; i < getNumber(); i++) {
                System.out.print((kjk++) + " ");
            }

//            for (int i = 1; i <= getNumber(); i++) {
//                System.out.println((i = i +1) + " ");
//                for (int j = 1; j <= calculator.size(); j++) {
//                    System.out.print((j++) + " ");
//                }
//            }

            displayResult();
            if (number == 0) {
                break;
            }

//            if (number % 3 == 0 && number % 5 == 0) {
////                String jh = "FuzzBuzz";
////                jh.equals(number);
//                System.out.println("FuzzBuzz");
//
//            } else if (number % 3 == 0) {

                builder.append("Fuzz");




                boolean b = number % 3 ==0;
                String s = String.valueOf(b);
                int i = Integer.parseInt(s);



                String msg;
//
//                switch (number) {
//                    case 1:
//                        System.out.println("Fuzz");
//
//                }
//                builder.replace((i), i, "Fuzz");







//                System.out.println("Fuzz");
//
//            } else if (number % 5 == 0) {
//                System.out.println("Buzz");
//
//            } else{
//                System.out.println(number);
//
//            }
        }
    }




    public void displayResult() {
        for (Integer numbers : calculator) {
            if (numbers % 3 == 0) {
                builder.append("Fuzz");
//                System.out.println("Fuzz");
            } else if (numbers % 5 == 0) {
                builder.append("Buzz");
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
