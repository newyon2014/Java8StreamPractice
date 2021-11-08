package StreamConcepts.Sort.AfterJava8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestHuman {
    public static void main(String[] args) {
        Human human1 = new Human("Sarah", 10);
        Human human2 = new Human("Jack", 1);

        List<Human> humans = Arrays.asList(human1, human2);

        //  With the introduction of Lambdas, we can now bypass the anonymous inner class and achieve the same result
       /* Collections.sort(humans, new Comparator<AfterJava8.Human>() {
            @Override
            public int compare(StreamConcepts.Sort.BeforeJava8.Human h1, Human h2) {
                return h1.getName().compareTo(h2.getName());
            }
        });*/
        humans.sort(
                (Human h1, Human h2) -> h1.getName().compareTo(h2.getName()));

        // We can further simplify the expression by not specifying the type definitions;
        // the compiler is capable of inferring these on its own:

        humans.sort((h1, h2) -> h1.getName().compareTo(h2.getName()));

        // sort using a Lambda Expression with a reference to a static method. Check the method in AfterJava8.Human class
        humans.sort((h1, h2) -> Human.compareByNameThenAge(human1, human2)); // --> method reference  Human::compareByNameThenAge

        //JDK 8 has also introduced a helper method for reversing the comparator.
        Comparator<Human> comparator
                = (h1, h2) -> h1.getName().compareTo(h2.getName());

        humans.sort(comparator.reversed());

        Comparator<Human> reverseNameComparator =
                (h1, h2) -> h2.getName().compareTo(h1.getName()); // h1 and h2 are reversed in the function

        List<Human> reverseSortedHumans = humans.stream().sorted(reverseNameComparator)
                .collect(Collectors.toList());

        //use a custom Comparator with the sorted() API:
        Comparator<Human> nameComparator = (h1, h2) -> h1.getName().compareTo(h2.getName());

        List<Human> sortedHumans =
                humans.stream().sorted(nameComparator).collect(Collectors.toList());

        //use the Comparator.comparing() method
        List<Human> sortedHumans2 = humans.stream()
                .sorted(Comparator.comparing(h -> h.getName())) // --> method reference Human::getName
                .collect(Collectors.toList());


    }
}
