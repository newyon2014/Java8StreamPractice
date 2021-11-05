package StreamConcepts.Arrays;

import java.util.Arrays;

public class StreamToArray {
    public static void main(String[] args) {
        String lines = "I love Java 8 Stream!";

        String result [] = Arrays.stream(lines.split(" "))
                .map(word -> word.toUpperCase()) // Method reference option - String::toUpperCase
                .toArray(size -> new String [size]); // Method reference option - String::new

        for (String str:result) {
            System.out.println(str);
        }
    }
}
