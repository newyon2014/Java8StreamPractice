package StreamCodingSolution.IntStream;

import java.util.stream.IntStream;

public class LetterDistance {
//    letterDistance("sharp", "sharq") ➞ 1
//    letterDistance("abcde", "Abcde") ➞ 32
//    letterDistance("abcde", "bcdef") ➞ 5
//    Given two words, the letter distance is calculated by taking t
//    he absolute value of the difference in character codes and summing up the difference.

    public static int letterDistance(String str1, String str2) {
        int charsDist = IntStream.range(0, Math.min(str1.length(), str2.length()))
                .map(i -> Math.abs(str1.charAt(i) - str2.charAt(i)))
                .sum();
        return charsDist + Math.abs(str1.length() - str2.length());
    }


}
