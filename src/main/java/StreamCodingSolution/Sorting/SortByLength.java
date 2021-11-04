package StreamCodingSolution.Sorting;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.stream.Stream;

public class SortByLength {
//    Create a function that takes a string and returns a string ordered by the length of the words. From
//    shortest to longest word. If there are words with the same amount of letters, order them alphabetically.

//    sortByLength("Hello my friend") ➞ "my Hello friend"
//    sortByLength("Have a wonderful day") ➞ "a day Have wonderful"

    public static String sortByLength(String str) {
        return Arrays.stream(str.split("\\s"))
                .sorted((s1, s2) -> s1.length() - s2.length())
                .sorted((s1, s2) -> s1.compareToIgnoreCase(s2)) // -> Method reference - String::compareToIgnoreCase
                .collect(Collectors.joining(" "));
    }

    public static String sortByLength2(String s) {
        return String.join(" ", Stream.of(s.split(" "))
                .sorted(Comparator.comparingInt(String::length)
                        .thenComparing(String::toLowerCase,
                                (a, b) -> a.toString().compareTo(b.toString())))
                .toArray(String[]::new));
    }


}
