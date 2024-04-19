package MixThings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Object> combinedList = numbers.stream()
                .flatMap(number -> {
                    if (number % 2 == 0) {
                        return Stream.of(number, getSentenceForEven(number));
                    } else if (number > 5) {
                        return Stream.of(number, getSentenceForGreaterThanFive(number));
                    }
                    return Stream.empty();
                })
                .collect(Collectors.toList());

        combinedList.forEach(System.out::println);
    }

    public static String getSentenceForEven(int number) {
        // Example sentences for even numbers
        switch (number) {
            case 2:
                return "Two is even";
            case 4:
                return "Four is even";
            case 6:
                return "Six is even";
            case 8:
                return "Eight is even";
            case 10:
                return "Ten is even";
            default:
                return "Unknown number";
        }
    }

    public static String getSentenceForGreaterThanFive(int number) {
        // Example sentences for numbers greater than 5
        switch (number) {
            case 6:
                return "Six is greater than five";
            case 7:
                return "Seven is greater than five";
            case 8:
                return "Eight is greater than five";
            case 9:
                return "Nine is greater than five";
            case 10:
                return "Ten is greater than five";
            default:
                return "Unknown number";
        }
    }
}


