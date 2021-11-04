package StreamCodingSolution;

import java.util.Arrays;
import java.util.OptionalDouble;

public class ArrayAverage {

    public static void main(String[] args) {

        int num[] = {2,4,3,6,7,8,2,4,1,9};

        OptionalDouble sumOfElements = Arrays.stream(num).average();
        System.out.println(sumOfElements.getAsDouble()/ num.length);

    }
}
