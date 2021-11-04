package StreamCodingSolution.Sorting;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IsStringInOrder {
//    isInOrder("abc") ➞ true
//    isInOrder("edabit") ➞ false
//    isInOrder("123") ➞ true

    public static boolean isInOrder(String str) {
        return str.equalsIgnoreCase(Stream.of(str.split(""))
                .sorted()
                .collect(Collectors.joining("")));

    }
}
