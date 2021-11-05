package StreamConcepts.Arrays;

import java.util.Arrays;
import java.util.List;

public class StreamFromList {

    public static void main(String[] args) {

        List<String> people = Arrays.asList("Al", "Ankit", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah");
        people
                .stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("a"))
                .forEach(System.out::println);

    }
}
