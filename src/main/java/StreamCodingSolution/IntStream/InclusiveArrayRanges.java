package StreamCodingSolution.IntStream;
import java.util.stream.IntStream;

public class InclusiveArrayRanges {
    //    inclusiveArray(1, 5) ➞ [1, 2, 3, 4, 5]
    //    inclusiveArray(2, 8) ➞ [2, 3, 4, 5, 6, 7, 8]
    //    inclusiveArray(10, 20) ➞ [10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
    //    inclusiveArray(17, 5) ➞ [17]
    public static int[] inclusiveArray(int startNum,int endNum) {
        return startNum > endNum? new int[] {startNum}: IntStream.rangeClosed(startNum,endNum)
            //    .boxed() --> This one is not required from the original coding
           //     .mapToInt(Integer::intValue) --> This one is not required from the original coding
                .toArray();
    }
}
