package MusicPlayer;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class BackData {
    LinkedList<String> playlistAdding;
    LinkedList<String> playlistName;
    Map<String, String> separate;
    private String title, genre, album, playlist, favorites;

    public BackData() {
        playlistAdding = new LinkedList<>();
        separate = new LinkedHashMap<>();
        playlistAdding = new LinkedList<>();
    }

    public void playMusic(Scanner scanner) {
        while (true) {
            System.out.print("Add the name of the song: ");
            setTitle(scanner.next());

            if (getTitle().equalsIgnoreCase("stop")) {
                separate.put(getGenre(), getTitle());
                cretePlaylist(scanner);
                break;
            }

            System.out.println("Add the genre of the song: ");
            System.out.print("Pop, Rock, Rap, or Jazz - ");
            setGenre(scanner.next());
        }
    }

    public void cretePlaylist(Scanner scanner) {
        System.out.print("\nSet a name for your playlist: ");
        String name = scanner.next();

        addSong(scanner);
    }

    public void addSong(Scanner scanner) {
        while (true) {
            System.out.print("Add the title of the song for adding playlist (type 'quit' to stop): ");
            String songs = scanner.next();



            if (songs.equals(getTitle())) {
                System.out.println("'" + songs + "' added your playlist.");
                playlistAdding.add(songs);
            } else {
                System.out.println("Enter the right name of the song...");
            }

            if (songs.equalsIgnoreCase("quit")) {
                break;
            }

        }

        System.out.println("\nList of your songs:");
        int count = 1;

        for (String listing : playlistAdding) {
            System.out.println(count++ + ". " + listing);
        }
    }

    public void displayIt() {
        for (Map.Entry<String, String> items : separate.entrySet()) {
            System.out.println("Genre of the song: " + items.getKey());
            System.out.println("Title of the son: " + items.getValue());
            System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getPlaylist() {
        return playlist;
    }

    public void setPlaylist(String playlist) {
        this.playlist = playlist;
    }

    public String getFavorites() {
        return favorites;
    }

    public void setFavorites(String favorites) {
        this.favorites = favorites;
    }
}
