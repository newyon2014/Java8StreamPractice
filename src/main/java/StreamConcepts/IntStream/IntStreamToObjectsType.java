package StreamConcepts.IntStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamToObjectsType {
    public static void main(String[] args) {

        //Boxed
        List<Integer> listofIntegers = IntStream.of(1, 2, 3, 4, 5)
                .boxed()
                .collect(Collectors.toList());

        // mapToObj
        List<Integer> listofIntegers2 = IntStream.of(1, 2, 3, 4, 5)
                .mapToObj(i -> Integer.valueOf(i)) // --> Method reference - Integer::valueOf
                .collect(Collectors.toList());

    }
}
