package StreamConcepts.StreamOf;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOfVsArraysStream {
    public static <stream> void main(String[] args) {
        //Non-Primitive types
        // Stream.Of() calls the Arrays.Stream() method ( see implementation )
        // both Stream.of() and Arrays.Stream() returns the same Stream<T> type.

        Integer array [] = {1,2,3,4,5};
      Stream.of(array) // returns Stream<Integer> and prints 1,2,3,4,5
                .forEach(i -> System.out.println(i)); // --> method reference System.out::println

        Arrays.stream(array)    // returns Stream<Integer> and prints 1,2,3,4,5
                .forEach(System.out::println);

        //Primitive types
        int array2 [] = {1,2,3,4,5};

        Stream.of(array2)  // returns Stream<int[]>
                .forEach(System.out::println); // Prints [ I@27dc57

        IntStream.of(array2) // returns IntStream and prints 1,2,3,4,5
                .forEach(i -> System.out.println(i)); // --> method reference System.out::println

        // Since Stream.of() return Stream<int[]>, we need to convert to Intstream before we consume

        Stream.of(array2)
                .flatMapToInt(i -> Arrays.stream(i)) // --> method reference Arrays::stream
                .forEach(i -> System.out.println(i)); // --> method reference System.out::println

    }
}
