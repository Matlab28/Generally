package MixThings;

import java.util.Scanner;

public class Capital {
   private String name;

   public void firstLetter(String word) {
       StringBuilder builder =new StringBuilder();
       boolean capitalizeNext = true;

       for (int i = 0; i < word.length(); i++) {
           char c = word.charAt(i);
           if (Character.isWhitespace(c)) {
               capitalizeNext = true;
           } else if (capitalizeNext) {
              c =  Character.toUpperCase(c);
              capitalizeNext = false;
           }
           builder.append(c);
       }
       System.out.println(builder);
   }


    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
       String word = scanner.nextLine();
        Capital capital = new Capital();
        capital.firstLetter(word);
    }
}
