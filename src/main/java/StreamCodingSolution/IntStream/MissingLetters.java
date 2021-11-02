package StreamCodingSolution.IntStream;

import java.util.stream.IntStream;

public class MissingLetters {
    // getMissing("abcdefgpqrstuvwxyz") ➞ "hijklmno"
    public static String getMissing(String s) {
        return IntStream.rangeClosed('a', 'z')
                .mapToObj(c -> Character.toString((char)c))
                .filter(c -> !s.contains(c)).
                reduce(String::concat). // --> ((c,str) -> c.concat(str))
                orElse("");
    }

   // missingLetter("abdefg") ➞ "c"
    //missingLetter("mnopqs") ➞ "r"
    //missingLetter("tuvxyz") ➞ "w"
    //missingLetter("ghijklmno") ➞ "No Missing Letter"
   public static String missingLetter(String str) {
       return IntStream.range(0, str.length() - 1)
               .filter(i -> str.charAt(i+1)- str.charAt(i)!=1)
               .mapToObj(i -> Character.toString((char)(str.charAt(i) + 1)))
               .findFirst()
               .orElse("No Missing Letter");
   }


}
