package StreamCodingSolution.Sorting;

import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestNumber {
    //secondLargest([10, 40, 30, 20, 50]) ➞ 40

    public static int secondLargest(int[] n) {
        return IntStream.of(n).
                sorted().
                toArray()[n.length - 2];
    }

    public static int secondLargest2(int[] num) {
        int[] numSorted = Arrays.stream(num)
                // .boxed() --> Modified from the original Code
                .sorted()
                //    .sorted(Comparator.reverseOrder()) --> Modified from the original Code
                //    .mapToInt(Integer::intValue) --> Modified from the original Code
                .toArray();

        return numSorted[num.length-2]; // Updated to reflec the new change
    }
}
