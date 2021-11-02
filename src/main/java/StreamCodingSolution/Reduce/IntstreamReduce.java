package StreamCodingSolution.Reduce;

import java.util.stream.IntStream;

public class IntstreamReduce {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};

        IntStream.of(arr)
                .reduce((a1, a2) -> a1 * a2)
                .orElse(-1);

    }
}
