package StreamConcepts.Arrays;

import java.util.Arrays;

public class StreamFromArray {

    public static void main(String[] args) {

        String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah"};
        Arrays.stream(names)	// same as Stream.of(names)
                .filter(x -> x.startsWith("S"))
                .sorted()
                .forEach(System.out::println);

        Arrays.stream(new int[] {2, 4, 6, 8, 10})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);
    }
}
