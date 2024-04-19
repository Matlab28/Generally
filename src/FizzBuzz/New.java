package FizzBuzz;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class New {
    List<Integer> calculator;
    private int number;

    public New() {
        calculator = List.of(number);
    }

    public void calculating(Scanner scanner) {
        while (true) {
            System.out.print("Enter the number: ");
            try {
                setNumber(scanner.nextInt());
            } catch (Exception e) {
                throw new RuntimeException("Insert correct value...");
            }
            int k = 1;

            boolean b = number % 3 == 0;
            String f = String.valueOf(b);
            int s = Integer.parseInt(f);

            boolean y = number % 5 == 0;
            String g = String.valueOf(y);
            int z = Integer.parseInt(g);


            for (int i = 0; i < getNumber(); i++) {

                System.out.println(i++);;


                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FuzzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fuzz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(number);
                }

//                if (number % 3 == 0 && number % 5 == 0) {
//                    System.out.println("FuzzBuzz");
//                } else if (number % 3 == 0) {
//                    System.out.println("Fuzz");
//                } else if (number % 5 == 0) {
//                    System.out.println("Buzz");
//                } else {
//                    System.out.println(number);
//                }


//                List<? extends Serializable> reduce = (List<? extends Serializable>) calculator
//                        .stream()
//                        .filter(m -> m % 3 == 0)
//                        .filter(t -> t % 5 == 0)
//                        .map(n -> n % 3 == 0 ? "Fuzz" : n)
//                        .distinct()
//                        .reduce(k++, (a, j) -> a);
//
//                System.out.print(reduce + " ");
//                        .collect(Collectors.toList());
//
//                System.out.print(collect + " ");


//                List<? extends Serializable> collect = calculator
//                        .stream()
//                        .filter(n -> n % 3 == 0)
//                        .filter(m -> m % 5 == 0)
//                        .map(element -> (element % 3 == 0) ? "Fuzz" : element)
//
//                        .collect(Collectors.toList());
////                        .forEach(System.out::println);
////                        .reduce(k++, (a, b) -> a);
////                        .map(element2 -> (element2 % 5 == 0) ? "Buzz" : element2)
//
//
//                System.out.print(collect + " ");


//                Object reduce = calculator
//                        .stream()
//                        .filter(n -> n  % 3 == 0)
//                        .filter(m -> m % 5 == 0)
//                        .flatMap(n -> {
//                            if (number % 3 == 0 && number % 5 == 0) {
//                                System.out.println("FuzzBuzz");
//                            } else if (number % 3 == 0) {
//                                System.out.println("Fuzz");
//                            } else if (number % 5 == 0) {
//                                System.out.println("Buzz");
//                            } else {
////                                System.out.println(number);
//                            }
//                            return Stream.empty();
//                        })
//                        .reduce(k++, (a, b) -> a);
//
//                System.out.print(reduce + " ");


//
//                Integer reduce = calculator
//                        .stream()
//                        .filter(n -> n % 3 == 0)
//                        .map(r1 -> {
//                            String message1 = "Fuzz";
//                            return Stream.of(r1, message1);
//                        })
////                        .map(r2 -> {
////                            String message2 = "Buzz";
////                            return Stream.of(r2, message2);
////                        })
//                        .filter(m -> m % 5 == 0)
//                        .reduce(k++, (a, b) -> a);
//
//                System.out.print(reduce + " ");
            }

            if (number == 0) {
                break;
            }

//            if (number % 3 == 0 && number % 5 == 0) {
//                System.out.println("FuzzBuzz");
//            } else if (number % 3 == 0) {
//                System.out.println("Fuzz");
//            } else if (number % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(number);
//            }

            checking();
        }
    }


    public void checking() {
        StringBuilder builder = new StringBuilder();
        String replacement = "Fuzz";

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FuzzBuzz");
        } else if (number % 3 == 0) {

            System.out.println("Fuzz");
            boolean b = number % 3 == 0;
            String f = String.valueOf(b);
            builder.replace(Integer.parseInt(f), Integer.parseInt(replacement), null);
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }
    }


    public void checkItsTrue() {
        StringBuilder builder = new StringBuilder();
        String replacement = "Fuzz";
        boolean b = number % 3 == 0;
        String f = String.valueOf(b);
        int s = Integer.parseInt(f);
//        builder.replace(Integer.parseInt(f), Integer.parseInt(replacement), null);
    }

    @Override
    public String toString() {
        return "New{" +
                "calculator=" + calculator +
                ", number=" + number +
                '}';
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
