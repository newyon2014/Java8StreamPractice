package StreamCodingSolution;

import java.util.function.IntPredicate;

public class CountOfVowels {

    public static void main(String[] args) {

        IntPredicate vowel = new IntPredicate(){ //--> Anonymous inner class type implementation
            // You can also do  IntPredicate vowel = value -> value == 'a' || value == 'e' ||
            // value == 'i' || value == 'o' || value == 'u';

            @Override
            public boolean test(int value) {
                return value == 'a' || value == 'e' || value == 'i' || value == 'o' || value == 'u' ;
            }
        };
        String name = "Java interview Questions";
        long vowelCount = name.chars()
                .filter(vowel)
                .count();
        System.out.println(vowelCount);

    }
}
