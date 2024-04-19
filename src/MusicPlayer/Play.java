package MusicPlayer;

import java.util.Scanner;

public class Play {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Data data =  new Data();
//        System.out.println("Whenever you want to stop adding music, just write 'stop'.");
//        System.out.println("If you want to see songs because of their genres, just write 'all'.");
//        data.playlist(scanner);

        System.out.println("Whenever you want to see playlist, just write 'display'.");
        BackData data = new BackData();
        data.playMusic(scanner);
        System.out.println("If you want to see playlist, just write 'display'.");
        String displayOrNot = scanner.next();

        if (displayOrNot.equalsIgnoreCase("display")) {
            data.displayIt();
        } else {
            System.out.println("Thank you for using!");
        }
    }
}
