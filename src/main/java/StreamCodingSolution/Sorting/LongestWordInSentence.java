package StreamCodingSolution.Sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;


public class LongestWordInSentence {
    public static String longestWord(String phrase) {
        return Arrays.stream(phrase.split(" "))
                .max(Comparator.comparing(s -> s.length())) // --> Method reference - String::length
                .get();
    }

}
