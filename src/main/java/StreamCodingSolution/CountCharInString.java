package StreamCodingSolution;

public class CountCharInString {

    public long getCharCount ( String str , char c){
        return  str.chars()
                .filter(e -> (char) e == c )
                .count();
            }

    public static void main(String[] args) {

        String name = "Java interview Questions";
        // count the character i
        long count = name.chars()
                .filter(e -> (char) e == 'i')
                .count();
        // count the character i and s
        long count2 = name.chars()
                .filter(e -> (char) e == 'i' || (char)e == 's')
                .count();

    }
}
