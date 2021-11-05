package StreamConcepts.Optional;

import java.util.Optional;

public class StreamOptional {
    public static void main(String[] args) {
        String arr [] = new String[5];
        //System.out.println(arr[0].length());// --> Throws NullPointerException

        // To avoid this type of scenarios , we can use Optional Stream Functions.
        Optional<String> isNull = Optional.ofNullable(arr[2]);

        if(isNull.isPresent())
            System.out.println("Value is available");
        else
            System.out.println("Value is not available");

        isNull.ifPresent(e -> System.out.println(e.length()));

        // To create an empty container
        Optional<Object> nothing = Optional.empty();
        nothing.ifPresent(e -> System.out.println("Something is there"));

    }
}
