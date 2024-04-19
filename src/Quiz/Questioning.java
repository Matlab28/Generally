package Quiz;

import java.util.Scanner;

public class Questioning {
    private final int score = 1;
    private String answer;

    public void question(Scanner scanner) {
        System.out.println("Who wrote 'Hamlet'?");
        setAnswer(scanner.nextLine());
        System.out.println("Who composed 'Four Seasons'?");
        setAnswer(scanner.nextLine());
        answerOfQuiz();
    }

    public void answerOfQuiz() {
        switch (getAnswer()) {
            case "William Shakespeare":
                System.out.println("your answer is true");
                break;
            case "Antonio Vivaldi":
                System.out.println("That's correct!");
                break;
            default:
                System.out.println("Unfortunately it's the wrong answer...");
                break;
        }
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getScore() {
        return score;
    }
}
