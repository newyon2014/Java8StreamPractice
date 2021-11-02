package StreamCodingSolution.Reduce;

import java.util.Arrays;
import java.util.List;

public class ArrayStreamReduce {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        list.stream()
                .reduce(0, (l1, l2) -> l1 * l2);
    }
}
