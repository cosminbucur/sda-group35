package com.sda.advanced.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoWordCount {

    // some words in a file, count occurrences
    // map ("word", 3)

    public static void main(String[] args) {
        Path path = Paths.get("/home/cosbuc/dev/sda/sda-group35/java-advanced/src/main/resources/countWords.txt");
        try {
            countWords(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // TODO: fix this
    private static Map<String, Integer> countWords(Path path) throws IOException {
        // read file
        List<String> lines = Files.readAllLines(path);

        Map<String, Integer> wordOccurrences = new HashMap<>();

        // iterate lines
        for (String line: lines) {
            // read all words in a line

            // split line in words
            String[] words = line.split(" ");

            // iterate words
            for (String word : words) {
                int count = 1;

                if (wordOccurrences.containsKey(word)) {
                    wordOccurrences.put(word, count + 1);
                } else {
                    wordOccurrences.put(word, count);
                }

            }
        }
        return wordOccurrences;
    }
}
