package MixThings;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class RemoveDuplicatesFromSentence {

    public static void main(String[] args) {
        String sentence = "This is a sample sentence with repeated words. This sentence has repeated words.";

        Map<String, Integer> wordCountMap = new HashMap<>();
        StringTokenizer tokenizer = new StringTokenizer(sentence, " ");

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // Printing the sentence without repeated words
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.print(entry.getKey() + " ");
        }
    }
}
