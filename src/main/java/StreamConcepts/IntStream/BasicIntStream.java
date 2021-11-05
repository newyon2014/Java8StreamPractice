package StreamConcepts.IntStream;

import java.util.stream.IntStream;

public class BasicIntStream {

    public static void main(String[] args) {

        IntStream
                .range(1, 10)
                .forEach(System.out::print);
        System.out.println();

    }
}
