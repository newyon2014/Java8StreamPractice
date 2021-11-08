package StreamConcepts.StreamOf;

import java.util.stream.Stream;

public class SortAndFindFirst {

    public static void main(String[] args) {
        Stream.of("Ava", "Aneri", "Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
    }
}
