package MusicPlayer;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Data {
    Map<String, String> song;
    LinkedList<String> list;
    private String artist, title, genre, album, getMusic;

    public Data() {
        song = new LinkedHashMap<>();
        list = new LinkedList<>();
    }

    public void playlist(Scanner scanner) {
        while (true) {
            System.out.print("Enter the title of song: ");
            setTitle(scanner.next());
            System.out.println("Enter genre of song:");
            System.out.print("Pop, Rock, Rap, or Jazz - ");
            setGenre(scanner.next());

            if (getTitle().equalsIgnoreCase("all") || getGenre().equalsIgnoreCase("all")) {
                System.out.print("Enter the genre, which you want to see: ");
                setGetMusic(scanner.next());
                chooseGenre();
            }

            song.put(getGenre(), getTitle());


            for (Map.Entry<String, String> listOfSongs : song.entrySet()) {
                System.out.println("Song's title: " + listOfSongs.getValue());
                System.out.println("Song's genre: " + listOfSongs.getKey());
            }
            System.out.println();
        }
    }

    public void chooseGenre() {
        if (getMusic.equalsIgnoreCase("pop")) {
            System.out.println("The name of songs:");
            for (Map.Entry<String, String> get : song.entrySet()) {
                System.out.println("The name of songs: " + get.getKey());
            }
        }
    }

    public String getGetMusic() {
        return getMusic;
    }

    public void setGetMusic(String getMusic) {
        this.getMusic = getMusic;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
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
}
