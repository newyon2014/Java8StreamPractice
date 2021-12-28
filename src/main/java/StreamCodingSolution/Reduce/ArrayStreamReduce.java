package StreamCodingSolution.Reduce;

import java.util.Arrays;
import java.util.List;

public class ArrayStreamReduce {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        int number = list.stream()
          //      .reduce(1, (l1, l2) -> l1 * l2);
                  .reduce((l1, l2) -> l1 * l2)
                  .get();

        System.out.println(number);
    }
}
