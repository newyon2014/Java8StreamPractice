package StreamConcepts.IntStream;

import java.util.stream.Stream;

public class IntegerTointArray {
    public static void main(String[] args) {
        Stream<Integer> streamInteger = Stream.of(1, 2, 3, 4, 5);

        int [] streamint = streamInteger.mapToInt(x -> x).toArray();
    }
}
