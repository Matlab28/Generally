package MixThings;

import java.util.Random;

public class RandomBound {
    public static void main(String[] args) {
        Random random = new Random();

        int min = 1000;
        int max = 9999;
        int digits = random.nextInt(max - min + 1) + min;

        System.out.println(digits);
    }
}
