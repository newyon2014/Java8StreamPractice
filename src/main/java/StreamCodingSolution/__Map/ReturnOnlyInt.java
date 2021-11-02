package StreamCodingSolution.__Map;

import java.util.*;

public class ReturnOnlyInt {
    //    returnInts(["hello", 81, "basketball", 123, "fox"]) ➞ [81, 123]
    //    returnInts([10, "121", 56, 20, "car", 3, "lion"]) ➞ [10, 56, 20, 3]
    //    returnInts(["String",  true,  3.3,  1]) ➞ [1]

    public static int[] returnInts(Object[] arr) {
        return Arrays.stream(arr)
                .filter(ar -> ar instanceof Integer)
                .mapToInt(i -> (int) i)
                .toArray();
    }
}
