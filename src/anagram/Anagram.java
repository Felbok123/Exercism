package anagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {

    private String word;


    public Anagram(String input) {
        word = input;

    }

    public List<String> match(List<String> testList) {
        List<String> anagramList = new ArrayList<>();
        List<String> wordsToRemove = new ArrayList<>();
        char[] inputWord = word.toLowerCase().toCharArray();
        char[] wordToTest;

        testList.stream().filter(words -> words.length() == word.length()).forEach(anagramList::add);

        if (!anagramList.isEmpty()) {
            for (String words : anagramList) {
                if (words.toLowerCase().equals(word)) {
                    wordsToRemove.add(words);
                }

                wordToTest = words.toLowerCase().toCharArray();
                Arrays.sort(inputWord);
                Arrays.sort(wordToTest);

                for (int i = 0; i < word.length(); i++) {
                    if (inputWord[i] != wordToTest[i]) {
                        if (!anagramList.isEmpty()) {
                            wordsToRemove.add(words);
                        }
                    }
                }
            }
            anagramList.removeAll(wordsToRemove);
        }
        return anagramList;
    }

}
