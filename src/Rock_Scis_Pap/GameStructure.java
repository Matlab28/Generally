package Rock_Scis_Pap;

import java.util.Random;
import java.util.Scanner;

public class GameStructure {

    public static int score1, score2 = 1;

    public void setScore(Scanner scanner) {
        while (true) {
            System.out.print("Enter only a or b: ");
            String user = scanner.next();

            if (user.equalsIgnoreCase("a")) {
                System.out.println("Your score is " + score1++);
            } else if (user.equalsIgnoreCase("b")) {
                System.out.println("My score is " + score2++);
            } else {
                System.out.println("Enter only a or b...");
            }
        }
    }



//    public void enter() {
//        while (true) {
//            Random random = new Random();
//            int computer = random.nextInt(3);
//
//            switch (computer) {
//                case 0:
//                    Essentials rock = Essentials.ROCK;
//                case 1:
//                    Essentials paper = Essentials.PAPER;
//                case 2:
//                    Essentials scissors = Essentials.SCISSORS;
//                default:
//                    System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_");
//            }
//
//            StringBuilder builder = new StringBuilder();
//            System.out.print("Enter yours (rock, scissors, or paper): ");
//            String userEnters;
//
//        }
//    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameStructure structure = new GameStructure();
        structure.setScore(scanner);
    }
}
