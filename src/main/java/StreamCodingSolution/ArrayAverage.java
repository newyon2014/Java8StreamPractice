package StreamCodingSolution;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class ArrayAverage {

    public static void main(String[] args) {

        int num[] = {2,4,3,6,7,8,2,4,1,9};

        OptionalDouble sumOfElements = Arrays.stream(num).average();

        OptionalDouble sumOfElements2 = Stream.of(num)
                .flatMapToInt(n -> Arrays.stream(n)) // Arrays:stream
                .average();

        System.out.println(sumOfElements.getAsDouble()/ num.length);

    }
}
