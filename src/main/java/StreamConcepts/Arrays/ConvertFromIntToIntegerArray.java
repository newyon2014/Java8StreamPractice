package StreamConcepts.Arrays;

import java.util.Arrays;

public class ConvertFromIntToIntegerArray {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
       Integer[] result =  Arrays.stream(arr)
                .map(i -> i*i)
                .boxed()
                .toArray(s -> new Integer[s]); // Method reference option - Integer::new             .
    }
}
