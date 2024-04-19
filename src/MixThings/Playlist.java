package MixThings;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Playlist {
    private Map<String, String> songsAndGenres = new HashMap<>();

    public void addSong(Scanner scanner) {
        System.out.print("How many songs do you want to add? - ");
        int numberOfSongs = scanner.nextInt();
        int count = 1;

        System.out.println("Add songs and after add their genres:");
        for (int i = 0; i < numberOfSongs; i++) {
            System.out.print("Add " + count++ + ". song: ");
            String songName = scanner.next();
            System.out.print("Add its genre (You can add rock&roll, rap, classical): ");
            String genre = scanner.next();

            // Store the song and its genre
            songsAndGenres.put(songName, genre);
        }

        System.out.println("\nYour playlist:");
        int result = 1;
        for (Map.Entry<String, String> entry : songsAndGenres.entrySet()) {
            System.out.println(result++ + ") " + entry.getKey());
        }

        System.out.println("All genres:");
        for (String genre : getAllGenres()) {
            System.out.println(genre);
        }
    }

    private LinkedList<String> getAllGenres() {
        LinkedList<String> genres = new LinkedList<>();

        for (String genre : songsAndGenres.values()) {
            if (!genres.contains(genre)) {
                genres.add(genre);
            }
        }

        return genres;
    }
}
