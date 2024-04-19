package MixThings;

public class CheckRegex {
    private String letters = "[A-Za-z]+", numbers = ".*\\d+.*";

    public void pass() {
        String c = "Hello World";
        String b = "1212";
        System.out.println("text - " + c);
        if (c.matches(letters)) {
            System.out.println("It contains!");
        }

    }

    public String getLetters() {
        return letters;
    }

    public String getNumbers() {
        return numbers;
    }

    public static void main(String[] args) {
        CheckRegex checkRegex = new CheckRegex();
        checkRegex.pass();
    }
}
