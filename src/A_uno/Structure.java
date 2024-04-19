package A_uno;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Structure {
    private String usernames;
    private int players, score;

    public void game(Scanner scanner) {
        while (true) {
            System.out.print("How many players you are (2 or 4)? ");
            List<Integer> gamePlayers = new ArrayList<>();
            setPlayers(scanner.nextInt());
            gamePlayers.add(getPlayers());

            if (getPlayers() != 2 && getPlayers() != 4) {
                System.out.println("Only 2 or 4 players can play...");
                continue;
            }

            System.out.println("Please enter the players names:");
            int count = 1;

            for (int i = 0; i < gamePlayers.size(); i++) {
                System.out.println("Enter the " + (count++) + ". name: " + (scanner.next()));
            }

            gamePlayers
                    .forEach(System.out::println);
        }
    }

    public void cards() {
        System.out.println("We have 'red, blue, green, and yellow' colors.");
        Random random = new Random();
        int colors = random.nextInt(4);
        String randomColors;
        String randomCards;

        switch (colors) {
            case 0:
                randomColors = Cards.RED.getValue();
                break;
            case 1:
                randomColors = Cards.GREEN.getValue();
                break;
            case 2:
                randomColors = Cards.YELLOW.getValue();
                break;
            case 3:
                randomColors = Cards.BLUE.getValue();
                break;
            default:
                System.out.println("This color isn't exist...");
        }

        int mainCards = random.nextInt(4);

        switch (mainCards) {
            case 0:
                randomCards = Cards.REVERSED.getValue();
                break;
            case 1:
                randomCards = Cards.BLOCK.getValue();
                break;
            case 2:
                randomCards = Cards.TWO_PLUS.getValue();
                break;
            case 3:
                randomCards = Cards.FOUR_PLUS.getValue();
                break;
            default:
                System.out.println("Other cards don't exist...");
        }

        int numbers = random.nextInt(10);

        if (getPlayers() == 2) {
            for (int i = 0; i < 2; i++) {
                for (int j = 1; j < 7; j++) {
//                    System.out.println(randomColors + " " + randomCards);
                }
            }
        }
    }

    public String getUsernames() {
        return usernames;
    }

    public void setUsernames(String usernames) {
        this.usernames = usernames;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    public static void main(String[] args) {
        Structure structure = new Structure();
        Scanner scanner = new Scanner(System.in);
        structure.game(scanner);
    }
}
