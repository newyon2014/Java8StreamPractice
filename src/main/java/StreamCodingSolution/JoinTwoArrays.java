package StreamCodingSolution;

import java.util.Arrays;
import java.util.stream.Stream;

public class JoinTwoArrays {

    public static void main(String[] args) {

        String firstNameList [] = {"Lisa","James","Rick"};
        String secondNameList [] = {"Train","Cars","Planes"};

        Stream<String> firstStream = Arrays.stream(firstNameList);
        Stream<String> secondStream = Arrays.stream(secondNameList);

        String fullList [] = Stream.concat(firstStream,secondStream)
                .toArray(String[]::new); // --> Without method reference - size -> new String [size]

        for (String s:fullList) {
            System.out.println(s);
        }
    }
}
