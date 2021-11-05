package StreamConcepts.IntStream;

import java.util.stream.IntStream;

public class ConvertInttoArray {
    public static void main(String[] args) {

        int [] arr = IntStream.rangeClosed(1,5)
                              .toArray();
    }
}
