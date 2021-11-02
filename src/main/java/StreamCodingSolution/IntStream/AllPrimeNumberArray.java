package StreamCodingSolution.IntStream;

import java.util.stream.IntStream;
import java.util.Arrays;

public class AllPrimeNumberArray {
    //allPrime([7, 5, 2, 4, 6]) ➞ false
    //
    //allPrime([2, 3, 5, 7, 13, 17, 19, 23, 29]) ➞ true

    public static boolean allPrime(int[] arr) {
        return (int)Arrays.stream(arr)
                .filter(i -> reallyPrime(i))
                .count() == arr.length;
    }
    public static boolean reallyPrime(int n){
        if(n <=1)
            return false;
        return !IntStream.rangeClosed(2,n/2)
                .anyMatch(i -> n%i==0);
    }

    public static boolean allPrime2(int[] r) {
        return IntStream.of(r).allMatch(n -> n != 1 &&
                IntStream.range(2, n).allMatch(e -> n % e != 0));
    }



    public static void main(String[] args) {


    }
}
