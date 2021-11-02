package StreamCodingSolution.Reduce;

import java.util.stream.IntStream;

public class MapStringCharWithArrayValue {

//    Create a function that takes two inputs: idx (an array of integers) and str (a string). The function
//    should return another string with the letters of str at each index in idx in order.

//    indexFilter([7, -1, 5, 1], "She is the love of my love") ➞ "tesh"
//    indexFilter([4, -7, -13, -11, -2, 0], "Relax and stay calm to avoid failures") ➞ "xavier"
//    indexFilter([9, -9, 2, 27, 36, 6, 5, 13, -1, 2, 0, 30, 2],
//                        "That's life, I've got you under my skin") ➞ "frank sinatra"

    public static String indexFilter(int[] x, String s) {
        return IntStream.of(x)
                .mapToObj(i -> String.valueOf(s.toLowerCase().charAt(i < 0 ? s.length() + i : i)))
                .reduce((c, str) -> str.concat(c)) // --> Method reference String::concat
                .get();
    }
}
