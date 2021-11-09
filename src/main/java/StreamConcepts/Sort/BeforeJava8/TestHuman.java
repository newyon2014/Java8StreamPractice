package StreamConcepts.Sort.BeforeJava8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestHuman {
    public static void main(String[] args) {
        Human human1 = new Human("Sarah", 10);
        Human human2 = new Human("Jack", 1);

        List<Human> humans = Arrays.asList(human1, human2);

        Collections.sort(humans, new Comparator<Human>() {
            @Override
            public int compare(Human h1, Human h2) {
                return h1.getName().compareTo(h2.getName());
            }
        });
    }
}
