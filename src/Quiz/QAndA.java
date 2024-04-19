package Quiz;

import java.util.Scanner;

public class QAndA {
    public static void main(String[] args) {
        Questioning questioning =  new Questioning();
        Scanner scanner = new Scanner(System.in);
        questioning.question(scanner);
    }
}
