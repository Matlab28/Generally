package MixThings;

import java.util.Scanner;

public class RandomClass {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Add how many songs do you want to add? - ");
        int[] size = new int[scanner.nextInt()];

        int count = 1;
        for (int i = 0; i < size.length; i++) {
            System.out.println("Add " + count++ + ". song: " + (scanner.next()));
        }
    }
}
